package Full.AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPageObject {
	public WebDriver driver;
	
	//Constructor
	public LoginPageObject(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//Xpaths 
	
	By LoginMenuBlock=By.xpath("//ul[@class='nav navbar-nav']/li[4]");
	By NewUserLoginText_xpath=By.xpath("//h2[text()='New User Signup!']");
	By NewUserName_xpath=By.name("name");
	By NewUserEmail_xpath=By.xpath("//input[@data-qa='signup-email']");
	By NewUserSignUpButton_xpath=By.xpath("//button[@data-qa='signup-button']");
	By LoginExistEmail_xpath=By.xpath("//input[@data-qa='login-email']");
	By LoginExistPwd_xpath=By.xpath("//input[@data-qa='login-password']");
	By LoginExistBtn_xpath=By.xpath("//button[@data-qa='login-button']");
	By IncorrectLoginMsg_xpath=By.xpath("//p[text()='Your email or password is incorrect!']");
		
	//Webelements
	public WebElement IncorrectLoginMsg()
	{
		return driver.findElement(IncorrectLoginMsg_xpath);
	}
	public WebElement LoginExistButton()
	{
		return driver.findElement(LoginExistBtn_xpath);
	}
	public WebElement LoginExistPwd()
	{
		return driver.findElement(LoginExistPwd_xpath);
	}
	public WebElement LoginExistEmail()
	{
		return driver.findElement(LoginExistEmail_xpath);
	}
	public WebElement LoginMenuClick()
	{
		return driver.findElement(LoginMenuBlock);
	}
	public WebElement NewUserLoginText()
	{
		return driver.findElement(NewUserLoginText_xpath);
	}
	public WebElement NewUserNameField()
	{
		return driver.findElement(NewUserName_xpath);
	}
	public WebElement NewUserEmailField()
	{
		return driver.findElement(NewUserEmail_xpath);
	}
	public WebElement NewUserSignUpButton()
	{
		return driver.findElement(NewUserSignUpButton_xpath);
	}
	

}
