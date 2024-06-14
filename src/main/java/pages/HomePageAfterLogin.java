package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePageAfterLogin {
	WebDriver driver;
	
	public HomePageAfterLogin(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//div[contains(text(),'You are logged in')]")
	private WebElement successfulLoginMsg;
	
	public String getSuccessfulLoginMsg()
	{
		String actualText = successfulLoginMsg.getText();
		System.out.println("Successful login message is displayed: " +actualText);
		return actualText;
	}
}
