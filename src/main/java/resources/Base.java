package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Base {
	public WebDriver driver;
	public FileInputStream fis;
	public Properties prop;
	
	//initialize driver
	public WebDriver initializeDriver() throws IOException
	{
		//First u need to load & read data.properties file to get browser info
		fis=new FileInputStream("C:\\Users\\DEEPTHI\\eclipse-Deepthi\\AutomationPractice\\src\\main\\java\\resources\\data.properties");
		prop=new Properties();
		prop.load(fis);
		//Now from this properties file get the browser & store it in string
		String browserName=prop.getProperty("browser");
		//Now use if & else stmt to pick browser to run auto based on the value that u mention in data.properties file
		if(browserName.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\driver_Selenium\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().maximize();
		}
		else if(browserName.equalsIgnoreCase("firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Users\\DEEPTHI\\Downloads\\geckodriver-v0.30.0-win64");
	         driver=new FirefoxDriver();
	         driver.manage().window().maximize();
		}
		else if(browserName.equalsIgnoreCase("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Users\\DEEPTHI\\Downloads\\IEDriverServer_x64_4.0.0");
	         driver=new InternetExplorerDriver();
	         driver.manage().window().maximize();
		}	
		
		return driver;
	}
	
	public String getScreenShotPath(String testCaseName,WebDriver driver) throws IOException 
	{
		TakesScreenshot ts=(TakesScreenshot) driver;
		File source=ts.getScreenshotAs(OutputType.FILE);
		String destinationFile=System.getProperty("user.dir")+"\\reports\\"+testCaseName+".png";
		FileUtils.copyFile(source,new File(destinationFile));
		return destinationFile;
	}


}
