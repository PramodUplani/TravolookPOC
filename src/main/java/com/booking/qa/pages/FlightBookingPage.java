package com.booking.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.booking.qa.base.TestBase;

public class FlightBookingPage extends TestBase

{
	  
		
		public String month="March 2023";
		public String day="11";
		
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
		
		
		
		LoginPage loginPage;
		
		
		
		 public FlightBookingPage() {
				
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
		
		public FlightSelectionPage SearchFlight() throws Exception {
		
		
			//driver.get(prop.getProperty("url"));
		     FromCity.click();
			//From.sendKeys("Pune");
			Actions act1 = new Actions(driver);
			act1.sendKeys(Keys.DOWN).perform();
			act1.sendKeys(Keys.DOWN).perform();
			act1.sendKeys(Keys.DOWN).perform();
			act1.sendKeys(Keys.ENTER).perform();
			
			Thread.sleep(8000);
			
			
			ToCity.click();
			//To.sendKeys("Delhi");

			Actions act2 = new Actions(driver);
			act2.sendKeys(Keys.DOWN).perform();
			act2.sendKeys(Keys.ENTER).perform();

			Thread.sleep(5000);
			
			DepartureDate.click();
			Thread.sleep(5000);
			

			while(true)
			{
			String text=driver.findElement(By.xpath("//*[@id='ui-datepicker-div']/div[1]/div/div")).getText();
			
			if (text.equals(month))
			{
			System.out.println("Departure Date is   "  +text);
			break;
			}
			
			else
			{
				Thread.sleep(2000);
			//	System.out.println(text);
				NextBtn.click(); 
			}
			}
			
				
			List<WebElement> ddate= driver.findElements(By.xpath("//*[@id='ui-datepicker-div']/div[1]/table/tbody/tr/td"));
			
			for(WebElement ele:ddate)
			{
			 String datetext=ele.getText();
				
				if (datetext.equals(day))
					
				{
					
					ele.click();
					//System.out.println("Departure Date is  " +datetext+ " " +text);
					break;
				}
				
			}
			//System.out.println("Departure Date is  " +datetext+ "  " +text+);
			Thread.sleep(2000);
			Travellers.click();
			Thread.sleep(2000);
			Adults.click();
			Adults.click();
			Thread.sleep(2000);
			Childrens.click();
			Childrens.click();
			Thread.sleep(2000);
			Infants.click();
			Select ChooseClass= new Select(driver.findElement(By.id("ddlCabinClass")));
			ChooseClass.selectByVisibleText("Business");
			Thread.sleep(5000);
			DoneButton.click();
			Thread.sleep(5000);
			
			
			
			Search.click();
			Thread.sleep(10000);
			
			
		
		return new FlightSelectionPage();

}}