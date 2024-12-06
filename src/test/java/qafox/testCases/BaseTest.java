package qafox.testCases;

import java.io.FileReader;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import io.github.bonigarcia.wdm.WebDriverManager;




public class BaseTest
{

	public WebDriver driver;
	
	public Properties prop = new Properties();
	
	public Logger logger;
	
	@BeforeClass
	public void setup() throws InterruptedException, IOException
	{
	  
		logger = LogManager.getLogger(this.getClass());
	  
	  if(driver==null)
	  {
		  logger.info("***************** Reading Property file ********************");
		  FileReader access = new FileReader(System.getProperty("user.dir")+"//Configurations//config.properties");
		  prop.load(access);
		  
	  }
	  
	  if(prop.getProperty("browser").equalsIgnoreCase("chrome"))
	  {
		  logger.info("***************** Launching Chrome Browser ********************");
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get(prop.getProperty("url"));
		  logger.info("***************** URL Loaded ********************");
		  
		 
		  
		  
	  }
	  
	  else if(prop.getProperty("browser").equalsIgnoreCase("firefox"))
	  {
		  logger.info("***************** Launching firefox Browser ********************");
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
		  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		  driver.get(prop.getProperty("url"));
		  logger.info("***************** URL Loaded ********************");
	  }
	  
		
	}
	
	@AfterClass
	public void teardown()
	{
		driver.quit();
	}
	
	
}
