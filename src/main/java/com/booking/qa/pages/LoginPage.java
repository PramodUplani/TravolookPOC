package com.booking.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.booking.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	
	
	
	// Object Reposatory OR Page Factory 
	
	@FindBy(id="login_top1")
	WebElement LoginOrSignUp;
	
	
	@FindBy(id="txtloginemail")
	WebElement LoginEmail;
	
	@FindBy(id="txtloginpassword")
	WebElement Password;
	
	////*[@id="login"]/input[4]
	
	@FindBy(xpath="//*[@id='login']/input[4]")
	WebElement SignInbtn;
	
	@FindBy(xpath="/html/body/div[1]/header/div/nav/div/div[1]/a/img")
	WebElement travolookLogo;
	
	// Initializing the page Object 
	
	public LoginPage() {
		
		
		PageFactory.initElements(driver, this );
		
			
	}
	
	//Actions 
	public String VerifyLoginPageTitle()
	{
		return driver.getTitle();
	}

	public boolean VerifyLogo()
	{
		return travolookLogo.isDisplayed();
	}

	public void VerifyLogin(String lei, String pwd ) throws Throwable
	{
		LoginOrSignUp.click();
		
		
		Thread.sleep(5000);
		LoginEmail.sendKeys(lei);
		Thread.sleep(5000);
		Password.sendKeys(pwd);
		Thread.sleep(5000);
		SignInbtn.click();
		Thread.sleep(5000);
		
		
	}
	
	
}