package com.booking.qa.testcases;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.booking.qa.base.TestBase;
import com.booking.qa.pages.LoginPage;

public class ReviewFlightdetailsPageTest extends TestBase {
	
LoginPage loginPage;
	
	//HomePage homePage;
	
	public ReviewFlightdetailsPageTest() {
		
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
		
		initilization();
		
		//screenshots("Login");
		loginPage  =new LoginPage();	
		
	} 
	
	@Test
	public void ScrollByPage() throws InterruptedException {
       
		
		  Thread.sleep(15000);
        JavascriptExecutor js = (JavascriptExecutor) driver;

        // Launch the application		
     //   driver.get("http://demo.guru99.com/test/guru99home/");

        //This will scroll the web page till end.		
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
        
       Thread.sleep(15000);
	}
	
	
	
	
	@AfterMethod
	public void teardown(){
		
		driver.quit();
	}
	
	
	
	
	

}
