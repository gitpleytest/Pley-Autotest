package core;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.thoughtworks.selenium.webdriven.commands.Submit;

public class GiftExistingToNew extends BaseClass
{
	Generate_Random gr= new Generate_Random();
	String amount = gr.generateRandomNumber(3);
	public GiftExistingToNew(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

public void giftExistingUserToNewUser_25() throws InterruptedException
{
	System.out.println("giftExistingUserToNewUser_25()");
	driver.findElement(By.xpath(TestCore.object.getProperty("giveasgift"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(TestCore.object.getProperty("giftas"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).sendKeys("Test user");	
	driver.findElement(By.xpath(TestCore.object.getProperty("email"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("email"))).sendKeys(TestCore.config.getProperty("giftSenderEmail"));
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).sendKeys(gr.generateRandomString(5)+" "+gr.generateRandomString(5));
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).sendKeys("test"+gr.generateRandomNumber(2)+"@pley.com");
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).sendKeys("Test Message");
	driver.findElement(By.xpath(TestCore.object.getProperty("continue"))).click();
	Thread.sleep(2000);
	System.out.println("Verifying amount");
	String a = driver.findElement(By.xpath(TestCore.object.getProperty("amount"))).getText();
	System.out.println(a);
	Assert.assertEquals(a, "25");
	String b = driver.findElement(By.xpath(TestCore.object.getProperty("total"))).getText();
	System.out.println(b);
	Assert.assertEquals(b, "25");
	System.out.println("credit details");
	driver.findElement(By.id("cc_number")).clear();
	   driver.findElement(By.id("cc_number")).sendKeys(TestCore.config.getProperty("cc_number"));
	    
	   driver.findElement(By.id("security_code")).clear();
	   driver.findElement(By.id("security_code")).sendKeys(gr.generateRandomNumber(3));
	   new Select(driver.findElement(By.id("expMonth"))).selectByVisibleText("2");
		  
	   new Select(driver.findElement(By.id("expYear"))).selectByVisibleText("2018");
	   Thread.sleep(2000);
	   System.out.println("Submitting");
	   driver.findElement(By.xpath(TestCore.object.getProperty("submit"))).click();
	   Thread.sleep(5000);	
	   
}

public void confirmgiftExistingUserToNewUser_25() throws InterruptedException
{
	System.out.println("confirmgiftExistingUserToNewUser_25()");
	WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("Thankyou"))));
	String p= de2.getText();
	System.out.println(p);
	Assert.assertEquals(p, "Thank You!");
	Thread.sleep(1000);
	driver.findElement(By.xpath(TestCore.object.getProperty("gohome"))).click();
	Thread.sleep(3000);
}

public void giftExistingUserToNewUser_50() throws InterruptedException
{
	System.out.println("giftExistingUserToNewUser_50()");
	WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("giveasgift"))));
	de2.click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(TestCore.object.getProperty("giftas50"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).sendKeys("Test user");	
	driver.findElement(By.xpath(TestCore.object.getProperty("email"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("email"))).sendKeys(TestCore.config.getProperty("giftSenderEmail"));
	Thread.sleep(2000);
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).sendKeys(gr.generateRandomString(5)+" "+gr.generateRandomString(5));
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).sendKeys("test"+gr.generateRandomNumber(2)+"@pley.com");
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).sendKeys("Test Message");
	System.out.println("test message");
	driver.findElement(By.xpath(TestCore.object.getProperty("continue"))).click();
	Thread.sleep(2000);
	System.out.println("Verifying amount");
	String a = driver.findElement(By.xpath(TestCore.object.getProperty("amount"))).getText();
	System.out.println(a);
	Assert.assertEquals(a, "50");
	String b = driver.findElement(By.xpath(TestCore.object.getProperty("total"))).getText();
	System.out.println(b);
	Assert.assertEquals(b, "50");
	System.out.println("credit details");
	driver.findElement(By.id("cc_number")).clear();
	   driver.findElement(By.id("cc_number")).sendKeys(TestCore.config.getProperty("cc_number"));
	   driver.findElement(By.id("security_code")).clear();
	   driver.findElement(By.id("security_code")).sendKeys(gr.generateRandomNumber(3));
	   new Select(driver.findElement(By.id("expMonth"))).selectByVisibleText("8");
		  
	   new Select(driver.findElement(By.id("expYear"))).selectByVisibleText("2016");
	   
	   Thread.sleep(2000);
	   System.out.println("Submitting");
	   driver.findElement(By.xpath(TestCore.object.getProperty("submit"))).click();
	   Thread.sleep(5000);	
	   
}

public void confirmgiftExistingUserToNewUser_50() throws InterruptedException
{
	System.out.println("confirmgiftExistingUserToNewUser_50()");
	WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("Thankyou"))));
	String p= de2.getText();
	
	System.out.println(p);
	Assert.assertEquals(p, "Thank You!");
	Thread.sleep(1000);
	driver.findElement(By.xpath(TestCore.object.getProperty("gohome"))).click();
	Thread.sleep(2000);
}

public void giftExistingUserToNewUser_Random() throws InterruptedException
{
	System.out.println("giftExistingUserToNewUser_Random()");
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
	System.out.println("amount is"+amount);
	driver.findElement(By.xpath(TestCore.object.getProperty("giftrandom"))).sendKeys(amount);
	driver.findElement(By.xpath(TestCore.object.getProperty("giftitrandom"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("firstname"))).sendKeys("Test user");	
	driver.findElement(By.xpath(TestCore.object.getProperty("email"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("email"))).sendKeys(TestCore.config.getProperty("giftSenderEmail"));
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).sendKeys("Test User");
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).sendKeys("testuser"+gr.generateRandomNumber(2)+"@pley.com");
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).sendKeys("Test Message");
	driver.findElement(By.xpath(TestCore.object.getProperty("continue"))).click();
	Thread.sleep(2000);
	System.out.println("Verifying amount");
	WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("amount"))));
	String a = de2.getText();
	System.out.println("amount verified is: "+amount);
	Assert.assertEquals(a, amount);
	String b = driver.findElement(By.xpath(TestCore.object.getProperty("total"))).getText();
	System.out.println(b);
	Assert.assertEquals(b, amount);
	System.out.println("credit details");
	driver.findElement(By.id("cc_number")).clear();
	   driver.findElement(By.id("cc_number")).sendKeys(TestCore.config.getProperty("cc_number"));
	    
	   driver.findElement(By.id("security_code")).clear();
	   driver.findElement(By.id("security_code")).sendKeys(gr.generateRandomNumber(3));
	   new Select(driver.findElement(By.id("expMonth"))).selectByVisibleText("2");
		  
	   new Select(driver.findElement(By.id("expYear"))).selectByVisibleText("2018");
	   Thread.sleep(2000);
	   System.out.println("Submitting");
	   driver.findElement(By.xpath(TestCore.object.getProperty("submit"))).click();
	   Thread.sleep(5000);	
	   
}

public void confirmgiftExistingUserToNewUser_Random() throws InterruptedException
{
	System.out.println("confirmgiftExistingUserToNewUser_Random()");
	WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("Thankyou"))));
	String p = de2.getText();
	Assert.assertEquals(p, "Thank You!");
	Thread.sleep(1000);
	driver.findElement(By.xpath(TestCore.object.getProperty("gohome"))).click();
	Thread.sleep(2000);
}

}
