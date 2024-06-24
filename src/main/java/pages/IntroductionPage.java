package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class IntroductionPage {
	WebDriver driver;

	public IntroductionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public String getPageText()
	{
		return driver.getPageSource();
	}
}
