package com.booking.qa.testcases;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.booking.qa.base.TestBase;
import com.booking.qa.pages.FlightSelectionPage;
import com.booking.qa.pages.ReviewFlightdetailsPage;



public class FlightSelectionPageTest extends TestBase {
	
	FlightSelectionPage flightSelection;
	ReviewFlightdetailsPage reviewFlightdetailsPage;

	public FlightSelectionPageTest() {
		
		super();
		
	}
	
	@BeforeMethod
	public void setUp() {
		
		initilization();
		flightSelection = new FlightSelectionPage();
		//screenshots("Login");
		//loginPage  =new LoginPage();	
	}
	

	@Test
public void FlightBooking1() throws Throwable   {
	
		flightSelection.clickBookButton();
	System.out.println(" FlightSelectionPageTest  Passed...... Priority = 1 ");
	
	
	
	
}
	
	
	@Test
public void FlightBooking2() throws Throwable   {
	
		flightSelection.clickBookButton();
	System.out.println(" FlightSelectionPageTest  Passed...... Priority = 2 ");
	
	
	
	
}

	@Test
public void FlightBooking() throws Throwable   {
	
		flightSelection.clickBookButton();
	System.out.println(" FlightSelectionPageTest  Passed...... Priority = 3 ");
	
	
	
	
}
	@AfterMethod
	public void tearDown() {
		
		//screenshots("Login");
	driver.quit();
	
	
	
	
}
}