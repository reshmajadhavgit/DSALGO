package pages;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LinkedListPage {
	WebDriver driver;

	
	public LinkedListPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
   @FindBy(xpath="//ul/a[@class='list-group-item']")
	private List<WebElement> list;

   public String getPageURL()
	{
		return driver.getCurrentUrl();
	}
	
   public String getPageTitle()
	{
		return driver.getTitle();
	}
	public String doClickOnLink(String pageLink) {

		String pageTitle = null;
		int linkListSize = list.size();
		System.out.println("The size is: "+linkListSize);
		for (int i = 0; i < linkListSize; i++) {
			String linkText = list.get(i).getText();
			if(linkText.equals(pageLink))
			{
				list.get(i).click();
				pageTitle = driver.getTitle();
				System.out.println("The title of the page is: "+pageTitle);
				break;
			}
		}
		return pageTitle;
	}
}
