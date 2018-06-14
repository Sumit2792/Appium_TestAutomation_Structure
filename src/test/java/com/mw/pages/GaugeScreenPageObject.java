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

public class GaugeScreenPageObject {

	public GaugeScreenPageObject(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public static final String GAUGE_PAGE = "gaugePage";

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement gaugeButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement gaugePageCrossButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement gaugePageOdoMeterText;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement gaugePageSpeedText;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement gaugePageTripOdoMeterText;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement gaugePageTripEngineHoursText;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement gaugePageELDButton;

	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement gaugePageELDPopupOkButton;
	
	@AndroidFindBy(id = "com.iddl.main:id/email")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement gaugePageELDPopupMessageText;

	public void clickGaugeButton() {
		gaugeButton.click();
	}

	public void verifyGaugePageOdoMeterTextValue(String property) {
		gaugePageOdoMeterText.getAttribute(property);
	}

	public void verifyGaugePageSpeedTextValue(String property) {
		gaugePageSpeedText.getAttribute(property);
	}

	public void verifyGaugePageTripOdoMeterTextValue(String property) {
		gaugePageTripOdoMeterText.getAttribute(property);
	}

	public void verifyGaugePageTripEngineHoursTextValue(String property) {
		gaugePageTripEngineHoursText.getAttribute(property);
	}

	public void clickGaugePageCrossButton() {
		gaugePageCrossButton.click();
	}

	public void clickELDButton() {
		gaugePageELDButton.click();
	}

	public void clickELDPopupOkButton() {
		gaugePageELDPopupOkButton.click();
	}

	public void verifyGaugePageELDPopupMessageTextValue(String property) {
		gaugePageELDPopupMessageText.getAttribute(property);
	}

}
