package com.booking.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.booking.qa.base.TestBase;
import com.booking.qa.pages.FlightBookingPage;
import com.booking.qa.pages.FlightSelectionPage;
import com.booking.qa.pages.LoginPage;

public class FlightBookingPageTest extends TestBase{
	
	
	LoginPage loginPage;
	
	FlightSelectionPage flightSelectionPage;
	
	
	FlightBookingPage flightBookingPage;
	
    public FlightBookingPageTest() {
		
		super();
	}
    
	@BeforeMethod
	public void setUp() {
		
		initilization();
		flightBookingPage = new FlightBookingPage();
	} 
	
	@Test (priority=1)
	public void FlightBookingPageTitleTest()
	
	{	
		flightBookingPage.VerifyFlightBookingTitle();
		//String title1=flightBookingPage.VerifyFlightBookingTitle();
		//String title=loginPage.VerifyLoginPageTitle();
		//Assert.assertEquals(title1, "Flight Tickets Booking, Cheap Flights, Airtickets at Travolook111");
		System.out.println("Flight Booking Page Title Test Passed...... priority=1 ");
	}
	@Test (priority=2)
	public void travolookLogoImageTest()
	{	
		flightBookingPage.VerifyFlightBookingLogo();
		
		boolean flag=flightBookingPage.VerifyFlightBookingLogo();
		//boolean flag=loginPage.VerifyLogo();
		Assert.assertTrue(flag);
		System.out.println("Flight Booking Page Logo Test Passed...... priority=2 ");
		
	}
	
	
	@Test (priority=3)
	 public void searchFlightTest() throws Exception {
	    	
		flightBookingPage.SearchFlight();
		
	
	    	
	    }
	  @AfterMethod
		public void tearDown() {
		 // screenshots("FlightBooking");
			driver.quit();
		}
    
  

}
