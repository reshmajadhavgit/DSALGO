package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.DeletionPage;
import utils.CommonUtils;

public class DeletionStepDefn {
	WebDriver driver;
	DeletionPage deletionPage;
	CommonUtils commonUtils;
	
	@Then("Title should be correct Deletion page")
	public void title_should_be_correct_deletion_page() {
		driver = DriverFactory.getDriver();
		deletionPage = new DeletionPage(driver);
		Assert.assertTrue(deletionPage.getPageTitle().contains("Deletion"));
	}

	@When("User clicks on Practice Question link on Deletion page")
	public void user_clicks_on_practice_question_link_on_deletion_page() {
		driver = DriverFactory.getDriver();
		deletionPage = new DeletionPage(driver);
		deletionPage.doClick();
	}

	@Then("Practice Question page opens up on Deletion page")
	public void practice_question_page_opens_up_on_deletion_page() {
		Assert.assertTrue(deletionPage.getPageTitle().contains("Practice Questions"));
	}

	@Then("Data Structures drop down should be displayed on Deletion page")
	public void data_structures_drop_down_should_be_displayed_on_deletion_page() {
		driver = DriverFactory.getDriver();
		commonUtils = new CommonUtils(driver);
		Assert.assertTrue(commonUtils.isDropdownDisplayed());
	}

	@Then("username should be displayed on Deletion page")
	public void username_should_be_displayed_on_deletion_page() {
		driver = DriverFactory.getDriver();
		commonUtils = new CommonUtils(driver);
		Assert.assertTrue(commonUtils.isUserNameDisplayed());
	}

	@Then("Signout link should be displayed on Deletion page")
	public void signout_link_should_be_displayed_on_deletion_page() {
		driver = DriverFactory.getDriver();
		commonUtils = new CommonUtils(driver);
		Assert.assertTrue(commonUtils.isUserNameDisplayed());
	}

}
