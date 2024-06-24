package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.TraversalPage;
import utils.CommonUtils;

public class TraversalStepDefn {
	WebDriver driver;
	TraversalPage traversalPage;
	CommonUtils commonUtils;
	
	@Then("Text should be correct on Traversal page")
	public void text_should_be_correct_on_traversal_page() {
		driver = DriverFactory.getDriver();
		traversalPage = new TraversalPage(driver);
		Assert.assertTrue(traversalPage.getPageText().contains("Traversals("));
	}

	@When("User clicks on Try here button on Traversal page")
	public void user_clicks_on_try_here_button_on_traversal_page() {
		driver = DriverFactory.getDriver();
		commonUtils = new CommonUtils(driver);
		commonUtils.doClickOnTryHereBtn();
	}

	@Then("Try here editor page opens up on Traversal page")
	public void try_here_editor_page_opens_up_on_traversal_page() {
		Assert.assertTrue(commonUtils.getPageURL().contains("tryEditor"));
	}

	@Then("Numpy Ninja logo should be visible")
	public void numpy_ninja_logo_should_be_visible() {
		driver = DriverFactory.getDriver();
		commonUtils = new CommonUtils(driver);
	    Assert.assertTrue(commonUtils.isLogoPresent());
	}


}
