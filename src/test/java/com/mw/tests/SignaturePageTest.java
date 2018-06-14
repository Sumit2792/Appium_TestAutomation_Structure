package com.mw.tests;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.mw.constants.PathConstants;
import com.mw.constants.SignaturePageConstant;
import com.mw.pages.DashboardScreenPageObject;
import com.mw.pages.MoreScreenPageObject;
import com.mw.pages.SignatureScreenPageObject;
import com.mw.testBase.TestBase;
import com.mw.utils.BaseUtil;

/**
 * 
 * @author Sumit Srivastava
 *
 */

public class SignaturePageTest extends TestBase {

	private Logger logger = Logger.getLogger(LoginPageTest.class);

	private SignatureScreenPageObject signatureScreen;
	private MoreScreenPageObject morePageScreen;
	private DashboardScreenPageObject dashboardScreen;

	/*
	 * Initialize all the objects and the properties files.
	 * 
	 */
	public SignaturePageTest() throws Exception {
		super();
		String resourceFilePath = PathConstants.PROPERTIES_BASEPATH + SignatureScreenPageObject.SIGNATURE_PAGE
				+ PathConstants.FORWARD_SLASH;
		signatureScreen = new SignatureScreenPageObject(driver);
		morePageScreen = new MoreScreenPageObject(driver);
		dashboardScreen = new DashboardScreenPageObject(driver);
		testProperties.putAll(BaseUtil.readPropertyFile(resourceFilePath, PathConstants.COMMON));
		testProperties.putAll(BaseUtil.readPropertyFile(resourceFilePath, platform));
	}
	
	/*
	 * @Test Name : TC01_Signature
	 * @Test Description : This test cases verifies the visibility of Signature Tab on Driver Info Page
	 */
	@Test(priority = 1)
	public void TC01_Signature() throws Exception {
		logger.info("TC01_SettingPage Test Suite Started");
		Thread.sleep(3000);
		morePageScreen.clickMoreButton();
		morePageScreen.clickDriverInfoPageButton();

		String message = "Signature Tab is not yet displayed.";
		(new WebDriverWait(driver, 100)).until(ExpectedConditions.presenceOfElementLocated(
				BaseUtil.getLocator(testProperties.getProperty(SignaturePageConstant.DRIVER_INFOPAGE_SIGNATURE_TAB))));
		BaseUtil.assertElementDisplayed(testProperties.getProperty(SignaturePageConstant.DRIVER_INFOPAGE_SIGNATURE_TAB),
				message);
	}

	/*
	 * @Test Name : TC02_MultimediaTabSignatureTestCases
	 * @Test Description : This test cases verifies the visibility of Elements of Signature Tab.
	 */
	@Test(priority = 2)
	public void TC02_MultimediaTabSignatureTestCases() {
		logger.info("TC02_MultimediaTabSignatureTestCases Test Suite Started");
		String message = "Signature Read Only Page is not opened";
		BaseUtil.assertElementDisplayed(testProperties.getProperty(SignaturePageConstant.MULTIMEDIA_TAB_TEXTFIELD),
				message);
		signatureScreen.verifyMultimediaTabText(
				testProperties.getProperty(SignaturePageConstant.MULTIMEDIA_TAB_TEXTFIELD_TEXT));
		BaseUtil.assertElementDisplayed(testProperties.getProperty(SignaturePageConstant.DRIVER_INFOPAGE_SIGNATURE_TAB),
				message);
		signatureScreen.clickMultimediaTabSignatureField();
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(SignaturePageConstant.MULTIMEDIA_TAB_SIGNATURE_FIELD_READ_ONLY_BACK_BUTTON),
				message);
		signatureScreen.verifyMultimediaTabSignatureFieldReadOnlyBackButtonText(testProperties
				.getProperty(SignaturePageConstant.MULTIMEDIA_TAB_SIGNATURE_FIELD_READ_ONLY_BACK_BUTTON_TEXT));
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(SignaturePageConstant.MULTIMEDIA_TAB_SIGNATURE_FIELD_READ_ONLY_IMAGE),
				message);
		signatureScreen.clickMultimediaTabSignatureFieldReadOnlyBackButton();
	}

	/*
	 * @Test Name : TC03_MultimediaTabSignatureEditPageTestCases
	 * @Test Description : This test cases verifies the visibility of elements of Modify Signature Page and also operation some basic
	 * operations of Accept, Cancel, Back buttons
	 */
	@Test(priority = 3)
	public void TC03_MultimediaTabSignatureEditPageTestCases() {
		logger.info("TC03_MultimediaTabSignatureEditPageTestCases Test Suite Started");
		String message = "Signature EditablePage Only Page is not opened";
		morePageScreen.clickDriverInfoEditButton();
		BaseUtil.assertElementDisplayed(testProperties.getProperty(SignaturePageConstant.EDIT_PAGE_MULTIMEDIA_TAB),
				message);
		signatureScreen.verifyEditPageMultiMediaTabText(
				testProperties.getProperty(SignaturePageConstant.EDIT_PAGE_MULTIMEDIA_TAB_TEXT));
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(SignaturePageConstant.EDIT_PAGE_MULTIMEDIA_TAB_SIGNATURE_FIELD), message);
		signatureScreen.clickModifySignature();
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(SignaturePageConstant.MODIFY_SIGNATURE_CANCEL_BUTTON), message);
		signatureScreen.verifyModifySignatureCancelButtonText(
				testProperties.getProperty(SignaturePageConstant.MODIFY_SIGNATURE_CANCEL_BUTTON_TEXT));
		BaseUtil.assertElementDisplayed(testProperties.getProperty(SignaturePageConstant.MODIFY_SIGNATURE_IMAGE),
				message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(SignaturePageConstant.MODIFY_SIGNATURE_FIELD_HEADER_BUTTON), message);
		signatureScreen.verifyModifySignatureFieldHeaderButtonText(
				testProperties.getProperty(SignaturePageConstant.MODIFY_SIGNATURE_FIELD_HEADER_BUTTON_TEXT));
		signatureScreen.clickMultimediaTabSignatureFieldHeaderButton();
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(SignaturePageConstant.MODIFY_SIGNATURE_AREA_ACCEPT_BUTTON), message);
		signatureScreen.verifyModifySignatureAreaAcceptButtonText(
				testProperties.getProperty(SignaturePageConstant.MODIFY_SIGNATURE_AREA_ACCEPT_BUTTON_TEXT));
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(SignaturePageConstant.MODIFY_SIGNATURE_AREA_CANCEL_BUTTON), message);
		signatureScreen.verifyModifySignatureAreaCancelButtonText(
				testProperties.getProperty(SignaturePageConstant.MODIFY_SIGNATURE_AREA_CANCEL_BUTTON_TEXT));
		signatureScreen.clickModifySignatureAreaCancelButton();
		BaseUtil.assertElementDisplayed(testProperties.getProperty(SignaturePageConstant.MULTIMEDIA_TAB_TEXTFIELD), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty(SignaturePageConstant.DRIVER_INFOPAGE_SIGNATURE_TAB),
				message);
		dashboardScreen.clickDriverInfoSaveButton();

		// Go to Dashboard Page
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
