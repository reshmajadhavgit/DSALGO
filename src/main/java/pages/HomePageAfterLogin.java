package pages;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePageAfterLogin {
	WebDriver driver;

	public HomePageAfterLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//div[contains(text(),'You are logged in')]")
	private WebElement successfulLoginMsg;

	@FindBy(xpath = "//h5[text()='Array']/parent::div/p/following-sibling::a[text()='Get Started']")
	private WebElement arrayGetStartedButton;

	@FindBy(xpath = "//h5[text()='Tree']/parent::div/p/following-sibling::a[text()='Get Started']")
	private WebElement treeGetStartedButton;

	@FindBy(xpath = "//h5[text()='Stack']/parent::div/p/following-sibling::a[text()='Get Started']")
	private WebElement stackGetStartedButton;

	@FindBy(xpath = "//h5[text()='Queue']/parent::div/p/following-sibling::a[text()='Get Started']")
	private WebElement queueGetStartedButton;

	@FindBy(xpath = "//h5[text()='Graph']/parent::div/p/following-sibling::a[text()='Get Started']")
	private WebElement graphGetStartedButton;

	@FindBy(xpath = "//h5[text()='Linked List']/parent::div/p/following-sibling::a[text()='Get Started']")

	private WebElement linkedListGetStartedButton;

	public String getSuccessfulLoginMsg() {
		String actualText = successfulLoginMsg.getText();
		System.out.println("Successful login message is displayed: " + actualText);
		return actualText;
	}

	public void doClickOnArrayGetStarted() {
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(arrayGetStartedButton)).click();
	}

	public void doClickOnLLGetStarted() {
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(linkedListGetStartedButton)).click();
	}

	public void doClickOnTreeGetStarted() {

		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(treeGetStartedButton)).click();
	}

	public void doClickOnStackGetStarted() {
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(stackGetStartedButton)).click();
	}

	public void doClickOnQueueGetStarted() {
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(queueGetStartedButton)).click();
	}

	public void doClickOnGraphGetStarted() {
		Wait<WebDriver> wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.visibilityOf(graphGetStartedButton)).click();
	}

}