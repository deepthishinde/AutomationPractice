package Full.AutomationPractice;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class CorrectLoginTest extends Base{
	public static Logger log=LogManager.getLogger(Base.class.getName());
	public WebDriver driver;
	
	@BeforeTest
	public void getBrowser() throws IOException
	{
		//initializeDriver from Base returns a driver
		driver=initializeDriver();
		log.info("Driver is initialized");
		//Now load & read data.properties file to get URL
		prop.load(fis);
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Automation Practice page");
	}
	
	@Test
	public void validateCorrectLogin()
	{
		
	}
	

}
