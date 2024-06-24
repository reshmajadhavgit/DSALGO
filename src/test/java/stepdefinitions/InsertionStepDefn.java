package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.InsertionPage;
import utils.CommonUtils;

public class InsertionStepDefn {
	WebDriver driver;
	InsertionPage insertionPage;
	CommonUtils commonUtils;
	
	@Then("Title should be correct Insertion page")
	public void title_should_be_correct_insertion_page() {
		driver = DriverFactory.getDriver();
		insertionPage = new InsertionPage(driver);
		Assert.assertTrue(insertionPage.getPageTitle().contains("Insertion"));
	}

	@When("User clicks on Practice Question link on Insertion page")
	public void user_clicks_on_practice_question_link_on_insertion_page() {
		driver = DriverFactory.getDriver();
		insertionPage = new InsertionPage(driver);
		insertionPage.doClick();
	}

	@Then("Practice Question page opens up on Insertion page")
	public void practice_question_page_opens_up_on_insertion_page() {
		Assert.assertTrue(insertionPage.getPageTitle().contains("Practice Questions"));
	}

	@Then("Data Structures drop down should be displayed on Insertion page")
	public void data_structures_drop_down_should_be_displayed_on_insertion_page() {
		driver = DriverFactory.getDriver();
		commonUtils = new CommonUtils(driver);
		Assert.assertTrue(commonUtils.isDropdownDisplayed());
	}

	@Then("username should be displayed on Insertion page")
	public void username_should_be_displayed_on_insertion_page() {
		driver = DriverFactory.getDriver();
		commonUtils = new CommonUtils(driver);
		Assert.assertTrue(commonUtils.isUserNameDisplayed());
	}


}
