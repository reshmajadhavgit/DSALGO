package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.CreatingLinkedListPage;
import pages.TypesofLinkedListPage;

public class TypesofLinkedListStepDefn {
	WebDriver driver;
	TypesofLinkedListPage typesofLinkedListPage;
	
	@Then("Title should be correct on Types of Linked List page")
	public void title_should_be_correct_on_types_of_linked_list_page() {
		driver = DriverFactory.getDriver();
		typesofLinkedListPage = new TypesofLinkedListPage(driver);
		Assert.assertTrue(typesofLinkedListPage.getPageTitle().contains("Types of Linked List"));
	}

	@When("User clicks on Practice Question link on Types of Linked List page")
	public void user_clicks_on_practice_question_link_on_types_of_linked_list_page() {
		driver = DriverFactory.getDriver();
		typesofLinkedListPage = new TypesofLinkedListPage(driver);
		typesofLinkedListPage.doClick();
	}
	
	@Then("Practice Question page opens up on Types of Linked List page")
	public void practice_question_page_opens_up_on_types_of_linked_list_page() {
		Assert.assertTrue(typesofLinkedListPage.getPageTitle().contains("Practice Questions"));
	}

}
