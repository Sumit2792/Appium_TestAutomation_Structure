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

public class SettingScreenPageObject {

	public SettingScreenPageObject(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public static final String SETTING_PAGE = "settingPage";

	@AndroidFindBy(id = "com.iddl.main:id/settings")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement settingsButton;
	
	@AndroidFindBy(id = "com.iddl.main:id/entry")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement settingsPageBackButton;
	
	@AndroidFindBy(id = "com.iddl.main:id/disallowEquipmentAdding")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement settingsPageDisallowEquipmentAddCreateNewTab;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement clickDisallowEquipmentPageNoButton;
	
	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement clickDisallowEquipmentPageYesButton;
	
	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement clickDisallowEquipmentPageBackButton;

	public void clickSettingsButton() {
		settingsButton.click();
	}
	
	public void clickSettingsPageBackButton() {
		settingsPageBackButton.click();
	}
	
	public void clickDisallowEquipmentAddCreateNewTab() {
		settingsPageDisallowEquipmentAddCreateNewTab.click();
	}
	
	public void clickDisallowEquipmentPageYesButton() {
		clickDisallowEquipmentPageYesButton.click();
	}
	
	public void clickDisallowEquipmentPageNoButton() {
		clickDisallowEquipmentPageNoButton.click();
	}
	
	public void clickDisallowEquipmentPageBackButton() {
		clickDisallowEquipmentPageBackButton.click();
	}
	
	public void verifyDisallowEquipmentAddCreateNewTabText(String property) {
		settingsPageDisallowEquipmentAddCreateNewTab.getAttribute(property);;
	}

	
}
