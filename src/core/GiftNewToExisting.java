package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GiftNewToExisting extends BaseClass

{
	Generate_Random gr= new Generate_Random();
	String amount= gr.generateRandomNumber(3);

	public GiftNewToExisting(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	public void giftNewUserToExistingUser_25() throws InterruptedException
	{
		System.out.println("giftNewUserToExistingUser_25");
		driver.findElement(By.xpath(TestCore.object.getProperty("giveasgift"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(TestCore.object.getProperty("giftas"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).clear();
		driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).sendKeys(gr.generateRandomString(5)+" "+gr.generateRandomString(5));	
		driver.findElement(By.xpath(TestCore.object.getProperty("email"))).clear();
		driver.findElement(By.xpath(TestCore.object.getProperty("email"))).sendKeys("test"+gr.generateRandomNumber(2)+"@pley.com");
		Thread.sleep(1000);
		driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).clear();
		driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).sendKeys(gr.generateRandomString(5)+" "+gr.generateRandomString(5));
		driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).clear();
		driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).sendKeys(TestCore.config.getProperty("giftReceiverEmail"));
		driver.findElement(By.xpath(TestCore.object.getProperty("message"))).clear();
		driver.findElement(By.xpath(TestCore.object.getProperty("message"))).sendKeys("Test Message");
		driver.findElement(By.xpath(TestCore.object.getProperty("continue"))).click();
		System.out.println("continue");
		Thread.sleep(2000);
		
		String a = driver.findElement(By.xpath(TestCore.object.getProperty("amount"))).getText();
		System.out.println(a);
		Assert.assertEquals(a, "25");
		String b = driver.findElement(By.xpath(TestCore.object.getProperty("total"))).getText();
		System.out.println(b);
		Assert.assertEquals(b, "25");

		driver.findElement(By.id("cc_number")).clear();
		   driver.findElement(By.id("cc_number")).sendKeys(TestCore.config.getProperty("cc_number"));
		   
		   new Select(driver.findElement(By.id("expMonth"))).selectByVisibleText("4");
		  
		   new Select(driver.findElement(By.id("expYear"))).selectByVisibleText("2022");
		   
		   driver.findElement(By.id("security_code")).clear();
		   driver.findElement(By.id("security_code")).sendKeys(gr.generateRandomNumber(3));
		   Thread.sleep(2000);
		   driver.findElement(By.xpath(TestCore.object.getProperty("submit"))).click();
			System.out.println("submit");
		   Thread.sleep(4000);	
		   
	}

	public void confirmgiftNewUserToExistingUser_25() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("Thankyou"))));
		String p= de2.getText();
		
		System.out.println(p);
		Assert.assertEquals(p, "Thank You!");
		System.out.println("thankyou");
		Thread.sleep(1000);
		driver.findElement(By.xpath(TestCore.object.getProperty("gohome"))).click();
		System.out.println("Go home");
		Thread.sleep(2000);
	}
	
	public void giftNewUserToExistingUser_50() throws InterruptedException
	{
		System.out.println("giftNewUserToExistingUser_50");
	driver.findElement(By.xpath(TestCore.object.getProperty("giveasgift"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(TestCore.object.getProperty("giftas50"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).sendKeys(gr.generateRandomString(5)+" "+gr.generateRandomString(5));	
	driver.findElement(By.xpath(TestCore.object.getProperty("email"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("email"))).sendKeys("test"+gr.generateRandomNumber(2)+"@pley.com");
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).sendKeys(gr.generateRandomString(5)+" "+gr.generateRandomString(5));
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).sendKeys(TestCore.config.getProperty("giftReceiverEmail"));
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).sendKeys("Test Message");
	driver.findElement(By.xpath(TestCore.object.getProperty("continue"))).click();
	Thread.sleep(2000);
	
	String a = driver.findElement(By.xpath(TestCore.object.getProperty("amount"))).getText();
	System.out.println(a);
	Assert.assertEquals(a, "50");
	String b = driver.findElement(By.xpath(TestCore.object.getProperty("total"))).getText();
	System.out.println(b);
	Assert.assertEquals(b, "50");

	driver.findElement(By.id("cc_number")).clear();
	   driver.findElement(By.id("cc_number")).sendKeys(TestCore.config.getProperty("cc_number"));
	   
	   new Select(driver.findElement(By.id("expMonth"))).selectByVisibleText("1");
	  
	   new Select(driver.findElement(By.id("expYear"))).selectByVisibleText("2017");
	   
	   driver.findElement(By.id("security_code")).clear();
	   driver.findElement(By.id("security_code")).sendKeys(gr.generateRandomNumber(3));
	   Thread.sleep(2000);
	   driver.findElement(By.xpath(TestCore.object.getProperty("submit"))).click();
	   Thread.sleep(5000);	
	   



		
		
	}
	
	
	public void confirmgiftNewUserToExistingUser_50() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("Thankyou"))));
		String p= de2.getText();
		Thread.sleep(1000);
		System.out.println(p);
		Assert.assertEquals(p, "Thank You!");

		Thread.sleep(1000);
		driver.findElement(By.xpath(TestCore.object.getProperty("gohome"))).click();
		System.out.println("Go home");
		Thread.sleep(2000);
	}
		
	public void giftNewUserToExistingUser_Random() throws InterruptedException
	{
		System.out.println("giftNewUserToExistingUser_50");
	driver.findElement(By.xpath(TestCore.object.getProperty("giveasgift"))).click();
	driver.findElement(By.xpath(TestCore.object.getProperty("giftrandom"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("giftrandom"))).sendKeys("9");
	Thread.sleep(2000);
	driver.findElement(By.xpath(TestCore.object.getProperty("giftitrandom"))).click();
	Thread.sleep(1000);
	String c= driver.findElement(By.xpath(TestCore.object.getProperty("minimumamount"))).getText();
	System.out.println(c);
	Assert.assertEquals(c, "The minimum gift amount is $10");
	Thread.sleep(2000);
	driver.findElement(By.xpath(TestCore.object.getProperty("giftrandom"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("giftrandom"))).sendKeys(amount);
	driver.findElement(By.xpath(TestCore.object.getProperty("giftitrandom"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).sendKeys(gr.generateRandomString(5)+" "+gr.generateRandomString(5));	
	driver.findElement(By.xpath(TestCore.object.getProperty("email"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("email"))).sendKeys("test"+gr.generateRandomNumber(2)+"@pley.com");
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).sendKeys(gr.generateRandomString(5)+" "+gr.generateRandomString(5));
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).sendKeys(TestCore.config.getProperty("user_email1"));
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).sendKeys("Test Message");
	driver.findElement(By.xpath(TestCore.object.getProperty("continue"))).click();
	Thread.sleep(2000);
	
	String a = driver.findElement(By.xpath(TestCore.object.getProperty("amount"))).getText();
	System.out.println(a);
	Assert.assertEquals(a, amount);
	String b = driver.findElement(By.xpath(TestCore.object.getProperty("total"))).getText();
	System.out.println(b);
	Assert.assertEquals(b, amount);

	driver.findElement(By.id("cc_number")).clear();
	   driver.findElement(By.id("cc_number")).sendKeys(TestCore.config.getProperty("cc_number"));
	   
	   new Select(driver.findElement(By.id("expMonth"))).selectByVisibleText("1");
	  
	   new Select(driver.findElement(By.id("expYear"))).selectByVisibleText("2017");
	   
	   driver.findElement(By.id("security_code")).clear();
	   driver.findElement(By.id("security_code")).sendKeys(gr.generateRandomNumber(3));
	   Thread.sleep(2000);
	   driver.findElement(By.xpath(TestCore.object.getProperty("submit"))).click();
	   Thread.sleep(5000);	
	   
	}
	public void confirmgiftNewUserToExistingUser_Random() throws InterruptedException
	{
		Thread.sleep(2000);
		WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("Thankyou"))));
		String p= de2.getText();
		System.out.println(p);
		Assert.assertEquals(p, "Thank You!");
		System.out.println("thankyou");
		Thread.sleep(1000);
		driver.findElement(By.xpath(TestCore.object.getProperty("gohome"))).click();
		System.out.println("Go home");
		Thread.sleep(2000);
	}
	


}



