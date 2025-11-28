package tests;

import static org.testng.Assert.assertEquals;

import java.security.PrivateKey;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {
	@Test
	public void testvalidlogin()
	{
		//create instance of class LoginPage
		LoginPage loginpage = new LoginPage(driver);
		
		//call methods of actions
		loginpage.enteremailtxtbox("admin@yourstore.com");
		loginpage.enterpassword("admin");
		loginpage.clickonlogin();
		
		System.out.println("Title of the page is: "+driver.getTitle());
//        assert.assertEquals(driver.getTitle(),"Just a moment...");
		Assert.assertEquals(driver.getTitle(), "Just a moment...");
	}
}
