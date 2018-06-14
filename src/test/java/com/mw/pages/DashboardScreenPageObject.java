package com.mw.pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.support.PageFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import io.appium.java_client.pagefactory.WithTimeout;
import io.appium.java_client.pagefactory.iOSFindBy;

/**
 * 
 * @author Sumit Srivastava
 *
 */

public class DashboardScreenPageObject {

	public DashboardScreenPageObject(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public static final String DASHBOARD_PAGE = "dashboardPage";

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement entriesButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement refreshButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement ruleSetButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement iftaButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement backfordButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement forwardButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement texasIntrastateText;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement hourRuleText;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement drivingOnDutyText;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement resetsEveryText;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement offDutyRuleText;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement breakRuleText;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement dashboardPagePrevButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement dashboardPageNextButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement userInfoStatusField;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement userInfoStatusBackButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement driverInfoNameField;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement userInfoNameBackButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement driverInfoPhoneNumberField;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement userInfoPhoneNumberBackButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement driverInfoDriverAddressField;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement userInfoDriverAddressBackButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement driverInfoEmailField;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement userInfoEmailBackButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement driverInfoDriverIDField;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement userInfoDriverIDBackButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement driverInfoCoDriverField;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement userInfoCoDriverBackButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement driverInfoCarrierField;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement userInfoCarrierBackButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement driverInfoCarrierIdField;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement userInfoCarrierIdBackButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement driverInfoMainOfficeAddressField;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement userInfoMainOfficeAddressBackButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement clickDriverInfoTimezoneField;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement clickUserInfoTimezoneBackButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement clickDriverInfoHomeTerminalField;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement clickUserInfoHomeTerminalBackButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement clickDriverInfoDriversLicenseField;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement clickUserInfoDriversLicenseBackButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement clickDriverInfoCountryField;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement clickUserInfoCountryBackButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement clickDriverInfoPostalCodeField;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement clickUserInfoPostalCodeBackButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement clickDriverInfoDefaultRulesetField;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement clickUserInfoDefaultRulesetBackButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement clickDriverInfoStateField;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement clickUserInfoStateBackButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement clickDriverInfoCarrierRegistrationIDField;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement clickUserInfoCarrierRegistrationIDBackButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement clickDriverInfoDivisionField;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement clickUserInfoDivisionBackButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement clickDriverInfoGroupField;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement clickUserInfoGroupBackButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement clickDriverInfoDriverLicenseStateField;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement clickUserInfoDriverLicenseStateBackButton;

	@AndroidFindBy(id = "com.iddl.main:id/save")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement driverInfoSaveButton;

	@AndroidFindBy(id = "com.iddl.main:id/logmenu")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement logsButton;

	@AndroidFindBy(id = "com.iddl.main:id/inspectiontab")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement inspectionButton;

	@AndroidFindBy(id = "com.iddl.main:id/EquipmentTab")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement equipmentButton;

	@AndroidFindBy(id = "com.iddl.main:id/ReportsTab")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement reportsButton;

	public void clickPrevButton() {
		dashboardPagePrevButton.click();
	}

	public void clickNextButton() {
		dashboardPageNextButton.click();
	}

	/*
	 * public void clickMoreButton() { moreButton.click(); }
	 * 
	 * public void clickDriverInfoPageButton() { driverInfoPageButton.click(); }
	 */

	public void clickUserInfoStatus() {
		userInfoStatusField.click();
	}

	public void clickUserInfoStatusBackButton() {
		userInfoStatusField.click();
	}

	public void clickDriverInfoNameField() {
		driverInfoNameField.click();
	}

	public void clickUserInfoNameBackButton() {
		userInfoNameBackButton.click();
	}

	public void clickDriverInfoPhoneNumberField() {
		driverInfoPhoneNumberField.click();
	}

	public void clickUserInfoPhoneNumberBackButton() {
		userInfoPhoneNumberBackButton.click();
	}

	public void clickDriverInfoDriverAddressField() {
		driverInfoDriverAddressField.click();
	}

	public void clickUserInfoDriverAddressBackButton() {
		userInfoDriverAddressBackButton.click();
	}

	public void clickDriverInfoEmailField() {
		driverInfoEmailField.click();
	}

	public void clickUserInfoEmailBackButton() {
		userInfoEmailBackButton.click();
	}

	public void clickDriverInfoDriverIDField() {
		driverInfoDriverIDField.click();
	}

	public void clickUserInfoDriverIDBackButton() {
		userInfoDriverIDBackButton.click();
	}

	public void clickDriverInfoCoDriverField() {
		driverInfoCoDriverField.click();
	}

	public void clickUserInfoCoDriverBackButton() {
		userInfoCoDriverBackButton.click();
	}

	public void clickDriverInfoCarrierField() {
		driverInfoCarrierField.click();
	}

	public void clickUserInfoCarrierBackButton() {
		userInfoCarrierBackButton.click();
	}

	public void clickDriverInfoCarrierIdField() {
		driverInfoCarrierIdField.click();
	}

	public void clickUserInfoCarrierIdBackButton() {
		userInfoCarrierIdBackButton.click();
	}

	public void clickDriverInfoMainOfficeAddressField() {
		driverInfoMainOfficeAddressField.click();
	}

	public void clickUserInfoMainOfficeAddressBackButton() {
		userInfoMainOfficeAddressBackButton.click();
	}

	public void clickDriverInfoTimezoneField() {
		clickDriverInfoTimezoneField.click();
	}

	public void clickUserInfoTimezoneBackButton() {
		clickUserInfoTimezoneBackButton.click();
	}

	public void clickDriverInfoHomeTerminalField() {
		clickDriverInfoHomeTerminalField.click();
	}

	public void clickUserInfoHomeTerminalBackButton() {
		clickUserInfoHomeTerminalBackButton.click();
	}

	public void clickDriverInfoDriversLicenseField() {
		clickDriverInfoDriversLicenseField.click();
	}

	public void clickUserInfoDriversLicenseBackButton() {
		clickUserInfoDriversLicenseBackButton.click();
	}

	public void clickDriverInfoCountryField() {
		clickDriverInfoCountryField.click();
	}

	public void clickUserInfoCountryBackButton() {
		clickUserInfoCountryBackButton.click();
	}

	public void clickDriverInfoPostalCodeField() {
		clickDriverInfoPostalCodeField.click();
	}

	public void clickUserInfoPostalCodeBackButton() {
		clickUserInfoPostalCodeBackButton.click();
	}

	public void clickDriverInfoDefaultRulesetField() {
		clickDriverInfoDefaultRulesetField.click();
	}

	public void clickUserInfoDefaultRulesetBackButton() {
		clickUserInfoDefaultRulesetBackButton.click();
	}

	public void clickDriverInfoStateField() {
		clickDriverInfoStateField.click();
	}

	public void clickUserInfoStateBackButton() {
		clickUserInfoStateBackButton.click();
	}

	public void clickDriverInfoCarrierRegistrationIDField() {
		clickDriverInfoCarrierRegistrationIDField.click();
	}

	public void clickUserInfoCarrierRegistrationIDBackButton() {
		clickUserInfoCarrierRegistrationIDBackButton.click();
	}

	public void clickDriverInfoDivisionField() {
		clickDriverInfoDivisionField.click();
	}

	public void clickUserInfoDivisionBackButton() {
		clickUserInfoDivisionBackButton.click();
	}

	public void clickDriverInfoGroupField() {
		clickDriverInfoGroupField.click();
	}

	public void clickUserInfoGroupBackButton() {
		clickUserInfoGroupBackButton.click();
	}

	public void clickDriverInfoDriverLicenseStateField() {
		clickDriverInfoDriverLicenseStateField.click();
	}

	public void clickUserInfoDriverLicenseStateBackButton() {
		clickUserInfoDriverLicenseStateBackButton.click();
	}

	public void clickDriverInfoSaveButton() {
		driverInfoSaveButton.click();
	}

	public void clickLogsButton() {
		logsButton.click();
	}

	public void clickRuleSetsButton() {
		ruleSetButton.click();
	}
	
	public void clickEnteriesButton() {
		entriesButton.click();
	}

	public void verifyEnteriesButtonText(String property) {
		entriesButton.getAttribute(property);
	}

	public void verifyRefreshButtonText(String property) {
		refreshButton.getAttribute(property);
	}

	public void verifyRuleSetsButtonText(String property) {
		ruleSetButton.getAttribute(property);
	}

	public void verifyIFTAButtonText(String property) {
		iftaButton.getAttribute(property);
	}

	public void verifyBackwordtButtonText(String property) {
		backfordButton.getAttribute(property);

	}

	public void verifyForwardButtonText(String property) {
		forwardButton.getAttribute(property);
	}

	public void verifyTexasIntrastateText(String property) {
		texasIntrastateText.getAttribute(property);
	}

	public void verifyHourRuleText(String property) {
		hourRuleText.getAttribute(property);

	}

	public void verifyDrivingOnDutyText(String property) {
		drivingOnDutyText.getAttribute(property);
	}

	public void verifyResetsEveryText(String property) {
		resetsEveryText.getAttribute(property);
	}

	public void verifyOffDutyRuleText(String property) {
		offDutyRuleText.getAttribute(property);
	}

	public void verifyBreakRuleText(String property) {
		breakRuleText.getAttribute(property);
	}

	public void verifyLogstButtonText(String property) {
		logsButton.getAttribute(property);
	}

	public void verifyInspectionButtonText(String property) {
		inspectionButton.getAttribute(property);
	}

	public void verifyEquipmentButtonText(String property) {
		equipmentButton.getAttribute(property);
	}

	public void verifyReportsButtonText(String property) {
		reportsButton.getAttribute(property);
	}

	/*
	 * public void verifyMoretButtonText(String property) {
	 * moreButton.getAttribute(property); }
	 * 
	 * public void verifyMorePageDriverInfoButtonText(String property) {
	 * driverInfoPageButton.getAttribute(property); }
	 * 
	 * 
	 * 
	 * public void verifyMorePageLoadsButtonText(String property) {
	 * morePageLoadsButton.getAttribute(property); }
	 * 
	 * public void verifyMorePageExpensesButtonText(String property) {
	 * morePageExpensesButton.getAttribute(property); }
	 * 
	 * public void verifyMorePageActivitiesButtonText(String property) {
	 * morePageActivitiesButton.getAttribute(property); }
	 * 
	 * public void verifyMorePageContactsButtonText(String property) {
	 * morePageContactsButton.getAttribute(property); }
	 * 
	 * public void verifyMorePageSettingsButtonText(String property) {
	 * morePageSettingsButton.getAttribute(property); }
	 * 
	 * public void verifyMorePageLogoutButtonText(String property) {
	 * morePageLogoutButton.getAttribute(property); }
	 * 
	 * public void verifyMorePageHelpButtonText(String property) {
	 * morePageHelpButton.getAttribute(property); }
	 */

}
