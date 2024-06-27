package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ImplementLinkedListPage;
import utils.CommonUtils;

public class ImplementLinkedListStepDefn {
	WebDriver driver;
	ImplementLinkedListPage implementLinkedListPage;
	CommonUtils commonUtils;
	
	@Then("Text should be correct on Implement Linked List in Python page")
	public void text_should_be_correct_on_implement_linked_list_in_python_page() {
		driver = DriverFactory.getDriver();
		implementLinkedListPage = new ImplementLinkedListPage(driver);
		Assert.assertTrue(implementLinkedListPage.getPageText().contains("Linked lists are"));
	}

	@When("User clicks on Try here button on Implement Linked List in Python page")
	public void user_clicks_on_try_here_button_on_implement_linked_list_in_python_page() {
		driver = DriverFactory.getDriver();
		commonUtils = new CommonUtils(driver);
		commonUtils.doClickOnTryHereBtn();
	}

	@Then("Try here editor page opens up on Implement Linked List in Python page")
	public void try_here_editor_page_opens_up_on_implement_linked_list_in_python_page() {
		Assert.assertTrue(commonUtils.getPageURL().contains("tryEditor"));
	}

}
