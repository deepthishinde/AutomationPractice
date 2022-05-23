package Full.AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePageObjects {
	
	public WebDriver driver;
	
	//CONSTRUCTOR
	public HomePageObjects(WebDriver driver)
	{
		this.driver=driver;
	}
	
	//DEFINE OBJECTS/XPATHS
	By HomePageTitle=By.xpath("//div[@class='logo pull-left']");
	By HomePageMenu=By.xpath("//ul[@class='nav navbar-nav']");
	By HomePageMenu_Home=By.xpath("//ul[@class='nav navbar-nav']/li[1]");
	By HomePageLoginMenu_xpath=By.xpath("//ul[@class='nav navbar-nav']/li[4]");
	By ContactUs_xpath=By.xpath("//ul[@class='nav navbar-nav']/li[7]");
	
	
	//WEBELEMENTS DEFINITION
	public WebElement ContactUs()
	{
		return driver.findElement(ContactUs_xpath);
	}
	public WebElement HomePageLoginMenu()
	{
		return driver.findElement(HomePageLoginMenu_xpath);
	}
	public WebElement HomeTitle()
	{
		return driver.findElement(HomePageTitle);
	}
	public WebElement HomeMenu()
	{
		return driver.findElement(HomePageMenu);
	}
	public WebElement HomeMenuBlock()
	{
		return driver.findElement(HomePageMenu_Home);
	}
			

}
