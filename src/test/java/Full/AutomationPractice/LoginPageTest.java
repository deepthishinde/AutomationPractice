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

public class LoginPageTest extends Base {
	public WebDriver driver;
	String Name="Deepthi Mahesh";
	String Email="deepthi@gmail.com";
	LoginPageObject login;
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void getBrowserLogin() throws IOException
	{
		// initializeDriver from Base returns a driver
		driver = initializeDriver();
		log.info("Driver is initialized");
		// Now load & read data.properties file to get URL
		prop.load(fis);
		driver.get(prop.getProperty("url"));
		log.info("Navigated to Automation Practice page");
	}
	
	@Test(priority=1)
	public void goToLoginPage() throws IOException
	{
		login=new LoginPageObject(driver);
		login.LoginMenuClick().click();
		log.info("Clicked on Login Menu");
		String actual_loginPageUrl=driver.getCurrentUrl();
		String expected_loginPageUrl="https://www.automationexercise.com/login";
		Assert.assertEquals(actual_loginPageUrl,expected_loginPageUrl);		
		log.info("Navigated to Login Page");
	}
	@Test(priority=2)
	public void loginNewUser()
	{
		login=new LoginPageObject(driver);
		Assert.assertTrue(login.NewUserLoginText().isDisplayed());
		log.info("New User Login page is displayed");
		login.NewUserNameField().sendKeys(Name);
		login.NewUserEmailField().sendKeys(Email);
		login.NewUserSignUpButton().click();
		log.info("Entered Username Pwd & clicked on submit");
		String actual_signupPageUrl=driver.getCurrentUrl();
		String expected_signupPageUrl="https://www.automationexercise.com/signup";
		Assert.assertEquals(actual_signupPageUrl,expected_signupPageUrl);	
		log.info("Landed on Signup New user Details page");
		
		
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}
	

}
