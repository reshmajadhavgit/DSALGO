package stepdefinitions;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import logger.Log;
import pages.HomePageAfterLogin;
import pages.HomePageBeforeLogin;
import pages.LoginPage;
import pages.MainPage;

public class LoginStepDefinition {
	public static WebDriver driver;
	MainPage mainPage;
	HomePageBeforeLogin homePageBeforeLogin;
	LoginPage loginPage;
	HomePageAfterLogin homePageAfterLogin;

	@Given("User is on the Login page")
	public void user_is_on_the_login_page() {
		driver = DriverFactory.getDriver();
		mainPage = new MainPage(driver);
		mainPage.doClickOnGetStartedBtn();
		homePageBeforeLogin = new HomePageBeforeLogin(driver);
		homePageBeforeLogin.doClickOnSignInLink();
		Log.info("User is on the Login page...");
	}

	@When("User enters invalid credentials userName {string} and passWord {string}")
	public void user_enters_invalid_credentials_user_name_and_pass_word(String userName, String passWord) {
		loginPage = new LoginPage(driver);
		loginPage.enterLoginCredentials(userName, passWord);
	}

	@And("User clicks on Login button")
	public void user_clicks_on_login_button() {
		loginPage.doClickLoginBtn();
	}

	@Then("User sees the error message on Login page")
	public void user_sees_the_error_message_on_login_page() {

		System.out.println("Error message is: " + loginPage.verifyErrorMsg());
		Log.error("Error message is: " + loginPage.verifyErrorMsg());
		Assert.assertTrue(loginPage.verifyErrorMsg().contains("Invalid Username and"));
	}

	@When("User enters username {string} and enters password {string}")
	public void user_enters_username_and_enters_password(String username, String password) {
		loginPage = new LoginPage(driver);
		Log.info("Entering username and password");
		loginPage.enterLoginCredentials(username, password);

	}
	@Then("User is logged in to home page")
	public void User_is_logged_in_to_home_page() {
		homePageAfterLogin = new HomePageAfterLogin(driver);
		Assert.assertTrue(homePageAfterLogin.getSuccessfulLoginMsg().contains("You are logged in"));
	}
}
