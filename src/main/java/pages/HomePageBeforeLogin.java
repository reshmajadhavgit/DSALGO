package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageBeforeLogin {

	WebDriver driver;

	// HomePageBeforeLogin Constructor
	public HomePageBeforeLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	// HomePageBeforeLogin Locators
	@FindBy(xpath= "//a[text()='Sign in']")
	private WebElement signInLink;
	
	//MainPage actions
	public void doClickOnSignInLink() {
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(signInLink)).click();
		
	}

}
