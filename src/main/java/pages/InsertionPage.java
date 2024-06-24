package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsertionPage {
	WebDriver driver;

	public InsertionPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy (xpath="//a[text()='Practice Questions']")
	private WebElement practiceQuestionsLink;
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public void doClick()
	{
		practiceQuestionsLink.click();
	}

}
