package Full.AutomationPractice;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class HomePageTest extends Base {
	public WebDriver driver;
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
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
	public void ValidateHomePage()
	{
		HomePageObjects home=new HomePageObjects(driver);
		Assert.assertTrue(home.HomeTitle().isDisplayed());
		log.info("Home Page Title is displayed");
		Assert.assertTrue(home.HomeMenu().isDisplayed());
		String actual_HomeTitle_Home=home.HomeMenuBlock().getText();
		String expected_HomeTitle_Home="Home";
		Assert.assertEquals(actual_HomeTitle_Home, expected_HomeTitle_Home);
		log.info("Home Menu is available");
		
	}
	
	
	
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	

}
