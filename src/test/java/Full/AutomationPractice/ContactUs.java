package Full.AutomationPractice;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class ContactUs extends Base{
	public static Logger log=LogManager.getLogger(Base.class.getName());
	public WebDriver driver;
	HomePageObjects home;
	LoginPageObject login;
	ContactUsObject con;
	
	
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
	public void validateContactUs()
	{
		home=new HomePageObjects(driver);
		con=new ContactUsObject(driver);
	    home.ContactUs().click();
	    String actual_contactPageUrl=driver.getCurrentUrl();
		String expected_contactPageUrl=prop.getProperty("ContactUsUrl");
		Assert.assertEquals(actual_contactPageUrl,expected_contactPageUrl);	
		con.ContactUsName().sendKeys(prop.getProperty("contactUsName"));
		con.ContactUsEmail().sendKeys(prop.getProperty("contactUsEmail"));
		con.ContactUsSub().sendKeys(prop.getProperty("contactUsSub"));
		con.ContactUsMsg().sendKeys(prop.getProperty("contactUsMsg"));
		con.ContactUsChooseFile().sendKeys("C:\\Users\\DEEPTHI\\Desktop\\Test.docx");
		con.ContactUsSubmit().click();
		
		Alert alert=driver.switchTo().alert();
		alert.dismiss();
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
