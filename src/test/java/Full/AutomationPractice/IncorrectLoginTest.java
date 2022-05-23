package Full.AutomationPractice;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class IncorrectLoginTest extends Base{
	
	public static Logger log=LogManager.getLogger(Base.class.getName());
	public WebDriver driver;
	HomePageObjects home;
	LoginPageObject login;
	
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
 public void validateIncorrectLogin()
 {
	 home=new HomePageObjects(driver);
		login=new LoginPageObject(driver);
		Assert.assertTrue(home.HomeTitle().isDisplayed());
		log.info("Home Page Title is displayed");
		home.HomePageLoginMenu().click();
		String actual_loginPageUrl=driver.getCurrentUrl();
		String expected_loginPageUrl="https://www.automationexercise.com/login";
		Assert.assertEquals(actual_loginPageUrl,expected_loginPageUrl);		
		log.info("Navigated to Login Page");
		JavascriptExecutor js=(JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
		login.LoginExistEmail().sendKeys(prop.getProperty("LoginIncorrectEmail"));
		login.LoginExistPwd().sendKeys(prop.getProperty("LoginIncorrectPwd"));
		login.LoginExistButton().click();
		Assert.assertTrue(login.IncorrectLoginMsg().isDisplayed());
		String actualIncorrectLoginMsg=login.IncorrectLoginMsg().getText();
		String expectedIncorrectLoginMsg=prop.getProperty("IncorrectLoginMsg");
		Assert.assertEquals(actualIncorrectLoginMsg, expectedIncorrectLoginMsg);
 }
 
 @AfterTest
	public void tearDown()
	{
		driver.close();
	}
}
