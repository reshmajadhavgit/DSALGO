package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LinkedListPage;

public class LinkedListStepDefn {
	WebDriver driver;
	LinkedListPage linkedListPage;
	
	@Then("Linked List url should be correct")
	public void linked_list_url_should_be_correct() {
	    driver = DriverFactory.getDriver();
	    linkedListPage = new LinkedListPage(driver);
		Assert.assertTrue(linkedListPage.getPageURL().contains("linked-list/"));
	}
	
	@When("User clicks on link {string} on Linked List page")
	public void user_clicks_on_links_on_linked_list_page(String PageLink) {
		driver = DriverFactory.getDriver();
	    linkedListPage = new LinkedListPage(driver);
	    linkedListPage.doClickOnLink(PageLink);
	}

	@Then("User navigate to the respective Linked List {string} page")
	public void user_navigate_to_the_respective_linked_list_page(String pageTitle) {
		Assert.assertTrue(linkedListPage.getPageTitle().contains(pageTitle));
	}
	
	@Then("{string} page opens up on Linked List page")
	public void page_opens_up_on_linked_list_page(String pageLink) {
		driver = DriverFactory.getDriver();
	    linkedListPage = new LinkedListPage(driver);
	    linkedListPage.doClickOnLink(pageLink);
	}

}
