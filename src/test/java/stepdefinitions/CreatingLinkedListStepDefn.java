package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreatingLinkedListPage;

public class CreatingLinkedListStepDefn {
	WebDriver driver;
	CreatingLinkedListPage creatingLinkedListPage;
	
	@Then("Title should be correct Creating Linked LIst page")
	public void title_should_be_correct_creating_linked_l_ist_page() {
		driver = DriverFactory.getDriver();
		creatingLinkedListPage = new CreatingLinkedListPage(driver);
		Assert.assertTrue(creatingLinkedListPage.getPageTitle().contains("Creating Linked LIst"));
	}

	@When("User clicks on Practice Question link on Creating Linked LIst page")
	public void user_clicks_on_practice_question_link_on_creating_linked_l_ist_page() {
		driver = DriverFactory.getDriver();
		creatingLinkedListPage = new CreatingLinkedListPage(driver);
		creatingLinkedListPage.doClick();
	}

	@Then("Practice Question page opens up")
	public void practice_question_page_opens_up() {
		Assert.assertTrue(creatingLinkedListPage.getPageTitle().contains("Practice Questions"));
	}
}
