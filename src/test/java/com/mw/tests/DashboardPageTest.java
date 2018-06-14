package com.mw.tests;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.mw.constants.AppConstant;
import com.mw.constants.PathConstants;
import com.mw.pages.DashboardScreenPageObject;
import com.mw.testBase.TestBase;
import com.mw.utils.BaseUtil;

/**
 * 
 * @author Sumit Srivastava
 *
 */

public class DashboardPageTest extends TestBase {

	private Logger logger = Logger.getLogger(LoginPageTest.class);

	private DashboardScreenPageObject dashboardScreen;

	public DashboardPageTest() throws Exception {
		super();
		String resourceFilePath = PathConstants.PROPERTIES_BASEPATH + DashboardScreenPageObject.DASHBOARD_PAGE
				+ PathConstants.FORWARD_SLASH;
		dashboardScreen = new DashboardScreenPageObject(driver);
		testProperties.putAll(BaseUtil.readPropertyFile(resourceFilePath, PathConstants.COMMON));
		testProperties.putAll(BaseUtil.readPropertyFile(resourceFilePath, platform));
	}

	@Test(priority = 1)
	public void TC01_DashboardPage() throws InterruptedException {
		logger.info("TC01_DashboardPage Test Suite Started");
		Thread.sleep(3000);
		(new WebDriverWait(driver, 100)).until(ExpectedConditions.presenceOfElementLocated(
				BaseUtil.getLocator(testProperties.getProperty(DashboardScreenPageObject.DASHBOARD_PAGE))));
	}

	@Test(priority = 2)
	public void TC02_DashboardPageVerifyElementsOnDashboardTab() throws InterruptedException {
		logger.info("TC02_DashboardPageVerifyElementsOnDashboardTab Test Suite Started");
		Thread.sleep(3000);
		(new WebDriverWait(driver, 100)).until(ExpectedConditions.presenceOfElementLocated(
				BaseUtil.getLocator(testProperties.getProperty(DashboardScreenPageObject.DASHBOARD_PAGE))));
		String message = "DashboardPage Elements are not displayed";
		BaseUtil.assertElementDisplayed(testProperties.getProperty(DashboardScreenPageObject.DASHBOARD_PAGE), message);
		
		BaseUtil.assertElementDisplayed(testProperties.getProperty("entriesButton"), message);
		dashboardScreen.verifyEnteriesButtonText(testProperties.getProperty("enteriesButtonText"));
		BaseUtil.assertElementDisplayed(testProperties.getProperty("refreshButton"), message);
		dashboardScreen.verifyRefreshButtonText(testProperties.getProperty("refreshButtonText"));
		BaseUtil.assertElementDisplayed(testProperties.getProperty("ruleSetsButton"), message);
		dashboardScreen.verifyRuleSetsButtonText(testProperties.getProperty("ruleSetButtonText"));
		BaseUtil.assertElementDisplayed(testProperties.getProperty("IFTAButton"), message);
		dashboardScreen.verifyIFTAButtonText(testProperties.getProperty("IFTAButtonText"));
		BaseUtil.assertElementDisplayed(testProperties.getProperty("backwordButton"), message);
		dashboardScreen.verifyBackwordtButtonText(testProperties.getProperty("backwordButtonText"));
		BaseUtil.assertElementDisplayed(testProperties.getProperty("forwordButton"), message);
		dashboardScreen.verifyForwardButtonText(testProperties.getProperty("forwardButtonText"));
		BaseUtil.assertElementDisplayed(testProperties.getProperty("texasIntrastateTextField"), message);
		dashboardScreen.verifyTexasIntrastateText(testProperties.getProperty("texasIntrastateText"));
		BaseUtil.assertElementDisplayed(testProperties.getProperty("hourRuleTextField"), message);
		dashboardScreen.verifyHourRuleText(testProperties.getProperty("hourRuleText"));
		BaseUtil.assertElementDisplayed(testProperties.getProperty("drivingOnDutyTextField"), message);
		dashboardScreen.verifyDrivingOnDutyText(testProperties.getProperty("drivingOnDutyText"));
		BaseUtil.assertElementDisplayed(testProperties.getProperty("resetsEveryTextField"), message);
		dashboardScreen.verifyResetsEveryText(testProperties.getProperty("resetsEveryText"));
		BaseUtil.assertElementDisplayed(testProperties.getProperty("offDutyRuleTextField"), message);
		dashboardScreen.verifyOffDutyRuleText(testProperties.getProperty("offDutyRuleText"));
		BaseUtil.assertElementDisplayed(testProperties.getProperty("breakRuleTextField"), message);
		dashboardScreen.verifyBreakRuleText(testProperties.getProperty("breakRuleText"));
		BaseUtil.assertElementDisplayed(testProperties.getProperty("monthText"), message);

		BaseUtil.assertElementDisplayed(testProperties.getProperty("logsButton"), message);
		dashboardScreen.verifyLogstButtonText(testProperties.getProperty("logsButtonText"));
		BaseUtil.assertElementDisplayed(testProperties.getProperty("inspectionButton"), message);
		dashboardScreen.verifyInspectionButtonText(testProperties.getProperty("inspectionButtonText"));
		BaseUtil.assertElementDisplayed(testProperties.getProperty("equipmentButton"), message);
		dashboardScreen.verifyEquipmentButtonText(testProperties.getProperty("equipmentButtonText"));
		BaseUtil.assertElementDisplayed(testProperties.getProperty("reportsButton"), message);
		dashboardScreen.verifyReportsButtonText(testProperties.getProperty("reportsButtonText"));
		BaseUtil.assertElementDisplayed(testProperties.getProperty("moreButton"), message);
	//	dashboardScreen.verifyMoretButtonText(testProperties.getProperty("moreButtonText"));
	}
	
