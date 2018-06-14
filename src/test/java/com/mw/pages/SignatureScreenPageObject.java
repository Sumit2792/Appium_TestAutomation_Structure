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

public class SignatureScreenPageObject {

	public SignatureScreenPageObject(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public static final String SIGNATURE_PAGE = "signaturePage";
	
	@AndroidFindBy(id = "com.iddl.main:id/fieldheading")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement multimediaTabText;
	
	@AndroidFindBy(id = "com.iddl.main:id/sighn")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement multimediaTabSignatureField;
	
	@AndroidFindBy(id = "com.iddl.main:id/backbutton")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement multimediaTabSignatureFieldReadOnlyBackButton;
	
	@AndroidFindBy(id = "com.iddl.main:id/fieldheading")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement editPageMultiMediaTabText;
	
	@AndroidFindBy(id = "com.iddl.main:id/fieldrowmulti")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement modifySignature;
	
	@AndroidFindBy(id = "com.iddl.main:id/backbutton")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement multimediaTabSignatureFieldCancelButton;
	
	@AndroidFindBy(id = "com.iddl.main:id/signature")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement multimediaTabSignatureFieldHeaderButton;
	
	@AndroidFindBy(id = "com.iddl.main:id/getsign")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement modifySignatureAreaAcceptButton;
	
	@AndroidFindBy(id = "com.iddl.main:id/cancel")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement modifySignatureAreaCancelButton;
	
	public void verifyMultimediaTabText(String property) {
		multimediaTabText.getAttribute(property);
	}
	
	public void clickMultimediaTabSignatureField() {
		multimediaTabSignatureField.click();
	}
	
	public void verifyMultimediaTabSignatureFieldReadOnlyBackButtonText(String property) {
		multimediaTabSignatureFieldReadOnlyBackButton.getAttribute(property);
	}
	
	public void clickMultimediaTabSignatureFieldReadOnlyBackButton() {
		multimediaTabSignatureFieldReadOnlyBackButton.click();
	}
	
	public void verifyEditPageMultiMediaTabText(String property) {
		editPageMultiMediaTabText.getAttribute(property);
	}
	
	public void clickModifySignature() {
		modifySignature.click();
	}
	
	public void verifyModifySignatureCancelButtonText(String property) {
		multimediaTabSignatureFieldCancelButton.getAttribute(property);
	}
	
	public void verifyModifySignatureFieldHeaderButtonText(String property) {
		multimediaTabSignatureFieldHeaderButton.getAttribute(property);
	}
	
	public void clickMultimediaTabSignatureFieldHeaderButton() {
		multimediaTabSignatureFieldHeaderButton.click();
	}
	
	public void verifyModifySignatureAreaAcceptButtonText(String property) {
		modifySignatureAreaAcceptButton.getAttribute(property);
	}

	public void verifyModifySignatureAreaCancelButtonText(String property) {
		modifySignatureAreaCancelButton.getAttribute(property);
	}
	
	public void clickModifySignatureAreaCancelButton() {
		modifySignatureAreaCancelButton.click();
	}

	

}
