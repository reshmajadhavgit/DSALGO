package utils;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CommonUtils {

	WebDriver driver;

	//***********************************Constructor*****************************************/
	public CommonUtils(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	//***********************************Locators******************************************/

	@FindBy(xpath = "//div[@class='nav-item dropdown']/div/a")
	private List<WebElement> dataStructuresDropDownList;

	@FindBy(xpath = "//div[@class='nav-item dropdown']")
	private WebElement dataStructuresDropDown;

	@FindBy(xpath = "//a[text()='NumpyNinja']")
	private WebElement numpyLogo;

	@FindBy(xpath = "//button[@type='button']")
	private WebElement runButton;

	@FindBy(xpath = "//div[@role='presentation']")
	private WebElement tryEditorPane;

	@FindBy(id = "output")
	private WebElement tryEditorOutput;

	@FindBy(xpath = "//a[text()='Sign out']")
	private WebElement signOutLink;

	@FindBy(xpath = "//a[text()=' Automationtechies ']")
	private WebElement userName;

	//**********************Page Actions ********************************************************/
	public List<WebElement> getdataStructuresDropDownList() {
		int optionsCount = dataStructuresDropDownList.size();
		System.out.println("The size of the Data Structures dropdown is: " + optionsCount);

		dataStructuresDropDown.click();

		for (int i = 0; i < optionsCount; i++) {
			String value = dataStructuresDropDownList.get(i).getText();
			System.out.println(value);
		}
		return dataStructuresDropDownList;
	}

	public int getDropdownCount() {
		return dataStructuresDropDownList.size();
	}

	public boolean isLogoPresent() {
		return numpyLogo.isDisplayed();
	}

	public boolean isDropdownDisplayed() {
		return dataStructuresDropDown.isDisplayed();
	}

	public String isTryEditorPageDisplayed() {
		return driver.getCurrentUrl();
	}

	public boolean isSignOutLinkDisplayed() {
		return signOutLink.isDisplayed();
	}

	public boolean isUserNameDisplayed() {
		return userName.isDisplayed();
	}

	public String verifyValidDataInTryEditor() {
		tryEditorPane.sendKeys("print 10");
		runButton.click();
		return tryEditorOutput.getText();
	}

	public void verifyAlertMessageInTryEditor() {
		tryEditorPane.clear();
		tryEditorPane.sendKeys("Test Message");
		runButton.click();
		Alert alert = driver.switchTo().alert();
		String alertMessage = driver.switchTo().alert().getText();
		System.out.println(alertMessage);
		alert.accept();
	}

	public String verifyBlankDataInTryEditor() {
		tryEditorPane.clear();
		runButton.click();
		return driver.getCurrentUrl();
	}

	public String verifyBackFromTryEditorPage() {
		driver.navigate().back();
		return driver.getCurrentUrl();
	}

}
