package hooks;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;

import factory.DriverFactory;
import io.cucumber.java.Before;
import utils.ConfigReader;

public class ApplicationHooks {
	
	public static WebDriver driver;
	Properties prop;
	
	@Before
	public void setup()
	{
		prop = ConfigReader.initializeProperties();
		DriverFactory.initializeBrowser(prop.getProperty("browser"));
		System.out.println("Launching chrome---");
		driver = DriverFactory.getDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get(prop.getProperty("url"));
	}
	
//	@After
//	public void tearDown()
//	{
	
//		driver.close();
//	}
}
