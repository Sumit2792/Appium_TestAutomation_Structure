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

public class MoreScreenPageObject {

	public MoreScreenPageObject(AppiumDriver<MobileElement> driver) {
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}

	public static final String DASHBOARD_MOREPAGE = "morePage";
	
	@AndroidFindBy(id = "com.iddl.main:id/MoreTab")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement moreButton;
	
	@AndroidFindBy(id = "com.iddl.main:id/driverinfo")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement driverInfoPageButton;
	
	@AndroidFindBy(id = "com.iddl.main:id/IFTA")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement morePageIFTAButton;
	
	@AndroidFindBy(id = "com.iddl.main:id/Load")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement morePageLoadsButton;
	
	@AndroidFindBy(id = "com.iddl.main:id/History")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement morePageHistoryButton;
	
	@AndroidFindBy(id = "com.iddl.main:id/Telemetry")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement morePageTelemetryButton;
	
	@AndroidFindBy(id = "com.iddl.main:id/exp")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement morePageExpensesButton;
	
	@AndroidFindBy(id = "com.iddl.main:id/act")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement morePageActivitiesButton;
	
	@AndroidFindBy(id = "com.iddl.main:id/cont")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement morePageContactsButton;
	
	@AndroidFindBy(id = "com.iddl.main:id/settings")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement morePageSettingsButton;
	
	@AndroidFindBy(id = "com.iddl.main:id/logout")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement morePageLogoutButton;
	
	@AndroidFindBy(id = "com.iddl.main:id/help")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement morePageHelpButton;
	
	@AndroidFindBy(id = "com.iddl.main:id/edtbtn")
	@iOSFindBy(xpath = "//XCUIElementTypeApplication[1]/XCUIElementTypeWindow[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeOther[1]/XCUIElementTypeTextField[1]")
	@WithTimeout(time = 10, unit = TimeUnit.SECONDS)
	MobileElement driverInfoEditButton;
	
	public void clickMoreButton() {
		moreButton.click();
	}
	
	public void clickDriverInfoPageButton() {
		driverInfoPageButton.click();
	}
	
	public void verifyMorePageDriverInfoButtonText(String property) {
		driverInfoPageButton.getAttribute(property);
	}
	
	public void verifyMorePageIFTAButtonText(String property) {
		morePageIFTAButton.getAttribute(property);
	}
	
	public void verifyMorePageLoadsButtonText(String property) {
		morePageLoadsButton.getAttribute(property);
	}
	
	public void verifyMorePageHistoryButtonText(String property) {
		morePageHistoryButton.getAttribute(property);
	}
	
	public void verifyMorePageTelemetryButtonText(String property) {
		morePageTelemetryButton.getAttribute(property);
	}
	
	public void verifyMorePageExpensesButtonText(String property) {
		morePageExpensesButton.getAttribute(property);
	}
	
	public void verifyMorePageActivitiesButtonText(String property) {
		morePageActivitiesButton.getAttribute(property);
	}
	
	public void verifyMorePageContactsButtonText(String property) {
		morePageContactsButton.getAttribute(property);
	}
	
	public void verifyMorePageSettingsButtonText(String property) {
		morePageSettingsButton.getAttribute(property);
	} 
	
	public void verifyMorePageLogoutButtonText(String property) {
		morePageLogoutButton.getAttribute(property);
	}
	
	public void verifyMorePageHelpButtonText(String property) {
		morePageHelpButton.getAttribute(property);
	}
	
	public void clickDriverInfoEditButton() {
		driverInfoEditButton.click();
	}
	
}
