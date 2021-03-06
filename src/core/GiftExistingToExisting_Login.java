package core;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class GiftExistingToExisting_Login extends BaseClass
	{
	Generate_Random gr= new Generate_Random();
	String amount= gr.generateRandomNumber(3);
	public GiftExistingToExisting_Login(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}

public void giftExistingUserToExistingUser_Login_25() throws InterruptedException
{
	System.out.println("inside etoel");
	
	driver.findElement(By.xpath(TestCore.object.getProperty("giveasgift_login"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(TestCore.object.getProperty("giftas"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).sendKeys(gr.generateRandomString(5)+" "+gr.generateRandomString(5));
	Thread.sleep(1000);
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).sendKeys(TestCore.config.getProperty("giftReceiverEmail"));
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).sendKeys("Test Message");
	driver.findElement(By.xpath(TestCore.object.getProperty("continue"))).click();
	Thread.sleep(2000);
	System.out.println("assert");
	String gftamount = driver.findElement(By.xpath("//*[@id='pricing']/div[2]/div/div/div/div/div/div[1]/ul[1]/li[1]/h4")).getText();
	Assert.assertEquals(gftamount, "Gift Amount");
	String total = driver.findElement(By.xpath("//*[@id='pricing']/div[2]/div/div/div/div/div/div[1]/ul[2]/li[1]/h4")).getText();
	Assert.assertEquals(total, "TOTAL");
	driver.findElement(By.xpath("//*[@id='pricing']/div[2]/div/div/div/div/div/div[2]/button")).click();
	System.out.println("buy");
	Thread.sleep(5000);	
	   
}

public void confirmgiftExistingUserToExistingUser_Login_25() throws InterruptedException
{
	
	WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("Thankyou"))));
	String p= de2.getText();
	Assert.assertEquals(p, "Thank You!");
	Thread.sleep(1000);
	driver.findElement(By.xpath(TestCore.object.getProperty("gohome"))).click();
	Thread.sleep(3000);
}
public void giftExistingUserToExistingUser_Login_50() throws InterruptedException
{
	System.out.println("inside etoel");
	
	driver.findElement(By.xpath(TestCore.object.getProperty("giveasgift_login"))).click();
	Thread.sleep(2000);
	driver.findElement(By.xpath(TestCore.object.getProperty("giftas50"))).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).sendKeys(gr.generateRandomString(5)+" "+gr.generateRandomString(5));
	Thread.sleep(1000);
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).sendKeys(TestCore.config.getProperty("giftReceiverEmail"));
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).sendKeys("Test Message");
	driver.findElement(By.xpath(TestCore.object.getProperty("continue"))).click();
	Thread.sleep(2000);
	System.out.println("assert");
	String a = driver.findElement(By.xpath(TestCore.object.getProperty("amount_login"))).getText();
	System.out.println(a);
	Assert.assertEquals(a, "50");
	System.out.println("amount login");
	String b = driver.findElement(By.xpath(TestCore.object.getProperty("total_login"))).getText();
	System.out.println(b);
	Assert.assertEquals(b, "50");
	System.out.println("total login");
	String c = driver.findElement(By.xpath(TestCore.object.getProperty("shipping"))).getText();
	Assert.assertEquals(c, "Shipping");
	System.out.println("shipping");
	String d = driver.findElement(By.xpath(TestCore.object.getProperty("shipping_value"))).getText();
	Assert.assertEquals(d, "FREE!");
	System.out.println("s value");
	driver.findElement(By.xpath("//*[@id='pricing']/div[2]/div/div/div/div/div/div[2]/button")).click();
	System.out.println("buy");
	Thread.sleep(5000);	
	   
}

public void confirmgiftExistingUserToExistingUser_Login_50() throws InterruptedException
{
	WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("Thankyou"))));
	String p= de2.getText();
	
	Assert.assertEquals(p, "Thank You!");
	Thread.sleep(1000);
	driver.findElement(By.xpath(TestCore.object.getProperty("gohome"))).click();
	Thread.sleep(2000);
}

public void giftExistingUserToExistingUser_Login_Random() throws InterruptedException
{
	System.out.println("inside etoel");
	
	driver.findElement(By.xpath(TestCore.object.getProperty("giveasgift_login"))).click();
	Thread.sleep(2000);
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
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("fullname"))).sendKeys(gr.generateRandomString(5)+" "+gr.generateRandomString(5));
	Thread.sleep(1000);
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("email1"))).sendKeys(TestCore.config.getProperty("user_email2"));
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).clear();
	driver.findElement(By.xpath(TestCore.object.getProperty("message"))).sendKeys("Test Message");
	driver.findElement(By.xpath(TestCore.object.getProperty("continue"))).click();
	Thread.sleep(2000);
	System.out.println("assert");
	String a = driver.findElement(By.xpath(TestCore.object.getProperty("amount_login"))).getText();
	Thread.sleep(2000);
	System.out.println(a);
	Assert.assertEquals(a, amount);
	System.out.println("amount login");
	String b = driver.findElement(By.xpath(TestCore.object.getProperty("total_login"))).getText();
	System.out.println(b);
	Assert.assertEquals(b, amount);
	System.out.println("total login");
	String e = driver.findElement(By.xpath(TestCore.object.getProperty("shipping"))).getText();
	Assert.assertEquals(e, "Shipping");
	System.out.println("shipping");
	String d = driver.findElement(By.xpath(TestCore.object.getProperty("shipping_value"))).getText();
	Assert.assertEquals(d, "FREE!");
	System.out.println("s value");
	driver.findElement(By.xpath("//*[@id='pricing']/div[2]/div/div/div/div/div/div[2]/button")).click();
	System.out.println("buy");
	Thread.sleep(5000);	
	   
}

public void confirmgiftExistingUserToExistingUser_Login_Random() throws InterruptedException
{
	WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("Thankyou"))));
	String p= de2.getText();
	
	Assert.assertEquals(p, "Thank You!");
	Thread.sleep(1000);
	driver.findElement(By.xpath(TestCore.object.getProperty("gohome"))).click();
	Thread.sleep(2000);
}

}
