package com.mw.tests;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.mw.constants.AppConstant;
import com.mw.constants.GaugePageConstant;
import com.mw.constants.PathConstants;
import com.mw.pages.GaugeScreenPageObject;
import com.mw.testBase.TestBase;
import com.mw.utils.BaseUtil;

/**
 * 
 * @author Sumit Srivastava
 *
 */

public class GaugePageTest extends TestBase {

	private Logger logger = Logger.getLogger(GaugePageTest.class);

	private GaugeScreenPageObject gaugeScreen;

	/*
	 * Initialize all the objects and the properties files.
	 * 
	 */
	public GaugePageTest() throws Exception {
		super();
		String resourceFilePath = PathConstants.PROPERTIES_BASEPATH + GaugeScreenPageObject.GAUGE_PAGE
				+ PathConstants.FORWARD_SLASH;
		gaugeScreen = new GaugeScreenPageObject(driver);
		testProperties.putAll(BaseUtil.readPropertyFile(resourceFilePath, PathConstants.COMMON));
		testProperties.putAll(BaseUtil.readPropertyFile(resourceFilePath, platform));
	}

	/*
	 * @Test Name : TC01_GaugePage
	 * @Test Description : This test cases verifies the visibility of Gauge Page.
	 */
	@Test(priority = 1)
	public void TC01_GaugePage() throws Exception {
		logger.info("TC01_GaugePage Test Suite Started");
		Thread.sleep(3000);
		gaugeScreen.clickGaugeButton();
		String message = "Gauge Page is not yet displayed.";
		(new WebDriverWait(driver, 100)).until(ExpectedConditions.presenceOfElementLocated(
				BaseUtil.getLocator(testProperties.getProperty(GaugeScreenPageObject.GAUGE_PAGE))));
		BaseUtil.assertElementDisplayed(testProperties.getProperty(GaugeScreenPageObject.GAUGE_PAGE), message);
	}

	/*
	 * @Test Name : TC02_GaugePageElements
	 * @Test Description : This test cases verifies the visibility of Elements of Gauge Page.
	 */
	@Test(priority = 2)
	public void TC02_GaugePageElements() throws Exception {
		logger.info("TC02_GaugePageElements Test Suite Started");
		Thread.sleep(3000);
		String message = "Gauge Page Elements are not yet displayed.";

		// Gauge Page Elements loaded
		BaseUtil.assertElementDisplayed(testProperties.getProperty(GaugePageConstant.GAUGEPAGE_SLEEPER_BIRTH_TEXT), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty(GaugePageConstant.GAUGEPAGE_GAUGE_DIAGRAM), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty(GaugePageConstant.GAUGEPAGE_IFTA_BUTTON), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty(GaugePageConstant.GAUGEPAGE_ELD_BUTTON), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty(GaugePageConstant.GAUGEPAGE_ALERTS_BUTTON), message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty(GaugePageConstant.GAUGEPAGE_INMOTION_BUTTON), message);

		// verify table elements and its text
		BaseUtil.assertElementDisplayed(testProperties.getProperty(GaugePageConstant.GAUGEPAGE_ODOMETER_TEXTFIELD), message);
		gaugeScreen
				.verifyGaugePageOdoMeterTextValue(testProperties.getProperty(GaugePageConstant.GAUGEPAGE_ODOMETER_TEXTVALUE));

		BaseUtil.assertElementDisplayed(testProperties.getProperty(GaugePageConstant.GAUGEPAGE_SPEED_TEXTFIELD), message);
		gaugeScreen.verifyGaugePageSpeedTextValue(testProperties.getProperty(GaugePageConstant.GAUGEPAGE_SPEED_TEXTVALUE));

		BaseUtil.assertElementDisplayed(testProperties.getProperty(GaugePageConstant.GAUGEPAGE_TRIP_ODOMETER_TEXTFIELD),
				message);
		gaugeScreen.verifyGaugePageTripOdoMeterTextValue(
				testProperties.getProperty(GaugePageConstant.GAUGEPAGE_TRIP_ODOMETER_TEXTVALUE));

		BaseUtil.assertElementDisplayed(testProperties.getProperty(GaugePageConstant.GAUGEPAGE_TRIP_ENGINE_HOURS_TEXTFIELD),
				message);
		gaugeScreen.verifyGaugePageTripEngineHoursTextValue(
				testProperties.getProperty(GaugePageConstant.GAUGEPAGE_TRIP_ENGINE_HOUS_TEXTVALUE));

		BaseUtil.assertElementDisplayed(testProperties.getProperty(GaugePageConstant.GAUGEPAGE_CROSS_BUTTON), message);
		gaugeScreen.clickGaugePageCrossButton();
	}

	/*
	 * @Test Name : TC03_ELDButtonFunctionalityOnGaugePage
	 * @Test Description : This test cases perform operation of ELD button on Gauge Page.
	 */
	@Test(priority = 3)
	public void TC03_ELDButtonFunctionalityOnGaugePage() throws Exception {
		logger.info("TC03_ELDButtonFunctionalityOnGaugePage Test Suite Started");
		Thread.sleep(3000);

		gaugeScreen.clickGaugeButton();
		String message = "Gauge Page is not yet displayed.";
		(new WebDriverWait(driver, 100)).until(ExpectedConditions.presenceOfElementLocated(
				BaseUtil.getLocator(testProperties.getProperty(GaugeScreenPageObject.GAUGE_PAGE))));
		BaseUtil.assertElementDisplayed(testProperties.getProperty(GaugeScreenPageObject.GAUGE_PAGE), message);

		gaugeScreen.clickELDButton();

		boolean flag = BaseUtil.verifyElementDisplayed(testProperties.getProperty(GaugePageConstant.GAUGEPAGE_ELD_POPUP));
		if (flag) {
			logger.info("ELD is not yet connected or ELD is disconnected.");
			BaseUtil.assertElementDisplayed(testProperties.getProperty(GaugePageConstant.GAUGEPAGE_ELD_POPUP_TITLE), message);
			BaseUtil.assertElementDisplayed(testProperties.getProperty(GaugePageConstant.GAUGEPAGE_ELD_POPUP_MESSAGE),
					message);
			gaugeScreen.verifyGaugePageELDPopupMessageTextValue(
					testProperties.getProperty(GaugePageConstant.GAUGEPAGE_ELD_POPUP_MESSAGE_TEXTVALUE));
			BaseUtil.assertElementDisplayed(testProperties.getProperty(GaugePageConstant.GAUGEPAGE_ELD_POPUP_OK_BUTTON),
					message);
			gaugeScreen.clickELDPopupOkButton();

		} else {
			logger.info("ELD is connected.");
		}
		Thread.sleep(1000);
		gaugeScreen.clickGaugePageCrossButton();
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
