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

public class EntriestScreenPageObject {

	public EntriestScreenPageObject(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public static final String ENTRIES_PAGE = "entriesPage";
	
	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement addButtonEntriesPage;
	
	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement onDutyButton;
	
	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement skipOdometerButton;
	
	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement addNewFieldTabButton;
	
	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement attributeTextField;
	
	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement dateAndTimeButton;

	public void clickAddButtonEntriesPage() {
		addButtonEntriesPage.click();
	}

	public void verifyHeaderAddButtonPage(String property) {
		addButtonEntriesPage.getAttribute(property);
	}
	
	public void clickOnDutyButton() {
		onDutyButton.click();
	}
	
	public void clickSkipOdometerButton() {
		skipOdometerButton.click();
	}
	
	public void clickAddNewFieldTabButton() {
		addNewFieldTabButton.click();
	}
	
	public void enterAtributeFieldValue(String attributeValue) {
		attributeTextField.sendKeys(attributeValue);
	}
	
	public void clickDateAndTimeButton() {
		dateAndTimeButton.click();
	}
	

	
}
