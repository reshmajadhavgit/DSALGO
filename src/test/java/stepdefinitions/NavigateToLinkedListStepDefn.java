package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.ArraysPage;
import pages.HomePageAfterLogin;
import pages.HomePageBeforeLogin;
import pages.LinkedListPage;
import pages.LoginPage;
import pages.MainPage;
import utils.CommonUtils;

public class NavigateToLinkedListStepDefn {
	WebDriver driver;
	HomePageAfterLogin homePageAfterLogin;
	HomePageBeforeLogin homePageBeforeLogin;
	ArraysPage arraysPage;
	CommonUtils commonUtils;
	LoginPage loginPage;
	MainPage mainPage;
	LinkedListPage linkedListPage;
	
	@When("User clicks the Get Started button from Linked List section")
	public void user_clicks_the_get_started_button_from_linked_list_section() {
		driver = DriverFactory.getDriver();
		homePageAfterLogin = new HomePageAfterLogin(driver);
		homePageAfterLogin.doClickOnLLGetStarted();
	}
	
	@When("User clicks the Linked List option from Data Structures dropdown")
	public void user_clicks_the_linked_list_option_from_data_structures_dropdown() {
		driver = DriverFactory.getDriver();
		commonUtils = new CommonUtils(driver);
		commonUtils.doSelectLinkedListOptionFromDropDown();
	}


	@Then("Linked List page opens up successfully")
	public void linked_list_page_opens_up_successfully() {
		linkedListPage = new LinkedListPage(driver);
	   Assert.assertTrue(linkedListPage.getPageURL().contains("linked-list/"));
	}
	
}
