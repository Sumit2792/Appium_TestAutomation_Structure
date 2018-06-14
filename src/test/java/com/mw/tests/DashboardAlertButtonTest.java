package com.mw.tests;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.mw.constants.DashboardAlertPageConstant;
import com.mw.constants.PathConstants;
import com.mw.pages.DashboardAlertButtonScreenPageObject;
import com.mw.testBase.TestBase;
import com.mw.utils.BaseUtil;

/**
 * 
 * @author Sumit Srivastava
 *
 */

public class DashboardAlertButtonTest extends TestBase {

	private Logger logger = Logger.getLogger(DashboardAlertButtonTest.class);

	private DashboardAlertButtonScreenPageObject alertButtonScreen;

	/*
	 * Initialize all the objects and the properties files.
	 * 
	 */
	public DashboardAlertButtonTest() throws Exception {
		super();
		String resourceFilePath = PathConstants.PROPERTIES_BASEPATH
				+ DashboardAlertButtonScreenPageObject.DASHBOARD_ALERTPAGE + PathConstants.FORWARD_SLASH;
		alertButtonScreen = new DashboardAlertButtonScreenPageObject(driver);
		testProperties.putAll(BaseUtil.readPropertyFile(resourceFilePath, PathConstants.COMMON));
		testProperties.putAll(BaseUtil.readPropertyFile(resourceFilePath, platform));
	}

	/*
	 * @Test Name : TC01_DashboardPageAlertButtonTestCases
	 * @Test Description : This test cases verifies the visibility of Alert button Alert page on dashboard and also
	 * verifies the visibility of its elements.
	 */
	@Test(priority = 1)
	public void TC01_DashboardPageAlertButtonTestCases() throws InterruptedException {
		logger.info("TC01_DashboardPageAlertButtonTestCases Test Suite Started");

		String message = "Alert Page and its elements are not displayed.";
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(DashboardAlertPageConstant.DASHBOARD_PAGE_ALERT_BUTTON), message);
		alertButtonScreen.verifyAlertButtonText(
				testProperties.getProperty(DashboardAlertPageConstant.DASHBOARD_PAGE_ALERT_BUTTON_TEXT));
		alertButtonScreen.clickAlertButton();
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(DashboardAlertButtonScreenPageObject.DASHBOARD_ALERTPAGE), message);
		alertButtonScreen.verifyAlertHeaderText(
				testProperties.getProperty(DashboardAlertPageConstant.DASHBOARD_ALERT_PAGE_BUTTON_HEADER_TEXT));
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(DashboardAlertPageConstant.DASHBOARD_ALERT_PAGE__DONE_BUTTON), message);
		alertButtonScreen.verifyAlertPageDoneButtonText(
				testProperties.getProperty(DashboardAlertPageConstant.DASHBOARD_ALERT_PAGE__DONE_BUTTON_TEXT));
		alertButtonScreen.clickAlertPageDoneButton();
		Thread.sleep(1000);
	}

	/*
	 * This is a AfterMethod of testng which operform its operation after one test method executes.
	 * After completeion of each and every test method, this method takes the screenshot of completed test method.
	 * 
	 */
	@AfterMethod
	public void takeScreenshot() throws IOException {
		BaseUtil.captureScreenShots();
	}

}
