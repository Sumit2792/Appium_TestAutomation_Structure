package com.mw.tests;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.mw.constants.PathConstants;
import com.mw.constants.SettingsPageConstant;
import com.mw.pages.DashboardScreenPageObject;
import com.mw.pages.MoreScreenPageObject;
import com.mw.pages.SettingScreenPageObject;
import com.mw.testBase.TestBase;
import com.mw.utils.BaseUtil;

import io.appium.java_client.MobileElement;

/**
 * 
 * @author Sumit Srivastava
 *
 */

public class SettingPageTest extends TestBase {

	private Logger logger = Logger.getLogger(SettingPageTest.class);

	private SettingScreenPageObject settingPageScreen;
	private MoreScreenPageObject morePageScreen;
	private DashboardScreenPageObject dashboardScreen;

	/*
	 * Initialize all the objects and the properties files.
	 * 
	 */
	public SettingPageTest() throws Exception {
		super();
		String resourceFilePath = PathConstants.PROPERTIES_BASEPATH + SettingScreenPageObject.SETTING_PAGE
				+ PathConstants.FORWARD_SLASH;
		settingPageScreen = new SettingScreenPageObject(driver);
		morePageScreen = new MoreScreenPageObject(driver);
		dashboardScreen = new DashboardScreenPageObject(driver);
		testProperties.putAll(BaseUtil.readPropertyFile(resourceFilePath, PathConstants.COMMON));
		testProperties.putAll(BaseUtil.readPropertyFile(resourceFilePath, platform));
	}

	/*
	 * @Test Name : TC01_SettingPage
	 * @Test Description : This test cases verifies the visibility of Settings Page after click on More Button.
	 */
	@Test(priority = 1)
	public void TC01_SettingPage() throws Exception {
		logger.info("TC01_SettingPage Test Suite Started");
		Thread.sleep(3000);
		morePageScreen.clickMoreButton();
		settingPageScreen.clickSettingsButton();
		String message = "Settings Page is not yet displayed.";
		(new WebDriverWait(driver, 100)).until(ExpectedConditions.presenceOfElementLocated(
				BaseUtil.getLocator(testProperties.getProperty(SettingScreenPageObject.SETTING_PAGE))));
		BaseUtil.assertElementDisplayed(testProperties.getProperty(SettingScreenPageObject.SETTING_PAGE), message);
	}

	/*
	 * @Test Name : TC02_SettingPageDisallowEquipmentAddCreateNewTab
	 * @Test Description : This test cases verifies the visibility of Elemets of Settings Page.
	 */
	@Test(priority = 2)
	public void TC02_SettingPageDisallowEquipmentAddCreateNewTab() throws Exception {
		logger.info("TC02_SettingPageDisallowEquipmentAddCreateNewTab Test Suite Started");
		Thread.sleep(3000);
		String message = "Disallow Equipment Add Create New Page is not yet displayed.";
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(SettingsPageConstant.DISALLOW_EQUIPMENT_ADD_CREATE_NEW_TAB), message);
		settingPageScreen.verifyDisallowEquipmentAddCreateNewTabText(
				testProperties.getProperty(SettingsPageConstant.DISALLOW_EQUIPMENT_ADD_CREATE_NEW_TAB_TEXT));

		settingPageScreen.clickDisallowEquipmentAddCreateNewTab();

		logger.info("Disallow Equipment Add Create New Page is open.");
		BaseUtil.assertElementDisplayed(testProperties.getProperty(SettingsPageConstant.DISALLOW_EQUIPMENT_PAGE),
				message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(SettingsPageConstant.DISALLOW_EQUIPMENT_PAGE_BACK_BUTTON), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty(SettingsPageConstant.DISALLOW_EQUIPMENT_PAGE_HEADER),
				message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(SettingsPageConstant.DISALLOW_EQUIPMENT_PAGE_YES_BUTTON), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(SettingsPageConstant.DISALLOW_EQUIPMENT_PAGE_NO_BUTTON), message);
	}

	/*
	 * @Test Name : TC03_DisallowEquipmentPageOperation
	 * @Test Description : This test cases perform operation on Disallow Equipment Page.
	 */
	@Test(priority = 3)
	public void TC03_DisallowEquipmentPageOperation() throws Exception {
		logger.info("TC03_DisallowEquipmentPageOperation Test Suite Started");

		String message = "Disallow Equipment Add Create New Page is not yet displayed.";
		settingPageScreen.clickDisallowEquipmentPageYesButton();
		boolean flag = BaseUtil.verifyElementDisplayed(
				testProperties.getProperty(SettingsPageConstant.DISALLOW_EQUIPMENT_ADD_CREATE_NEW_TAB));
		Assert.assertTrue(flag, SettingsPageConstant.SETTING_PAGE_MESSAGE);

		MobileElement disAllowEquipmentOperation = driver.findElement(BaseUtil.getLocator(
				testProperties.getProperty(SettingsPageConstant.DISALLOW_EQUIPMENT_ADD_CREATE_NEW_TAB_BOOLEAN_VALUE)));

		boolean disAllowEquipmentOperationFlag = false;
		String disAllowEquipmentOperationTextValue = disAllowEquipmentOperation.getText();
		if (disAllowEquipmentOperationTextValue.equals("Yes")) {
			disAllowEquipmentOperationFlag = true;
			Assert.assertTrue(disAllowEquipmentOperationFlag, SettingsPageConstant.DISALLOW_EQUIPMENT_YES_VALUE);
		}
		settingPageScreen.clickDisallowEquipmentAddCreateNewTab();
		BaseUtil.assertElementDisplayed(testProperties.getProperty(SettingsPageConstant.DISALLOW_EQUIPMENT_PAGE),
				message);
		settingPageScreen.clickDisallowEquipmentPageNoButton();
		Assert.assertTrue(flag, "Settings Page is not displyed");

		if (disAllowEquipmentOperationTextValue.equals("No")) {
			Assert.assertFalse(disAllowEquipmentOperationFlag, SettingsPageConstant.DISALLOW_EQUIPMENT_NO_VALUE);
		}
		settingPageScreen.clickSettingsPageBackButton();
		dashboardScreen.clickLogsButton();
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
