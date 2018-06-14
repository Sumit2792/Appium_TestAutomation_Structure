package com.mw.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.log4j.Logger;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import com.gargoylesoftware.htmlunit.ElementNotFoundException;
import com.mw.constants.AppConstant;
import com.mw.constants.PathConstants;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.remote.MobilePlatform;

/**
 * 
 * @author Sumit Srivastava
 *
 */

public class BaseUtil {

	public static Logger logger = Logger.getLogger(BaseUtil.class);

	private static String resourceFilePath = PathConstants.PROPERTIES_BASEPATH + PathConstants.CONFIG_DIR;
	private static AppiumDriver<MobileElement> driver;
	private static String folder_name = PathConstants.SCREENSHOT_DIRECTORY_PATH;
	private static DateFormat dateFormat;
	private static Properties configProperties = BaseUtil.readPropertyFile(resourceFilePath, PathConstants.COMMON);

/*
 * 
 * this method reads the properties of property file
 */
	public static String readProperty(String property) {
		Properties prop;
		String value = null;
		try {
			prop = new Properties();
			prop.load(new FileInputStream(
					new File(resourceFilePath + PathConstants.COMMON + PathConstants.EXT_PROPERTIES)));

			value = prop.getProperty(property);

			if (value == null || value.isEmpty()) {
				throw new Exception("Value not set or empty");
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return value;
	}

	/*
	 * 
	 * this method reads the propertie file
	 */
	public static Properties readPropertyFile(String filePath, String fileName) {
		if (filePath == null || filePath.trim().isEmpty()) {
			filePath = filePath + PathConstants.PROPERTIES_BASEPATH + PathConstants.GLOBAL_DIR;
		}
		if (fileName == null || fileName.trim().isEmpty()) {
			fileName = fileName + PathConstants.COMMON + PathConstants.EXT_PROPERTIES;
		}
		Properties prop = new Properties();
		fileName = fileName + PathConstants.EXT_PROPERTIES;
		logger.info(filePath + fileName);
		try {
			prop.load(new FileInputStream(new File(filePath + fileName)));

			if (prop == null || prop.isEmpty()) {
				throw new Exception("Property file not set or empty");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return prop;
	}

	/*
	 * 
	 * Initialize driver value on the basis of platform.
	 */
	public static AppiumDriver<MobileElement> returnDriver(String platform) throws Exception {
		DesiredCapabilities capabilities = new DesiredCapabilities();
		if (Boolean.parseBoolean(configProperties.getProperty(AppConstant.RUN_HYBRID))) {
			capabilities.setCapability(MobileCapabilityType.AUTO_WEBVIEW, true);
		}
		String completeURL = BaseUtil.readProperty(AppConstant.APPIUM_DRIVER_URL);
		configProperties.putAll(BaseUtil.readPropertyFile(resourceFilePath, platform));
		switch (platform.toLowerCase()) {
		case "ios":
			capabilities.setCapability(MobileCapabilityType.APP,
					new File(configProperties.getProperty(AppConstant.APP_IOS_PATH)).getAbsolutePath());
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,
					configProperties.getProperty(AppConstant.DEVICE_IOS_NAME));
			capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION,
					configProperties.getProperty(AppConstant.PLATFORM_IOS_VERSION));
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.IOS);
			capabilities.setCapability(MobileCapabilityType.PLATFORM, MobilePlatform.IOS);
			if (Boolean.parseBoolean(configProperties.getProperty(AppConstant.PLATFORM_IOS_XCODE))) {
				capabilities.setCapability(MobileCapabilityType.AUTOMATION_NAME, AppConstant.XCUITEST);
			}
			driver = new IOSDriver<MobileElement>(new URL(completeURL), capabilities);
			break;
		case "android":
			capabilities.setCapability(MobileCapabilityType.APP,
					new File(configProperties.getProperty(AppConstant.APP_ANDROID_PATH)).getAbsolutePath());
			capabilities.setCapability(MobileCapabilityType.DEVICE_NAME,
					configProperties.getProperty(AppConstant.DEVICE_ANDROID_NAME));
			capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, MobilePlatform.ANDROID);
			capabilities.setCapability(MobileCapabilityType.PLATFORM, MobilePlatform.ANDROID);
			capabilities.setCapability(AppConstant.AUTOACCEPTALERTS, true);
			driver = new AndroidDriver<MobileElement>(new URL(completeURL), capabilities);
			break;
		default:
			throw new Exception("Platform not supported");
		}
		return driver;
	}

	/*
	 * 
	 * this method capture screenshots
	 */
	public static void captureScreenShots() throws IOException {
		File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		folder_name = folder_name.replace("##Date##", LocalDate.now().toString());
		dateFormat = new SimpleDateFormat("dd-MMM-yyyy__hh_mm_ssaa");
		new File(folder_name).mkdir();
		String file_name = dateFormat.format(new Date()) + ".png";
		FileUtils.copyFile(f, new File(folder_name + "/" + file_name));
	}

	/*
	 * 
	 * this method use to verify displayed elements
	 */
	public static boolean verifyElementDisplayed(String objLocator) {
		logger.debug("Executing Test Step::" + new Object() {
		}.getClass().getEnclosingMethod().getName());

		WebElement element = getElementAfterLoaded(objLocator);
		return element.isDisplayed() ? true : false;
	}

