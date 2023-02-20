package com.booking.qa.testcases;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollByPage {
	WebDriver driver;
	
	
public void ByPage() {
	
    System.setProperty("webdriver.chrome.driver", "D:\\Drivers\\chromedriver_win32\\chromedriver.exe");
    driver = new ChromeDriver();

    JavascriptExecutor js = (JavascriptExecutor) driver;

    // Launch the application		
    driver.get("http://demo.guru99.com/test/guru99home/");

    //This will scroll the web page till end.		
    js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
}
}


