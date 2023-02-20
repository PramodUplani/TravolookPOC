package com.booking.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.booking.qa.base.TestBase;

public class ReviewFlightdetailsPage extends TestBase{
	
	
	public String month="April 2023";
	public String day="30";
	
	//@FindBy 
	//By.xpath("//*[@id=\"login_top1\"]"
	@FindBy(xpath=("//*[@id='flying_from_N']"))
	WebElement FromCity;
	
	@FindBy(xpath=("//*[@id='flying_to_N']"))
	WebElement ToCity;
	
	
	@FindBy (xpath=("//*[@id='Fly_depdate_val']"))
	WebElement DepartureDate;
					//*[@id='ui-datepicker-div']/div[1]/div/div
	
	////*[@id='ui-datepicker-div']/div[2]/div/a/span
	@FindBy (xpath=("//*[@id='ui-datepicker-div']/div[2]/div/a/span"))
	WebElement NextBtn;
	
	@FindBy(xpath=("//*[@id='ui-datepicker-div']/div[1]/div/div"))
	WebElement MonthYear;
	
	@FindBy(id="login_top1")
	WebElement LoginOrSignUp;
	
	
	@FindBy(id="txtloginemail")
	WebElement LoginEmail;
	
	@FindBy(id="txtloginpassword")
	WebElement Password;
	
	@FindBy(id="travel_id")
	WebElement Travellers;
	
	@FindBy(id="sub1plus")
	WebElement Adults;	
	
	@FindBy(id="sub2plus")
	WebElement Childrens;
	
	@FindBy(id="sub3plus")
	WebElement Infants;
	
	////*[@id="login"]/input[4] Children 
	
	@FindBy(xpath="//*[@id=\"ddlCabinClass\"]")
	WebElement SelectClass;
	
	
	
	@FindBy(xpath="//*[@id='login']/input[4]")
	WebElement SignInbtn;
	
	@FindBy(xpath="/html/body/div[1]/form/section/div/div/div[2]/div[6]/span[4]/a")
	WebElement DoneButton;
	
	
	@FindBy(xpath="//*[@id='searchengine_btn']")
	WebElement Search;
	
	@FindBy(xpath="/html/body/div[1]/header/div/nav/div/div[1]/a/img")
	WebElement travolookLogo;
	
	
	
	@FindBy(xpath="/html/body/section[2]/div/div[1]/div/div[2]/div[1]/div[2]/button")
	WebElement bookFlight;
	
	
	 public ReviewFlightdetailsPage() {
			
			PageFactory.initElements(driver, this);
				
		}
	 
	 
	 
	 
	 public String VerifyFlightBookingTitle()
		{
			return driver.getTitle();
		}

		public boolean VerifyFlightBookingLogo()
		{
			return travolookLogo.isDisplayed();
		}
	
	

}
