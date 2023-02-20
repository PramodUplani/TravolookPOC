package com.booking.qa.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.booking.qa.base.TestBase;
//import com.qa.testvargant.pages.reviewFlightdetailsPage;

public class FlightSelectionPage extends TestBase {
	
	public String month="May 2023";
	public String day="22";
	
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
	
	
	
	public FlightSelectionPage() {
		
		PageFactory.initElements(driver, this);
	}
	
	public  ReviewFlightdetailsPage clickBookButton() throws Exception
	{
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
			
			
			
			List<WebElement> list3=driver.findElements(By.xpath("/html/body/section[2]/div/div[1]/div/div[2]/div"));
			System.out.println("Available flights Are....."+list3.size());
			for (WebElement e : list3) {
		       // String name = webElement.getText();
		        System.out.println(e.getText());
			// System.out.println(bakeries.size());
		        
			}
			Thread.sleep(11000);
			bookFlight.click();
			 Thread.sleep(11000);
			 
			 
			 String t = "Review Your Booking  ";
			 // getPageSource() to get page source
			 if ( driver.getPageSource().contains(" Review Your Booking ")){
			    System.out.println( t + " Page For One Way Trip  ");
			 } else {
			    System.out.println("Text: " + t + " is not present. ");
			 }
			 
			 String GDP = driver.findElement(By.className("grandtotaldiv")).getText(); 
			 
			 System.out.println("Total Fair for Journey ---" +GDP); 
				//Thread.sleep(11000);
			 JavascriptExecutor js = (JavascriptExecutor) driver;

		        // Launch the application		
		     // driver.get("http://demo.guru99.com/test/guru99home/scrolling.html");

		        //WebElement Element = driver.findElement(By.linkText("VBScript"));
		        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
		        //This will scroll the page Horizontally till the element is found		
		       // js.executeScript("arguments[0].scrollIntoView();", Element);
		        
		        Thread.sleep(10000);
			
			 return new ReviewFlightdetailsPage();
			 
			}
				
	}
			
	
	


			