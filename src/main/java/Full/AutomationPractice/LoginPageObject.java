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
	By NewUserEmail_xpath=By.name("//input[@data-qa='signup-email']");
	By NewUserSignUpButton_xpath=By.xpath("//button[@data-qa='signup-button']");
		
	//Webelements
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
