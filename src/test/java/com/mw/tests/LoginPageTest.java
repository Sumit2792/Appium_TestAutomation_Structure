package com.mw.tests;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.mw.constants.AppConstant;
import com.mw.constants.LoginPageConstant;
import com.mw.constants.PathConstants;
import com.mw.pages.LoginScreenPageObject;
import com.mw.testBase.TestBase;
import com.mw.utils.BaseUtil;

/**
 * 
 * @author Sumit Srivastava
 *
 */

public class LoginPageTest extends TestBase {

	private Logger logger = Logger.getLogger(LoginPageTest.class);

	private LoginScreenPageObject loginScreen;

	/*
	 * Initialize all the objects and the properties files.
	 * 
	 */
	public LoginPageTest() throws Exception {
		super();
		String resourceFilePath = PathConstants.PROPERTIES_BASEPATH + LoginScreenPageObject.LOGIN_PAGE
				+ PathConstants.FORWARD_SLASH;
		loginScreen = new LoginScreenPageObject(driver);
		testProperties.putAll(BaseUtil.readPropertyFile(resourceFilePath, PathConstants.COMMON));
		testProperties.putAll(BaseUtil.readPropertyFile(resourceFilePath, platform));
	}

	/*
	 * @Test Name : TC01_LoginPage
	 * @Test Description : This test cases verifies the visibility of Login Page and its elements.
	 */
	@Test(priority = 1)
	public void TC01_LoginPage() throws Exception {
		logger.info("TC01_LoginPage Test Suite Started");
		Thread.sleep(3000);
		(new WebDriverWait(driver, 100)).until(ExpectedConditions.presenceOfElementLocated(
				BaseUtil.getLocator(testProperties.getProperty(LoginScreenPageObject.LOGIN_PAGE))));
		String message = "LoginPage is not displayed";
		BaseUtil.assertElementDisplayed(testProperties.getProperty(LoginScreenPageObject.LOGIN_PAGE), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty(LoginPageConstant.LOGIN_PAGE_EMAIL_ID_FIELD),
				message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty(LoginPageConstant.LOGIN_PAGE_PASSWORD_FIELD),
				message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty(LoginPageConstant.LOGIN_PAGE_LOGINBUTTON), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty(LoginPageConstant.LOGIN_PAGE_DONT_HAVE_ACCOUNT_TEXT),
				message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty(LoginPageConstant.LOGIN_PAGE_SIGN_UP_BUTTON),
				message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty(LoginPageConstant.LOGIN_PAGE_RESET_PASSWORD_BUTTON),
				message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty(LoginPageConstant.LOGIN_PAGE_SETTINGS_BUTTON),
				message);
	}

	/*
	 * @Test Name : TC02_loginWithInvalidEmail
	 * @Test Description : This test cases perform login operations with invalid credentials.
	 */
	@Test(priority = 2)
	public void TC02_loginWithInvalidEmail() throws Exception {
		logger.info("TC02_loginWithInvalidEmail Test Suite Started");
		loginScreen.clickLoginButton();
		loginScreen.enterEmailId(testProperties.getProperty(LoginPageConstant.LOGIN_PAGE_INVALID_EMAIL_ID_VALUE));
		loginScreen.clickClearEmailButton();
		loginScreen.enterEmailId(testProperties.getProperty(LoginPageConstant.LOGIN_PAGE_INVALID_EMAIL_ID_VALUE));
		loginScreen.clickLoginButton();
		loginScreen.enterPassword(testProperties.getProperty(LoginPageConstant.LOGIN_PAGE_PASWORD_VALUE));
		loginScreen.clickClearPasswordButton();
		loginScreen.enterPassword(testProperties.getProperty(LoginPageConstant.LOGIN_PAGE_PASWORD_VALUE));
		loginScreen.clickLoginButton();
		Thread.sleep(3000);
	}

	/*
	 * @Test Name : TC03_loginTestSuccess
	 * @Test Description : This test cases perform login operations with valid credentials and after login it shows dashboard page.
	 */
	@Test(priority = 3)
	public void TC03_loginTestSuccess() throws Exception {
		logger.info("TC03_loginTestSuccess Test Suite Started");
		String message = "Dashboard Page is not displayed";

		loginScreen.enterEmailId(testProperties.getProperty(LoginPageConstant.LOGIN_PAGE_EMAIL_ID_VALUE));
		loginScreen.enterPassword(testProperties.getProperty(LoginPageConstant.LOGIN_PAGE_PASWORD_VALUE));
		loginScreen.clickLoginButton();
		BaseUtil.afterLoginSpinner(BaseUtil.getLocator(testProperties.getProperty(AppConstant.SPINNER)));

		/*
		 * webDriverWait.until(ExpectedConditions
		 * .visibilityOfElementLocated(BaseUtil.getLocator(testProperties.getProperty(
		 * "overOnPopupTitle"))));
		 */

		boolean flag = BaseUtil.verifyElementDisplayed(
				testProperties.getProperty(LoginPageConstant.DASHBOARD_PAGE_OVER_ON_POPUP_TITLE));
		while (flag) {
			BaseUtil.assertElementDisplayed(
					testProperties.getProperty(LoginPageConstant.DASHBOARD_PAGE_OVER_ON_POPUP_TITLE), message);
			loginScreen.clickOverOnRulePopupButton();
			flag = BaseUtil.verifyElementDisplayed(
					testProperties.getProperty(LoginPageConstant.DASHBOARD_PAGE_OVER_ON_POPUP_TITLE));
		}
		Thread.sleep(1000);
		BaseUtil.assertElementDisplayed(testProperties.getProperty(AppConstant.DASHBOARD), message);
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
