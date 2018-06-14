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

public class LoginScreenPageObject {

	public static final String LOGIN_PAGE = "loginPage";

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement emailIdTest;

	@AndroidFindBy(id = "com.iddl.main:id/password")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeButton[1]")
	MobileElement passwordTest;

	@AndroidFindBy(id = "com.iddl.main:id/login")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement loginButton;

	@AndroidFindBy(id = "com.iddl.main:id/signup")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement signUpButton;

	@AndroidFindBy(id = "com.iddl.main:id/button3")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement resetPasswordButton;

	@AndroidFindBy(id = "com.iddl.main:id/setting")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement settingsButton;

	@AndroidFindBy(id = "com.iddl.main:id/btnClearEmailId")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement clearEmailButton;

	@AndroidFindBy(id = "com.iddl.main:id/btnClearPass")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement clearPasswordButton;

	@AndroidFindBy(id = "com.iddl.main:id/button1")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeStaticText[2]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement overOnRulePopupButton;

	public LoginScreenPageObject(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public void enterEmailId(String emailId) {
		emailIdTest.sendKeys(emailId);
	}

	public void enterPassword(String password) {
		passwordTest.sendKeys(password);
	}

	public String enterEmailId() {
		return emailIdTest.getText();
	}

	public String enterPassword() {
		return passwordTest.getText();
	}

	public void clickLoginButton() {
		loginButton.click();
	}

	public void clickClearEmailButton() {
		clearEmailButton.click();
	}

	public void clickClearPasswordButton() {
		clearPasswordButton.click();
	}

	public void clickOverOnRulePopupButton() {
		overOnRulePopupButton.click();
	}

	public MobileElement getEmailIdTest() {
		return emailIdTest;
	}

	public MobileElement getPasswordTest() {
		return passwordTest;
	}

	public MobileElement getLoginButton() {
		return loginButton;
	}

	public MobileElement getSignUpButton() {
		return signUpButton;
	}

	public MobileElement getResetPasswordButton() {
		return resetPasswordButton;
	}

	public MobileElement getSettingsButton() {
		return settingsButton;
	}

}
