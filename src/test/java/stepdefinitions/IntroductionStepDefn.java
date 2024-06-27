package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.IntroductionPage;
import utils.CommonUtils;


public class IntroductionStepDefn {
	WebDriver driver;
	IntroductionPage introductionPage;
	CommonUtils commonUtils;
	
	@Then("Text should be correct on Introduction page")
	public void text_should_be_correct_on_introduction_page() {
		driver = DriverFactory.getDriver();
		introductionPage = new IntroductionPage(driver);
		Assert.assertTrue(introductionPage.getPageText().contains("Linked lists are"));
	}
	
	@When("User clicks on Try here button on Introduction page")
	public void user_clicks_on_try_here_button_on_introduction_page() {
		driver = DriverFactory.getDriver();
		commonUtils = new CommonUtils(driver);
		commonUtils.doClickOnTryHereBtn();
	}
	
	@Then("Try here editor page opens up")
	public void try_here_editor_page_opens_up() {
		
		Assert.assertTrue(commonUtils.getPageURL().contains("tryEditor"));
	}
	
}