	public static WebElement getElementAfterLoaded(final String objLocator) {
		logger.debug("Executing Test Step::" + new Object() {
		}.getClass().getEnclosingMethod().getName());

		By byValue = getLocator(objLocator);
		isElementLoaded(byValue);
		return driver.findElement(byValue);
	}

	public static By getLocator(String objLocator) {
		logger.debug("Executing Test Step::" + new Object() {
		}.getClass().getEnclosingMethod().getName());

		String[] str = objLocator.split("===");
		logger.info("Object Identifier " + str[0] + "\t Object Identifier Value " + str[1]);
		By byValue = null;
		switch (str[0].toUpperCase()) {
		case "ID":
			byValue = By.id(str[1]);
			break;
		case "XPATH":
			byValue = By.xpath(str[1]);
			break;
		case "NAME":
			byValue = By.name(str[1]);
			break;
		case "LINKTEXT":
			byValue = By.linkText(str[1]);
			break;
		case "CSS":
			byValue = By.cssSelector(str[1]);
			break;
		case "CLASSNAME":
			byValue = By.className(str[1]);
			break;
		case "TAGNAME":
			byValue = By.tagName(str[1]);
			break;
		}
		return byValue;
	}

	public static boolean isElementLoaded(final By byValue) {
		logger.debug("Executing Test Step::" + new Object() {
		}.getClass().getEnclosingMethod().getName());

		logger.debug("Waiting for element to be loaded. Timeout:" + PathConstants.defaultTimeout);
		Wait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(PathConstants.defaultTimeout, TimeUnit.MILLISECONDS)
				.pollingEvery(PathConstants.defaultPollingFrequency, TimeUnit.MILLISECONDS)
				.ignoring(NoSuchElementException.class);
		ExpectedCondition<Boolean> condition = new ExpectedCondition<Boolean>() {
			@Override
			public Boolean apply(WebDriver d) {
				WebElement element = d.findElement(byValue);
				return element.isDisplayed();
			}
		};
		return wait.until(condition);
	}

	/*
	 * 
	 * this method executes to get login spinner
	 */
	public static void afterLoginSpinner(By locator) {
		logger.debug("Executing Test Step::" + new Object() {
		}.getClass().getEnclosingMethod().getName());
		explicitWait(25000);
		long iCount = 0;
		logger.debug("Waiting for page spinner...");
		while (iCount < PathConstants.defaultTimeout) {
			if (instantElementCheck("Display", locator)) {
				try {
					Thread.sleep(PathConstants.defaultPollingFrequency);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				break;
			}
			iCount += PathConstants.defaultPollingFrequency;
		}
		explicitWait(20000);
	}
	
	public static void waitForSpinner(By locator) {
		logger.debug("Executing Test Step::" + new Object() {
		}.getClass().getEnclosingMethod().getName());
		explicitWait(1000);
		long iCount = 0;
		logger.debug("Waiting for page spinner...");
		while (iCount < PathConstants.defaultTimeout) {
			if (instantElementCheck("Display", locator)) {
				try {
					Thread.sleep(PathConstants.defaultPollingFrequency);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			} else {
				break;
			}
			iCount += PathConstants.defaultPollingFrequency;
		}
		explicitWait(1000);
	}

	/*
	 * 
	 * this method apply explicit wait in the application
	 */
	public static void explicitWait(long milliSec) {
		logger.debug("Executing Test Step::" + new Object() {
		}.getClass().getEnclosingMethod().getName());

		try {
			logger.info("Waiting for [" + milliSec + "] millisec before the next step.");
			Thread.sleep(milliSec);
		} catch (Exception e) {
			getLogger().error("Error while doing explicit wait : " + e.getMessage());
		}
	}

	public static Logger getLogger() {
		return logger;
	}

	public static boolean instantElementCheck(String type, By byValue) {
		logger.debug("Executing Test Step::" + new Object() {
		}.getClass().getEnclosingMethod().getName());

		try {
			WebElement element = driver.findElement(byValue);
			if (type.equalsIgnoreCase("Display")) {
				return element.isDisplayed();
			} else if (type.equalsIgnoreCase("Enable")) {
				return element.isEnabled();
			} else if (type.equalsIgnoreCase("Select")) {
				return element.isSelected();
			} else {
				return false;
			}
		} catch (Exception e) {
			return false;
		}
	}

	public static void assertElementDisplayed(String objLocator, String message) throws AssertionError {
		try {
			Assert.assertTrue(message, verifyElementDisplayed(objLocator));
		} catch (NoSuchElementException ex) {
			Assert.fail(message + " as element not available : " + ex.getMessage());
		} catch (ElementNotFoundException ex) {
			Assert.fail(message + " as element not available : " + ex.getMessage());
		} catch (NullPointerException ex) {
			Assert.fail(message + " due to some error : " + ex.getMessage());
		}
	}

	public static Properties getConfigProperties() {
		return configProperties;
	}

	/*
	 * 
	 * this method deletes the unnecessary file and folder from the application.
	 */
	public static void recursiveDelete(File file) {
		// to end the recursive loop
		if (!file.exists())
			return;
		// if directory, go inside and call recursively
		if (file.isDirectory()) {
			for (File f : file.listFiles()) {
				// call recursively
				recursiveDelete(f);
			}
		}
		// call delete to delete files and empty directory
		file.delete();
		logger.info("Deleted file/folder: " + file.getAbsolutePath());
	}
}
