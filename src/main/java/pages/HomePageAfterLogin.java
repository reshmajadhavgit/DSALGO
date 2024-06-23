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
	
	@FindBy (xpath="//h5[text()='Array']/parent::div/p/following-sibling::a[text()='Get Started']")
	private WebElement arrayGetStartedButton;
	
<<<<<<< HEAD
	@FindBy (xpath="//h5[text()='Tree']/parent::div/p/following-sibling::a[text()='Get Started']")
	private WebElement treeGetStartedButton;
	
	@FindBy (xpath="//h5[text()='Graph']/parent::div/p/following-sibling::a[text()='Get Started']")
	private WebElement graphGetStartedButton;
	
=======
	@FindBy (xpath="//h5[text()='Stack']/parent::div/p/following-sibling::a[text()='Get Started']")
	private WebElement stackGetStartedButton;
	
	@FindBy(xpath="//h5[text()='Queue']/parent::div/p/following-sibling::a[text()='Get Started']")
		private WebElement queueGetStartedButton;
	
	@FindBy(xpath="//h5[text()='Graph']/parent::div/p/following-sibling::a[text()='Get Started']")
	private WebElement graphGetStartedButton;
	

>>>>>>> 1ccb3c61f147bd8f39e1d0da09d587232e00a9ae
	public String getSuccessfulLoginMsg()
	{
		String actualText = successfulLoginMsg.getText();
		System.out.println("Successful login message is displayed: " +actualText);
		return actualText;
	}
	
	public void doClickOnArrayGetStarted()
	{
		arrayGetStartedButton.click();
	}
<<<<<<< HEAD
	
	public void doClickOnTreeGetStarted()
	{
		treeGetStartedButton.click();
	}
	
	public void doClickOnGraphGetStarted()
	{
		graphGetStartedButton.click();
	}
=======
	public void doClickOnStackGetStarted()
	{
		stackGetStartedButton.click();
	}
	public void doClickOnQueueGetStarted() {
	queueGetStartedButton.click();
>>>>>>> 1ccb3c61f147bd8f39e1d0da09d587232e00a9ae
}
	public void doClickOnGraphGetStarted() {
		graphGetStartedButton.click();
	}
}