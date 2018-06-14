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

public class DashboardAlertButtonScreenPageObject {

	public DashboardAlertButtonScreenPageObject(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public static final String DASHBOARD_ALERTPAGE = "alertPage";
	
	@AndroidFindBy(id = "com.iddl.main:id/alert")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement alertButton;

	@AndroidFindBy(id = "com.iddl.main:id/textView1")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement alertPageButtonTextHeader;
		
	@AndroidFindBy(id = "com.iddl.main:id/backreport")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement alertPageDoneButton;
	
	public void clickAlertButton() {
		alertButton.click();
	}
	
	public void verifyAlertHeaderText(String property) {
		alertPageButtonTextHeader.getAttribute(property);
	}
	
	public void verifyAlertPageDoneButtonText(String property) {
		alertPageDoneButton.getAttribute(property);
	}
	
	public void clickAlertPageDoneButton() {
		alertPageDoneButton.click();
	}
	
	public void verifyAlertButtonText(String property) {
		alertButton.getAttribute(property);
	}

}
