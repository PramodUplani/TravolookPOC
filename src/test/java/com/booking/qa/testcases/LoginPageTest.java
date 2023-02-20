package com.booking.qa.testcases;

import org.testng.Assert;

//import org.apache.xmlbeans.impl.xb.xsdschema.Public;
	
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.booking.qa.base.TestBase;

import com.booking.qa.pages.LoginPage;

public class LoginPageTest extends TestBase {
	
	LoginPage loginPage;
	
	//HomePage homePage;
	
	public LoginPageTest() {
		
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
		
		initilization();
		
		//screenshots("Login");
		loginPage  =new LoginPage();	
	} 
	
	@Test (priority=1)
	public void LoginPageTitleTest()
	
	{
		String title=loginPage.VerifyLoginPageTitle();
		Assert.assertEquals(title, "Flight Tickets Booking, Cheap Flights, Airtickets at Travolook");
		System.out.println("Login Page PageTitle Test Passed...... priority=1 ");
	}
	@Test (priority=2)
	public void travolookLogoImageTest()
	{
		boolean flag=loginPage.VerifyLogo();
		Assert.assertTrue(flag);
		System.out.println("Login Page travolookLogoImageTest Test Passed...... priority=2 ");
		
	}
	
	@Test(groups= {"SmokeTest"})
	public void LoginTest() throws Throwable{
		
	//	loginPage.VerifyLogin(prop.getProperty("LoginEmail"), prop.getProperty("password"));
		loginPage.VerifyLogin(prop.getProperty("LoginEmail"), prop.getProperty("password"));
		
		// homePage=loginPage.login(prop.getProperty("LoginEmail"), prop.getProperty("password"));
		System.out.println("Login Page LoginTest Test Passed...... priority=3 ");
		
		//loginPage.login(null, null)
		//loginPage.login(prop.getProperty(LoginEmail), prop.getProperty(password));

		
	}
	
	
	
	
	@AfterMethod
	public void tearDown() {
		
		//screenshots("Login");
	driver.quit();
	}

	
	
}
