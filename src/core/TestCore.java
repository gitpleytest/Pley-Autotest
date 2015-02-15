package core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestCore {


	public static Properties object = new Properties();
	public static Properties config = new Properties();
	public static WebDriver driver = null;
	
			@BeforeSuite
			public void setup() throws  IOException, InterruptedException{
				
				Logger logger = Logger.getLogger("Log");
				PropertyConfigurator.configure("Log4j.properties");
				
				
				if(driver==null){
					
					FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"//src//TestProperties//config.properties");
					config.load(fis);
					fis = new FileInputStream(System.getProperty("user.dir")+"//src//TestProperties//object.properties");
					object.load(fis);
					
					
					if(config.getProperty("browser").equals("firefox")){
						
				
						driver = new FirefoxDriver();
						logger.info("Launching Firefox browser");
						
					}
					else if(config.getProperty("browser").equals("chrome"))
					{
						if(config.getProperty("OS").equals("MAC") || config.getProperty("OS").equals("mac") || config.getProperty("OS").equals("Mac"))
						{
							System.out.println("open chrome browser on mac");
							System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/src/driver_mac/chromedriver");
							driver = new ChromeDriver();
							driver.manage().window().maximize();
						}else{
						System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"//src//driver//chromedriver.exe");
						driver = new ChromeDriver();
						logger.info("Launching Chrome browser");
						}
					}
					
					else if(config.getProperty("browser").equals("safari"))
					{
						driver = new SafariDriver();
						logger.info("Launching Safari browser");
					}
					driver.manage().window().maximize();
					driver.get(config.getProperty("url"));
					logger.info("Launching "+config.getProperty("url"));
						
				}	
				
				
				
				
			
				Thread.sleep(3000);
			}
			
		
			
	@AfterSuite
	public void tearDown(){
		
		driver.quit();
		
	}
}




