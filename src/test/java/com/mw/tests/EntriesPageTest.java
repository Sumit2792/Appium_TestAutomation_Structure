package com.mw.tests;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.mw.constants.EntriesPageConstant;
import com.mw.constants.LoginPageConstant;
import com.mw.constants.PathConstants;
import com.mw.constants.SettingsPageConstant;
import com.mw.pages.DashboardScreenPageObject;
import com.mw.pages.EntriestScreenPageObject;
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

public class EntriesPageTest extends TestBase {

	private Logger logger = Logger.getLogger(EntriesPageTest.class);

	private EntriestScreenPageObject entriesPageScreen;
	private MoreScreenPageObject morePageScreen;
	private DashboardScreenPageObject dashboardScreen;

	/*
	 * Initialize all the objects and the properties files.
	 * 
	 */
	public EntriesPageTest() throws Exception {
		super();
		String resourceFilePath = PathConstants.PROPERTIES_BASEPATH + EntriestScreenPageObject.ENTRIES_PAGE
				+ PathConstants.FORWARD_SLASH;
		entriesPageScreen = new EntriestScreenPageObject(driver);
		morePageScreen = new MoreScreenPageObject(driver);
		dashboardScreen = new DashboardScreenPageObject(driver);
		testProperties.putAll(BaseUtil.readPropertyFile(resourceFilePath, PathConstants.COMMON));
		testProperties.putAll(BaseUtil.readPropertyFile(resourceFilePath, platform));
	}

	/*
	 * @Test Name : TC01_EnteriesSummaryPage
	 * 
	 * @Test Description : This test cases verifies the visibility of Entries Page
	 * after click on Entries Button.
	 */
	@Test(priority = 1)
	public void TC01_EnteriesSummaryPage() throws Exception {
		logger.info("TC01_EnteriesSummaryPage Test Suite Started");
		Thread.sleep(3000);
		dashboardScreen.clickEnteriesButton();
		String message = "Entries Page is not yet displayed.";
		(new WebDriverWait(driver, 100)).until(ExpectedConditions.presenceOfElementLocated(
				BaseUtil.getLocator(testProperties.getProperty(EntriestScreenPageObject.ENTRIES_PAGE))));
		BaseUtil.assertElementDisplayed(testProperties.getProperty(EntriestScreenPageObject.ENTRIES_PAGE), message);

		entriesPageScreen.clickAddButtonEntriesPage();
		BaseUtil.assertElementDisplayed(testProperties.getProperty(EntriesPageConstant.ADD_BUTTON_PAGE_ENTRIES_PAGE),
				message);
		entriesPageScreen
				.verifyHeaderAddButtonPage(testProperties.getProperty(EntriesPageConstant.ADD_BUTTON_PAGE_HEADER_TEXT));
		/*
		 * Verify elements on Add Button Page
		 */
		BaseUtil.assertElementDisplayed(testProperties.getProperty(EntriesPageConstant.ADD_BUTTON_PAGE_CANCEL_BUTTON),
				message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty(EntriesPageConstant.ADD_BUTTON_PAGE_OFF_DUTY_BUTTON),
				message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(EntriesPageConstant.ADD_BUTTON_PAGE_SLEEPER_BIRTH_BUTTON), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty(EntriesPageConstant.ADD_BUTTON_PAGE_DRIVING_BUTTON),
				message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty(EntriesPageConstant.ADD_BUTTON_PAGE_ON_DUTY_BUTTON),
				message);

		entriesPageScreen.clickOnDutyButton();

		boolean odoMeterFlag = BaseUtil.verifyElementDisplayed(
				testProperties.getProperty(EntriesPageConstant.ON_DUTY_BUTTON_CLICK_GUESS_ODOMETER_PAGE));
		if (odoMeterFlag) {
			entriesPageScreen.clickSkipOdometerButton();
		}

		BaseUtil.assertElementDisplayed(testProperties.getProperty(EntriesPageConstant.ON_DUTY_PAGE), message);
	}

	/*
	 * @Test Name : TC02_OnDutyPageDateTimeElements
	 * 
	 * @Test Description : This test cases verifies the date time elements on On
	 * Dq	uty Page.
	 */
	@Test(priority = 2)
	public void TC02_OnDutyPageDateTimeElements() throws Exception {
		logger.info("TC02_OnDutyPageDateTimeElements Test Suite Started");
		Thread.sleep(3000);
		String message = "Add New Field page and it's elements are not yet loaded on the screen.";

		entriesPageScreen.clickAddNewFieldTabButton();
		BaseUtil.assertElementDisplayed(testProperties.getProperty(EntriesPageConstant.ADD_NEW_FIELD_PAGE), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(EntriesPageConstant.ADD_NEW_FIELD_PAGE_ATTRIBUTE_FIELD), message);

		entriesPageScreen.enterAtributeFieldValue(
				testProperties.getProperty(EntriesPageConstant.ADD_NEW_FIELD_PAGE_ATTRIBUTE_FIELD_VALUE));

		/*
		 * 	Select Date & Time	
		 */
		action.moveTo(1000, 1000);
		entriesPageScreen.clickDateAndTimeButton();
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(EntriesPageConstant.DATE_TIME_PAGE_ON_ADD_NEW_FIELD), message);
		
		
	}

	/*
	 * This is a AfterMethod of testng which operform its operation after one test
	 * method executes. After completeion of each and every test method, this method
	 * takes the screenshot of completed test method.
	 * 
	 */
	@AfterMethod
	public void takeScreenshot() throws IOException {
		BaseUtil.captureScreenShots();
	}

}
