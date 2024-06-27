package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RegisterPage {
	
	WebDriver driver;

	public RegisterPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "id_username")
	private WebElement userName;
	
	@FindBy(id = "id_password1")
	private WebElement passWord;
	
	@FindBy(id = "id_password2")
	private WebElement confirmPassword;
	
	@FindBy(xpath = "//input[@type='submit']")
	private WebElement registerBtn;
	
	@FindBy(xpath = "//a[text()=' Register ']")
	private WebElement registerLink;
	
	//div[@role='alert']
	
	@FindBy(xpath = "//div[@role='alert']")
	private WebElement errorMsg;
	
	public String getRegisterPageTitle() {
		return driver.getTitle();
	}
	
	public void fillRegisterForm(String userID, String password, String confirmPasswordID) {
		
		userName.sendKeys(userID);
		passWord.sendKeys(password);
		confirmPassword.sendKeys(confirmPasswordID);
	}

	public void clickSend() {
		registerBtn.click();
	}
	
	public String getErrorMessg() {
		return errorMsg.getText();
	}
	
		
	public void doClickOnRegisterLink()
	{
		registerLink.click();
	}
	



}
