package core;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class SignUp extends BaseClass {
Generate_Random gr= new Generate_Random();
public SignUp(WebDriver driver)
{
super(driver);
}
public void open_signup_page() throws InterruptedException
{ 
String s = driver.findElement(By.xpath(TestCore.object.getProperty("getstarted"))).getText();
System.out.println(s);
Assert.assertEquals(s, "Start My Free Trial");
driver.findElement(By.xpath(TestCore.object.getProperty("getstarted"))).click();
Thread.sleep(3000);	
}
public void signup() throws InterruptedException
{
	String t = driver.findElement(By.xpath(TestCore.object.getProperty("freetrial"))).getText();
	System.out.println(t);
	Assert.assertEquals(t, "Start Your FREE Trial");
	
	String u = driver.findElement(By.xpath(TestCore.object.getProperty("join5000"))).getText();
	System.out.println(u);
	Assert.assertEquals(u, "Join 50,000+ families who have already signed up for Pley.");
		
	String v = driver.findElement(By.xpath(TestCore.object.getProperty("createaccount"))).getText();
	System.out.println(v);
	Assert.assertEquals(v, "1. Create Your Account");
	
	Thread.sleep(2000);
	System.out.println("Enter name info");
	WebElement de2 = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.id("fullname")));
	   de2.findElement(By.id("fullname")).sendKeys("Test User");
	   driver.findElement(By.id("email")).clear();
	   driver.findElement(By.id("email")).sendKeys("testuser"+gr.generateRandomNumber(2)+"@pley.com");
	   driver.findElement(By.id("password")).clear();
	   driver.findElement(By.id("password")).sendKeys(TestCore.config.getProperty("passwd"));
	   System.out.println("Enter all details");
	   String w = driver.findElement(By.xpath(TestCore.object.getProperty("contnue"))).getText();
	   System.out.println("Continue button");
	   Assert.assertEquals(w, "Continue");
	   driver.findElement(By.xpath("//*[@id='signup1']/div[4]/div/button")).click();
	   Thread.sleep(5000);
	   System.out.println("Enter shipping info");
	   WebElement ship = (new WebDriverWait(driver, 30)).until(ExpectedConditions.presenceOfElementLocated(By.xpath(TestCore.object.getProperty("shipinfo"))));
	   String x = ship.getText();
	   Assert.assertEquals(x, "2. Enter Your Shipping Information");
	   System.out.println(x);
	   driver.findElement(By.id("address1")).clear();
	   driver.findElement(By.id("address1")).sendKeys("Street "+gr.generateRandomNumber(2));
	   driver.findElement(By.id("address2")).clear();
	   driver.findElement(By.id("address2")).sendKeys("Apt "+gr.generateRandomNumber(3));
	   Thread.sleep(1000);
	   driver.findElement(By.id("city")).clear();
	   driver.findElement(By.id("city")).sendKeys("San Diego");
	   Thread.sleep(1000);
	   
	   
   /*driver.findElement(By.xpath("//*[@id='select2-chosen-1']")).click();
   Thread.sleep(3000);*/
   /*driver.findElement(By.xpath("//*[@id='s2id_autogen1_search']")).sendKeys("California");
   Thread.sleep(1000);
   *///driver.findElement(By.xpath("//*[@id='select2-result-label-1039']")).click();
   /*Actions action = new Actions(driver);
   WebElement we = driver.findElement(By.id("state"));
   action.moveToElement(we).click().build().perform();*/
   
   new Select (driver.findElement(By.id("state"))).selectByVisibleText("California");
   new Select(driver.findElement(By.id("country"))).selectByVisibleText("United States");
   driver.findElement(By.xpath("//*[@id='zip_code']")).clear();
   driver.findElement(By.xpath("//*[@id='zip_code']")).sendKeys(TestCore.config.getProperty("zipcode"));
   Thread.sleep(2000);
   
   
   String y = driver.findElement(By.xpath(TestCore.object.getProperty("contnue1"))).getText();
   Assert.assertEquals(y, "Continue");
   driver.findElement(By.xpath("//*[@id='signup2']/div[7]/div/button")).click();
   Thread.sleep(4000);
   
   String z = driver.findElement(By.xpath(TestCore.object.getProperty("billinginfo"))).getText();
   Assert.assertEquals(z, "3. Enter Your Billing Information");
   driver.findElement(By.id("cc_number")).clear();
   driver.findElement(By.id("cc_number")).sendKeys(TestCore.config.getProperty("cc_number"));
   
   new Select(driver.findElement(By.id("expMonth"))).selectByVisibleText("1");
  
   new Select(driver.findElement(By.id("expYear"))).selectByVisibleText("2017");
   
   driver.findElement(By.id("security_code")).clear();
   driver.findElement(By.id("security_code")).sendKeys(TestCore.config.getProperty("ccv"));
   Thread.sleep(2000);
   
   String a = driver.findElement(By.xpath(TestCore.object.getProperty("firstset"))).getText();
   Assert.assertEquals(a, "Get My First Set");
   driver.findElement(By.id("form-submit")).click();
   Thread.sleep(5000);
   }

public void verify_signup() throws InterruptedException{
WebElement v1 = driver.findElement(By.xpath(TestCore.object.getProperty("verification")));
String s1 = v1.getText();

Assert.assertEquals(s1, "Let's Create Your Pleylist");

Thread.sleep(3000);	
}
}