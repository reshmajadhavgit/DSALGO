package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class PracticeQuestionQueuePage {
	
WebDriver driver;
	
	
	public  PracticeQuestionQueuePage(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);
	}
	
	public void getCurrentURLOfPracticepage() {
		driver.getCurrentUrl();
	}
}



	


