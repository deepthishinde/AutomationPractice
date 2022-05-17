package Full.AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SignUpPageObject {
public WebDriver driver;
	
	//Constructor
	public SignUpPageObject(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By SignUpPageTitle_xpath=By.xpath("//b[text()='Enter Account Information']");
	By genderTitle_xpath=By.id("id_gender2");
	By name_xpath=By.xpath("//input[@name='name']");
	By emailSign_xpath=By.xpath("//input[@data-qa='signup-email']");
	By SignUpbtn_xpath=By.xpath("//button[@data-qa='signup-button']");
	By email_xpath=By.xpath("//input[@data-qa='email']");
	By password_xpath=By.id("password");
	By days_xpath=By.xpath("//select[@id='days']");
	By months_xpath=By.xpath("//select[@id='months']");
	By year_xpath=By.xpath("//select[@id='years']");
	By newsletter_xpath=By.xpath("//input[@id='newsletter']");
	By splOffers_xpath=By.xpath("//input[@id='optin']");
	
	By AddressInfoTitle_xpath=By.xpath("//b[text()='Address Information']");
	By FirstName_xpath=By.xpath("//input[@data-qa='first_name']");
	By LastName_xpath=By.xpath("//input[@data-qa='last_name']");
	By Company_xpath=By.xpath("//input[@data-qa='company']");
	By Address1_xpath=By.xpath("//input[@data-qa='address']");
	By Address2_xpath=By.xpath("//input[@data-qa='address2']");
	By Country_xpath=By.xpath("//select[@data-qa='country']");
	By State_xpath=By.xpath("//input[@data-qa='state']");
	By City_xpath=By.xpath("//input[@data-qa='city']");
	By Zipcode_xpath=By.xpath("//input[@data-qa='zipcode']");
	By Mobile_xpath=By.xpath("//input[@data-qa='mobile_number']");
	By CreateAcc_xpath=By.xpath("//button[@data-qa='create-account']");
	
	By AccountCreatedTitle_xpath=By.xpath("//b[text()='Account Created!']");
	By ContinueBtn_xpath=By.xpath("//a[@data-qa='continue-button']");
	By LoggedInUser_xpath=By.xpath("//*[@class='shop-menu pull-right']/ul/li[9]/a/b");
	
	public WebElement LoggedInUser()
	{
		return driver.findElement(LoggedInUser_xpath);
	}
	public WebElement ContinueButton()
	{
		return driver.findElement(ContinueBtn_xpath);
	}
	public WebElement AccountCreatedTitle()
	{
		return driver.findElement(AccountCreatedTitle_xpath);
	}
	public WebElement CreateAcc()
	{
		return driver.findElement(CreateAcc_xpath);
	}
	public WebElement Mobile()
	{
		return driver.findElement(Mobile_xpath);
	}
	public WebElement Zipcode()
	{
		return driver.findElement(Zipcode_xpath);
	}
	public WebElement City()
	{
		return driver.findElement(City_xpath);
	}
	public WebElement State()
	{
		return driver.findElement(State_xpath);
	}
	public WebElement Country()
	{
		return driver.findElement(Country_xpath);
	}
	public WebElement Address2()
	{
		return driver.findElement(Address2_xpath);
	}
	public WebElement Address1()
	{
		return driver.findElement(Address1_xpath);
	}
	public WebElement Company()
	{
		return driver.findElement(Company_xpath);
	}
	public WebElement LastName()
	{
		return driver.findElement(LastName_xpath);
	}
	public WebElement FirstName()
	{
		return driver.findElement(FirstName_xpath);
	}
	public WebElement AddressInfoTitle()
	{
		return driver.findElement(AddressInfoTitle_xpath);
	}
	public WebElement SignUpPageTitle()
	{
		return driver.findElement(SignUpPageTitle_xpath);
	}
	public WebElement GenderCheckBox()
	{
		return driver.findElement(genderTitle_xpath);
	}
	public WebElement Name()
	{
		return driver.findElement(name_xpath);
	}
	public WebElement Email_Signup()
	{
		return driver.findElement(emailSign_xpath);
	}
	public WebElement SignUpButton()
	{
		return driver.findElement(SignUpbtn_xpath);
	}
	public WebElement Email()
	{
		return driver.findElement(email_xpath);
	}
	public WebElement Password()
	{
		return driver.findElement(password_xpath);
	}
	public WebElement Days()
	{
		return driver.findElement(days_xpath);
	}
	public WebElement Months()
	{
		return driver.findElement(months_xpath);
	}
	public WebElement Years()
	{
		return driver.findElement(year_xpath);
	}
	public WebElement NewsletterCheckbox()
	{
		return driver.findElement(newsletter_xpath);
	}
	public WebElement SplOffersCheckbox()
	{
		return driver.findElement(splOffers_xpath);
	}
}
