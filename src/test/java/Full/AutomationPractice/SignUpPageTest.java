package Full.AutomationPractice;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.Base;

public class SignUpPageTest extends Base{
	public WebDriver driver;
	String Name="Deepthi Mahesh";
	String Email="deepthi@gmail.com";
	public SignUpPageObject signup;
	public static Logger log=LogManager.getLogger(Base.class.getName());
	
	@BeforeTest
	public void getBrowserLogin() throws IOException
	{
		// initializeDriver from Base returns a driver
		driver = initializeDriver();
		log.info("Driver is initialized");
		// Now load & read data.properties file to get URL
		prop.load(fis);
		driver.get(prop.getProperty("url_SignupPage"));
		log.info("On New user SignUp Page");
	}
	@Test(priority=1)
	public void NewUserSignup()
	{
		signup=new SignUpPageObject(driver);
		signup.Name().sendKeys(Name);
		signup.Email_Signup().sendKeys(Email);
		signup.SignUpButton().click();
		log.info("Entered Usrname, Pwd & clicked on submit");
		String actual_signupPageUrl=driver.getCurrentUrl();
		String expected_signupPageUrl="https://www.automationexercise.com/signup";
		Assert.assertEquals(actual_signupPageUrl,expected_signupPageUrl);						
		Assert.assertTrue(signup.SignUpPageTitle().isDisplayed());
		signup.GenderCheckBox().click();
		String name_populated=signup.Name().getAttribute("value");
		Assert.assertEquals(name_populated, Name);
		String email_populated=signup.Email().getAttribute("value");
		Assert.assertEquals(email_populated, Email);
		signup.Password().sendKeys("deep24times");
		Select days=new Select(signup.Days());
		days.selectByValue("24");
		Select month=new Select(signup.Months());
		month.selectByValue("12");
		Select year=new Select(signup.Years());
		year.selectByValue("1984");
		signup.NewsletterCheckbox().click();
		signup.SplOffersCheckbox().click();
		log.info("Entered all the details of New user & before clicking create account");
		
	
	}
	
	@Test(priority=2)
	public void addressDetails()
	{
		signup=new SignUpPageObject(driver);
		Assert.assertTrue(signup.AddressInfoTitle().isDisplayed());
		signup.FirstName().sendKeys("Deepthi");
		signup.LastName().sendKeys("Mahesh");
		signup.Company().sendKeys("home");
		signup.Address1().sendKeys("Lazy Lane");
		signup.Address2().sendKeys("True Lane, 1234, Home");
		Select country=new Select(signup.Country());
		country.selectByValue("India");
		signup.State().sendKeys("Karnatake");
		signup.City().sendKeys("Bangalore");
		signup.Zipcode().sendKeys("234566");
		signup.Mobile().sendKeys("9743784703");
		//signup.CreateAcc().click();
	}
	/*
	@Test(priority=3)
   public void AccountCreated()
   {
		signup=new SignUpPageObject(driver);
		String actual_accCreatedPageUrl=driver.getCurrentUrl();
		String expected_accCreatedPageUrl="https://www.automationexercise.com/account_created";
		Assert.assertEquals(actual_accCreatedPageUrl,expected_accCreatedPageUrl);						
		Assert.assertTrue(signup.AccountCreatedTitle().isDisplayed());
		signup.ContinueButton().click();
		String ActualUser=signup.LoggedInUser().getAttribute("value");
		Assert.assertEquals(ActualUser,Name);
		
   }
	*/
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
