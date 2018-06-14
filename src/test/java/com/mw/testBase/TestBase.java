package com.mw.testBase;

import java.io.File;
import java.time.LocalDate;
import java.util.Properties;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import com.mw.constants.AppConstant;
import com.mw.constants.PathConstants;
import com.mw.tests.DashboardPageTest;
import com.mw.utils.BaseUtil;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import junit.framework.TestSuite;

/**
 * 
 * @author Sumit Srivastava
 *
 */

public class TestBase extends TestSuite {

	private static Logger logger = Logger.getLogger(TestBase.class);

	public static long WAIT = 60;

	protected long timeout = PathConstants.defaultTimeout;
	protected long pollingFrequency = PathConstants.defaultPollingFrequency;
	protected static String folderName = PathConstants.SCREENSHOT_DIRECTORY_PATH;
	// private static WebDriverWait webDriverWait;
	protected static AppiumDriver<MobileElement> driver;
	protected Properties configProperties;
	protected static Properties testProperties;
	protected static String platform;
	protected WebDriverWait webDriverWait;
	
	protected TouchAction action;

	/*
	 * Assign all the basic confugrations and properties file to use it in the test classes.
	 * 
	 */
	public TestBase() throws Exception {
		String log4jConfPath = "src/main/resources/log4j.properties";
		PropertyConfigurator.configure(log4jConfPath);
		logger.info("Initializing Driver and Initiate Test Suite..");

		configProperties = BaseUtil.getConfigProperties();
		platform = System.getProperty("platform");

		if (platform == null || platform.trim().isEmpty()) {
			platform = configProperties.getProperty(AppConstant.RUN_PLATFORM);
		}
		String platformConfigFile = PathConstants.PROPERTIES_BASEPATH + PathConstants.CONFIG_DIR;
		configProperties.putAll(BaseUtil.readPropertyFile(platformConfigFile, platform));
		String gloablFileName = PathConstants.PROPERTIES_BASEPATH + PathConstants.GLOBAL_DIR;
		testProperties = BaseUtil.readPropertyFile(gloablFileName, PathConstants.COMMON);
		testProperties.putAll(BaseUtil.readPropertyFile(gloablFileName, platform));
		driver = (AppiumDriver<MobileElement>) BaseUtil.returnDriver(platform);
		logger.info("Initializing Driver with Driver Info: " + driver);
		webDriverWait = new WebDriverWait(driver, 20);
		action = new TouchAction(driver);
	}

	/*
	 * 
	 * This is a @BeforeSuite method
	 */
	@BeforeSuite
	public static void testStart() throws Exception {
		folderName = folderName.replace("##Date##", LocalDate.now().toString());
		BaseUtil.recursiveDelete(new File(folderName));
	}

	/*
	 * 
	 * This is a @BeforeClass method
	 */
	@BeforeClass
	public static void displayDashboardPage() throws Exception {
		logger.info("displayDashboardPage Method Called..");
		DashboardPageTest dashboardPageTest = new DashboardPageTest();
		dashboardPageTest.TC01_DashboardPage();
	}
	
	/*
	 * 
	 * This is a @AfterSuite method
	 */
	@AfterSuite
	public static void tearDown() {
		driver.quit();
	}

}