	@Test(priority = 4)
	public void TC04_DashboardPageNextPrevButton() throws InterruptedException {
		logger.info("TC04_DashboardPageNextPrevButton Test Suite Started");
		String message = "DashboardPage Elements are not displayed";
		BaseUtil.assertElementDisplayed(testProperties.getProperty(DashboardScreenPageObject.DASHBOARD_PAGE), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("monthText"), message);
		dashboardScreen.clickPrevButton();
		Thread.sleep(1000);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("preMonthText"), message);
		dashboardScreen.clickNextButton();
		Thread.sleep(1000);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("nextMonthText"), message);
		Thread.sleep(1000);
	}

	

	@Test(priority = 6)
	public void TC06_MorePageDriverInfoTestCases() {
		logger.info("TC06_MorePageDriverInfoTestCases Test Suite Started");
		String message = "DriverInfo Page is not displayed";
		//dashboardScreen.clickDriverInfoPageButton();
		BaseUtil.assertElementDisplayed(testProperties.getProperty(AppConstant.DRIVER_INFO_PAGE), message);
		logger.info("Verify Elements and Buttons on DriverInfoPage..!");
		BaseUtil.assertElementDisplayed(testProperties.getProperty("driverInfoPageBackButton"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("driverInfoPageEditButton"), message);

		logger.info("Verify Admin Details on DriverInfo Page..!");
		BaseUtil.assertElementDisplayed(testProperties.getProperty("driverInfoUserAdmimNameValue"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("driverInfoAdminIdValue"), message);

		logger.info("Verify UserDetails on DriverInfo Page..!");
		BaseUtil.assertElementDisplayed(testProperties.getProperty("driverInfoUserNameValue"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("driverInfoUserIdValue"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("driverInfoNameField"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("driverInfoPhoneNumberField"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("driverInfoDriverAddressField"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("driverInfoEmailField"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("driverInfoDriverIdField"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("driverInfoCoDriverField"), message);

		BaseUtil.assertElementDisplayed(testProperties.getProperty("driverInfoCarrierField"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("driverInfoCarrierIDField"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("driverInfoMainOfficeAddressField"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("driverInfoTimeZoneField"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("driverInfoHouseTerminalField"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("driverInfoDriversLicenseField"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("driverInfoCountryField"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("driverInfoPostalCodeField"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("driverInfoDefaultRuleSetField"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("driverInfoStateField"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("driverInfoCarrierRegistrationIDField"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("driverInfoDivisionField"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("driverInfoGroupField"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("driverInfoDriverLicenseStateField"), message);
	}

	/*@Test(priority = 7)
	public void TC07_UserInfoStatus() {
		logger.info("TC07_UserInfoStatus Test Suite Started");
		String message = "User Info Status Page is not displayed";
		dashboardScreen.clickUserInfoStatus();
		BaseUtil.assertElementDisplayed(testProperties.getProperty(AppConstant.USER_INFO_STATUS_PAGE), message);
		logger.info("Verify Status Window.!");
		BaseUtil.assertElementDisplayed(testProperties.getProperty("statusHeaderName"), message);
		dashboardScreen.verifyAlertButtonText(testProperties.getProperty("alertButtonText"));
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoStatusBackButton"), message);
		dashboardScreen.verifyAlertButtonText(testProperties.getProperty("alertButtonText"));
		dashboardScreen.clickUserInfoStatusBackButton();
	}*/

	@Test(priority = 8)
	public void TC08_UserInfoStatusDetails() {
		logger.info("TC08_UserInfoStatusDetails Test Suite Started");
		String message = "User Info Status Detail Page is not displayed";
		dashboardScreen.clickDriverInfoNameField();
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoNameHeader"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoNameBackButton"), message);
		dashboardScreen.clickUserInfoNameBackButton();

		dashboardScreen.clickDriverInfoPhoneNumberField();
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoPhoneNumberHeader"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoPhoneNumberBackButton"), message);
		dashboardScreen.clickUserInfoPhoneNumberBackButton();

		dashboardScreen.clickDriverInfoDriverAddressField();
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoDriverAddressHeader"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoDriverAddressBackButton"), message);
		dashboardScreen.clickUserInfoDriverAddressBackButton();

		dashboardScreen.clickDriverInfoEmailField();
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoEmailHeader"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoEmailBackButton"), message);
		dashboardScreen.clickUserInfoEmailBackButton();

		dashboardScreen.clickDriverInfoDriverIDField();
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoDriverIDHeader"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoDriverIDBackButton"), message);
		dashboardScreen.clickUserInfoDriverIDBackButton();

		dashboardScreen.clickDriverInfoCoDriverField();
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoCoDriverHeader"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoCoDriverBackButton"), message);
		dashboardScreen.clickUserInfoCoDriverBackButton();

		dashboardScreen.clickDriverInfoCarrierField();
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoCarrierHeader"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoCarrierBackButton"), message);
		dashboardScreen.clickUserInfoCarrierBackButton();

		dashboardScreen.clickDriverInfoCarrierIdField();
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoCarrierIdHeader"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoCarrierIdBackButton"), message);
		dashboardScreen.clickUserInfoCarrierIdBackButton();

		dashboardScreen.clickDriverInfoMainOfficeAddressField();
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoMainOfficeAddressHeader"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoMainOfficeAddressBackButton"), message);
		dashboardScreen.clickUserInfoMainOfficeAddressBackButton();

		dashboardScreen.clickDriverInfoTimezoneField();
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoTimezoneHeader"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoTimezoneBackButton"), message);
		dashboardScreen.clickUserInfoTimezoneBackButton();

		dashboardScreen.clickDriverInfoHomeTerminalField();
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoHomeTerminalHeader"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoHomeTerminalBackButton"), message);
		dashboardScreen.clickUserInfoHomeTerminalBackButton();

		dashboardScreen.clickDriverInfoDriversLicenseField();
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoDriversLicenseHeader"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoDriversLicenseBackButton"), message);
		dashboardScreen.clickUserInfoDriversLicenseBackButton();

		dashboardScreen.clickDriverInfoCountryField();
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoCountryHeader"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoCountryBackButton"), message);
		dashboardScreen.clickUserInfoCountryBackButton();

		dashboardScreen.clickDriverInfoPostalCodeField();
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoPostalCodeHeader"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoPostalCodeBackButton"), message);
		dashboardScreen.clickUserInfoPostalCodeBackButton();

		dashboardScreen.clickDriverInfoDefaultRulesetField();
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoDefaultRulesetHeader"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoDefaultRulesetBackButton"), message);
		dashboardScreen.clickUserInfoDefaultRulesetBackButton();

		dashboardScreen.clickDriverInfoStateField();
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoStateHeader"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoStateBackButton"), message);
		dashboardScreen.clickUserInfoStateBackButton();

		dashboardScreen.clickDriverInfoCarrierRegistrationIDField();
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoCarrierRegistrationIDHeader"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoCarrierRegistrationIDBackButton"), message);
		dashboardScreen.clickUserInfoCarrierRegistrationIDBackButton();

		dashboardScreen.clickDriverInfoDivisionField();
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoDivisionHeader"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoDivisionBackButton"), message);
		dashboardScreen.clickUserInfoDivisionBackButton();

		dashboardScreen.clickDriverInfoGroupField();
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoGroupHeader"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoGroupBackButton"), message);
		dashboardScreen.clickUserInfoGroupBackButton();

		dashboardScreen.clickDriverInfoDriverLicenseStateField();
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoDriverLicenseStateHeader"), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty("userInfoDriverLicenseStateBackButton"), message);
		dashboardScreen.clickUserInfoDriverLicenseStateBackButton();
	}

	

	@AfterMethod
	public void takeScreenshot() throws IOException {
		BaseUtil.captureScreenShots();
	}

}
