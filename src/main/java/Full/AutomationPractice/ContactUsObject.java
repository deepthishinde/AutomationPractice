package Full.AutomationPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactUsObject {
	public WebDriver driver;
	public ContactUsObject(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By ContactUsName_xpath=By.xpath("//*[@data-qa='name']");
	By ContactUsEmail_xpath=By.xpath("//*[@data-qa='email']");
	By ContactUsSub_xpath=By.xpath("//*[@data-qa='subject']");
	By ContactUsMsg_xpath=By.xpath("//*[@data-qa='message']");
	By ContactUsChooseFile_xpath=By.xpath("//*[@name='upload_file']");
	By ContactUsSubmit_Xpath=By.xpath("//*[@data-qa='submit-button']");
	
	public WebElement ContactUsSubmit()
	{
		return driver.findElement(ContactUsSubmit_Xpath);
	}
	public WebElement ContactUsChooseFile()
	{
		return driver.findElement(ContactUsChooseFile_xpath);
	}
	public WebElement ContactUsMsg()
	{
		return driver.findElement(ContactUsMsg_xpath);
	}
	public WebElement ContactUsSub()
	{
		return driver.findElement(ContactUsSub_xpath);
	}
	public WebElement ContactUsEmail()
	{
		return driver.findElement(ContactUsEmail_xpath);
	}
	public WebElement ContactUsName()
	{
		return driver.findElement(ContactUsName_xpath);
	}

}
