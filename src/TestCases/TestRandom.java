package TestCases;

import org.testng.annotations.Test;

import core.GiftExistingToExisting;
import core.GiftExistingToExisting_Login;
import core.GiftExistingToNew;
import core.GiftExistingToNew_Login;
import core.GiftNewToNew;
import core.Login;
import core.Logout;
import core.TestCore;

public class TestRandom extends TestCore{

	
	/*@Test(priority=0)
	public void TestExistingToNew_Login() throws InterruptedException
	{
		Login l =new Login(driver);
		GiftExistingToNew_Login gl = new GiftExistingToNew_Login(driver);
		Logout Lg = new Logout(driver);
		l.do_login();
		gl.giftExistingUserToNewUser_Login_25();
		gl.confirmgiftExistingUserToNewUser_Login_25();
		Lg.do_logout();

	}*/
	
	@Test(priority=0)
	public void TestExistingToExisting_Login() throws InterruptedException
	{
		Login l =new Login(driver);
		Logout Lg = new Logout(driver);
		GiftExistingToExisting_Login gm = new GiftExistingToExisting_Login(driver);
		l.do_login();
		gm.giftExistingUserToExistingUser_Login_25();
		gm.confirmgiftExistingUserToExistingUser_Login_25();
		Lg.do_logout();
	
	}

}
