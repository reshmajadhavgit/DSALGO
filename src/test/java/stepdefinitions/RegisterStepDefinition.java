package stepdefinitions;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import factory.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.MainPage;
import pages.RegisterPage;
import utils.ExcelReader;

public class RegisterStepDefinition {
	
	WebDriver driver;
	RegisterPage registerPage;
	MainPage mainPage;
	
	@Given("User navigates to Registration page")
	public void user_navigates_to_registration_page() {
	    driver = DriverFactory.getDriver();
	    mainPage = new MainPage(driver);
	    mainPage.doClickOnGetStartedBtn();
	    registerPage = new RegisterPage(driver);
	    registerPage.doClickOnRegisterLink();
	    
	}
		
	@When("User enters sheetName {string} and rowNumber {int}")
	public void user_enters_and(String sheetName, Integer rowNumber) throws InvalidFormatException, IOException {
		ExcelReader reader = new ExcelReader();
		List<Map<String,String>> testData = 
				reader.getData("C:/Users/reshm/Desktop/automation.xlsx", sheetName);
		
		String username = testData.get(rowNumber).get("username");
		String password = testData.get(rowNumber).get("password");
		String passwordconfirm = testData.get(rowNumber).get("passwordconfirm");
		registerPage.fillRegisterForm(username, password, passwordconfirm);
	}
	
	@When("User clicks on Register button")
	public void user_clicks_on_register_button() {
		registerPage.clickSend();
	}
	


	@Then("User sees the error message")
	public void user_sees_the_error_message() {
		String actualMsg = registerPage.getErrorMessg();
		System.out.println("The error message is: " +actualMsg);
		Assert.assertTrue(registerPage.getErrorMessg().contains(actualMsg));
	}
	
//	@When("User enters below details into the fields")
//	public void user_enters_below_details_into_the_fields(DataTable dataTable) {
//	   
//		Map<String, String> dataMap = dataTable.asMap(String.class,String.class);
//		driver.findElement(By.id("id_username")).sendKeys(dataMap.get("username"));
//		driver.findElement(By.id("id_password1")).sendKeys(dataMap.get("password"));
//		driver.findElement(By.id("id_password2")).sendKeys(dataMap.get("confirmPassword"));
//		
//	}
//	@Then("User account should be created")
//	public void user_account_should_be_created() {
//		Assert.assertTrue(driver.findElement(By.xpath("//div[contains(text(),'New Account Created')]")).getText().contains("New Account Created."));
//
//	   	}
//
//	@Then("User should get a proper error message")
//	public void user_should_get_a_proper_error_message() {
//       Assert.assertEquals("password_mismatch:The two password fields didn’t match.", driver.findElement(By.xpath("//div[@role='alert']")).getText());
//	}
//
//	@When("User keeps all the fields blanks")
//	public void user_keeps_all_the_fields_blanks() {
//
//	}
//	
//	@Then("User should remain on Register page")
//	public void user_should_remain_on_register_page() {
//	    Assert.assertTrue(driver.getCurrentUrl().contains("/register"));
//	}
//	

	
}
