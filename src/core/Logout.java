package core;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Logout extends BaseClass
{

	public Logout(WebDriver driver) 
	{
		super(driver);
		// TODO Auto-generated constructor stub
	}
	public void do_logout() throws InterruptedException
	{
		driver.findElement(By.xpath(TestCore.object.getProperty("logout"))).click();
		Thread.sleep(2000);
	}

}
