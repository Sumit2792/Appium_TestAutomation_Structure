package com.mw.tests;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.mw.constants.MorePageConstant;
import com.mw.constants.PathConstants;
import com.mw.pages.MoreScreenPageObject;
import com.mw.testBase.TestBase;
import com.mw.utils.BaseUtil;

/**
 * 
 * @author Sumit Srivastava
 *
 */

public class MorePageTest extends TestBase {

	private Logger logger = Logger.getLogger(MorePageTest.class);

	private MoreScreenPageObject morePageScreen;

	/*
	 * Initialize all the objects and the properties files.
	 * 
	 */
	public MorePageTest() throws Exception {
		super();
		String resourceFilePath = PathConstants.PROPERTIES_BASEPATH + MoreScreenPageObject.DASHBOARD_MOREPAGE
				+ PathConstants.FORWARD_SLASH;
		morePageScreen = new MoreScreenPageObject(driver);
		testProperties.putAll(BaseUtil.readPropertyFile(resourceFilePath, PathConstants.COMMON));
		testProperties.putAll(BaseUtil.readPropertyFile(resourceFilePath, platform));
	}

	/*
	 * @Test Name : TC01_DashboardPageMoreButton
	 * @Test Description : This test cases verifies the visibility of More Button and its elements loaded after click
	 * on more button on more page.
	 */
	@Test(priority = 1)
	public void TC01_DashboardPageMoreButton() {
		logger.info("TC01_DashboardPageMoreButton Test Suite Started");
		String message = "DashboardPage More Button Elements are not displayed";
		morePageScreen.clickMoreButton();

		logger.info("========== Verifying Visible elements on More Page");
		BaseUtil.assertElementDisplayed(testProperties.getProperty(MoreScreenPageObject.DASHBOARD_MOREPAGE), message);
		logger.info("Verify Elements and Buttons on MorePage..!");
		BaseUtil.assertElementDisplayed(testProperties.getProperty(MorePageConstant.MOREPAGE_DRIVER_INFO_BUTTON), message);
		morePageScreen.verifyMorePageDriverInfoButtonText(
				testProperties.getProperty(MorePageConstant.MOREPAGE_DRIVER_INFO_BUTTON_TEXT));

		BaseUtil.assertElementDisplayed(testProperties.getProperty(MorePageConstant.MOREPAGE_IFTA_BUTTON), message);
		morePageScreen.verifyMorePageIFTAButtonText(testProperties.getProperty(MorePageConstant.MOREPAGE_IFTA_BUTTON_TEXT));
		BaseUtil.assertElementDisplayed(testProperties.getProperty(MorePageConstant.MOREPAGE_LOADS_BUTTON), message);
		morePageScreen
				.verifyMorePageLoadsButtonText(testProperties.getProperty(MorePageConstant.MOREPAGE_LOADS_BUTTON_TEXT));

		BaseUtil.assertElementDisplayed(testProperties.getProperty(MorePageConstant.MOREPAGE_HISTORY_BUTTON), message);
		morePageScreen
				.verifyMorePageHistoryButtonText(testProperties.getProperty(MorePageConstant.MOREPAGE_HISTORY_BUTTON_TEXT));
		BaseUtil.assertElementDisplayed(testProperties.getProperty(MorePageConstant.MOREPAGE_TELEMETRY_BUTTON), message);
		morePageScreen.verifyMorePageTelemetryButtonText(
				testProperties.getProperty(MorePageConstant.MOREPAGE_TELEMETRY_BUTTON_TEXT));

		BaseUtil.assertElementDisplayed(testProperties.getProperty(MorePageConstant.MOREPAGE_EXPENSES_BUTTON), message);
		morePageScreen.verifyMorePageExpensesButtonText(
				testProperties.getProperty(MorePageConstant.MOREPAGE_EXPENSES_BUTTON_TEXT));
		BaseUtil.assertElementDisplayed(testProperties.getProperty(MorePageConstant.MOREPAGE_ACTIVITIES_BUTTON), message);
		morePageScreen.verifyMorePageActivitiesButtonText(
				testProperties.getProperty(MorePageConstant.MOREPAGE_ACTIVITIES_BUTTON_TEXT));
		BaseUtil.assertElementDisplayed(testProperties.getProperty(MorePageConstant.MOREPAGE_CONTACTS_BUTTON), message);
		morePageScreen.verifyMorePageContactsButtonText(
				testProperties.getProperty(MorePageConstant.MOREPAGE_CONTACTS_BUTTON_TEXT));
		BaseUtil.assertElementDisplayed(testProperties.getProperty(MorePageConstant.MOREPAGE_SETTINGS_BUTTON), message);
		morePageScreen.verifyMorePageSettingsButtonText(
				testProperties.getProperty(MorePageConstant.MOREPAGE_SETTINGS_BUTTON_TEXT));
		BaseUtil.assertElementDisplayed(testProperties.getProperty(MorePageConstant.MOREPAGE_LOGOUT_BUTTON), message);
		morePageScreen
				.verifyMorePageLogoutButtonText(testProperties.getProperty(MorePageConstant.MOREPAGE_LOGOUT_BUTTON_TEXT));
		BaseUtil.assertElementDisplayed(testProperties.getProperty(MorePageConstant.MOREPAGE_HELP_BUTTON), message);
		morePageScreen.verifyMorePageHelpButtonText(testProperties.getProperty(MorePageConstant.MOREPAGE_HELP_BUTTON_TEXT));
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
