package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class TraversalPage {
	WebDriver driver;

	public TraversalPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	
	public String getPageText()
	{
		return driver.getPageSource();
	}
}
