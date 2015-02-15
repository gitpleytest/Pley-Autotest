package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import core.TestCore;

public class Login extends BaseClass{

	public Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

	public void do_login() throws InterruptedException
	{
		System.out.println("login tab");
		Thread.sleep(3000);
		System.out.println("login tab");
		WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("Login_tab"))));
		de2.click();
		//driver.findElement(By.xpath(TestCore.object.getProperty("Login_tab"))).click();
		Thread.sleep(3000);
		driver.findElement(By.id(TestCore.object.getProperty("email_login"))).clear();
		driver.findElement(By.id(TestCore.object.getProperty("email_login"))).sendKeys(TestCore.config.getProperty("user_email1"));	
		driver.findElement(By.id("password")).sendKeys(TestCore.config.getProperty("pwd"));
		driver.findElement(By.xpath(TestCore.object.getProperty("Login_buttn"))).click();
		System.out.println("loged in");
		Thread.sleep(3000);
		
	}
}
