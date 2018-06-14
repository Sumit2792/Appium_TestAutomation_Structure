package com.mw.tests;

import java.io.IOException;

import org.apache.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import com.mw.constants.PathConstants;
import com.mw.constants.RuleSetsPageConstant;
import com.mw.pages.DashboardScreenPageObject;
import com.mw.pages.RuleSetsScreenPageObject;
import com.mw.testBase.TestBase;
import com.mw.utils.BaseUtil;

/**
 * 
 * @author Sumit Srivastava
 *
 */

public class RuleSetsPageTest extends TestBase {

	private Logger logger = Logger.getLogger(RuleSetsPageTest.class);

	private RuleSetsScreenPageObject ruleSetScreen;
	private DashboardScreenPageObject dashboardScreen;

	/*
	 * Initialize all the objects and the properties files.
	 * 
	 */
	public RuleSetsPageTest() throws Exception {
		super();
		String resourceFilePath = PathConstants.PROPERTIES_BASEPATH + RuleSetsScreenPageObject.RULESET_PAGE
				+ PathConstants.FORWARD_SLASH;
		ruleSetScreen = new RuleSetsScreenPageObject(driver);
		dashboardScreen = new DashboardScreenPageObject(driver);
		testProperties.putAll(BaseUtil.readPropertyFile(resourceFilePath, PathConstants.COMMON));
		testProperties.putAll(BaseUtil.readPropertyFile(resourceFilePath, platform));
	}

	/*
	 * @Test Name : TC01_RuleSetsPage
	 * @Test Description : This test cases verifies the visibility of RuleSets page.
	 */
	@Test(priority = 1)
	public void TC01_RuleSetsPage() throws Exception {
		logger.info("TC01_RuleSetPage Test Suite Started");
		Thread.sleep(3000);
		dashboardScreen.clickRuleSetsButton();
		String message = "RuleSet Page is not yet displayed.";
		(new WebDriverWait(driver, 100)).until(ExpectedConditions.presenceOfElementLocated(
				BaseUtil.getLocator(testProperties.getProperty(RuleSetsScreenPageObject.RULESET_PAGE))));
		BaseUtil.assertElementDisplayed(testProperties.getProperty(RuleSetsScreenPageObject.RULESET_PAGE), message);
	}

	/*
	 * @Test Name : TC02_RuleSetsPageElements
	 * @Test Description : This test cases verifies the visibility of Elements of RuleSets Page
	 */
	@Test(priority = 2)
	public void TC02_RuleSetsPageElements() throws Exception {
		logger.info("TC02_RuleSetPageElements Test Suite Started");
		Thread.sleep(3000);
		String message = "RuleSets Page Elements are not yet displayed on RuleSet page";

		// RuleSets Page Elements loaded
		BaseUtil.assertElementDisplayed(testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_SUMMARY_BUTTON),
				message);
		ruleSetScreen.verifyRuleSetPageSummaryButtonText(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_SUMMARY_BUTTON_TEXT));
		BaseUtil.assertElementDisplayed(testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_LIMIT_BUTTON),
				message);
		ruleSetScreen.verifyRuleSetPageLimitButtonText(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_LIMIT_BUTTON_TEXT));
		BaseUtil.assertElementDisplayed(testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_HEADER), message);
		ruleSetScreen.verifyRuleSetPageHeaderText(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_HEADER_TEXT));

		ruleSetScreen.clickSummaryButton();
		Thread.sleep(3000);
		dashboardScreen.clickRuleSetsButton();
	}

	/*
	 * @Test Name : TC03_RuleSetsPageRuleSetRules
	 * @Test Description : This test cases verifies the visibility and text contains of Rules under RuleSets Page.
	 */
	@Test(priority = 3)
	public void TC03_RuleSetsPageRuleSetRules() throws Exception {
		logger.info("TC03_RuleSetsPageRuleSetRules Test Suite Started");
		Thread.sleep(3000);
		String message = "RuleSets Page Rules are not yet displayed on RuleSet page";

		// RuleSets Page Rules loaded
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES),
				message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES),
				message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES),
				message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES),
				message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES),
				message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES),
				message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(testProperties
				.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES),
				message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES),
				message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES),
				message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES),
				message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES),
				message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES),
				message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES),
				message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES),
				message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES),
				message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES),
				message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES),
				message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES),
				message);
		BaseUtil.assertElementDisplayed(testProperties
				.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(testProperties
				.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES),
				message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES),
				message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES),
				message);
		BaseUtil.assertElementDisplayed(testProperties
				.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES),
				message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES),
				message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES),
				message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES), message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES),
				message);
		BaseUtil.assertElementDisplayed(
				testProperties.getProperty(RuleSetsPageConstant.RULESETS_PAGE_RULES),
				message);

	}
	
	/*
	 * @Test Name : TC04_RuleSetsPageLimitButtonElements
	 * @Test Description : This test cases verifies the visibility of Elements and its text contains after click on
	 * Limit Button.
	 */
	@Test(priority = 4)
	public void TC04_RuleSetsPageLimitButtonElements() throws Exception {
		logger.info("TC04_RuleSetsPageLimitButtonElements Test Suite Started");
		Thread.sleep(3000);
		String message = "Limit Button Page Elements are not yet displayed on RuleSet page";

		ruleSetScreen.clickLimitsButton();
		// RuleSets Page Elements loaded
		BaseUtil.assertElementDisplayed(testProperties.getProperty(RuleSetsPageConstant.DRIVING_STANDARDS_BUTTON),
				message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty(RuleSetsPageConstant.DRIVING_STANDARDS_LIMIT_PAGE_HEADER),
				message);
		ruleSetScreen.verifyRuleSetPageSummaryButtonText(
				testProperties.getProperty(RuleSetsPageConstant.DRIVING_STANDARDS_LIMIT_PAGE_HEADER_TEXT));
		BaseUtil.assertElementDisplayed(testProperties.getProperty(RuleSetsPageConstant.CALCULATE_LIST_8_DAYS),
				message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty(RuleSetsPageConstant.CALCULATE_LIST_14_DAYS),
				message);
		BaseUtil.assertElementDisplayed(testProperties.getProperty(RuleSetsPageConstant.CALCULATE_LIST_MONTH),
				message);

		ruleSetScreen.clickDrivingStandardsButton();
		ruleSetScreen.clickSummaryButton();
		Thread.sleep(3000);
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
