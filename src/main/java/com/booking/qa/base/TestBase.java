package com.booking.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.booking.qa.util.TestUtil;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TestBase {
	
	public static WebDriver driver;
	public static Properties prop;
	public ExtentReports extent;
	public ExtentTest logger;
	
	public TestBase() {
		prop = new Properties();
		FileInputStream ip = null;
		try {
			ip = new FileInputStream("C:\\Travolook\\Travolook\\src\\main\\java\\com\\booking\\qa\\config\\config.properties");
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		try {
			prop.load(ip);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		/*
		 FileInputStream fis = null;
		try {
			fis = new FileInputStream("D:\\POCZerodha\\PocTravolook\\src\\main\\java\\com\\booking\\qa\\config\\config.properties");
			
			System.out.println("LoginEmail: "+ prop.getProperty("LoginEmail"));
		    System.out.println("password: "+ prop.getProperty("password"));
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			
			
			e.printStackTrace();
		}
	        Properties prop = new Properties();
	         
	        try {
				prop.load(fis);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
	}

		/*
	 FileInputStream fis = null;{
	try {
		fis = new FileInputStream("D:\\POCZerodha\\PocTravolook\\src\\main\\java\\com\\booking\\qa\\config\\config.properties");
	} catch (FileNotFoundException e) {
		
		
		e.printStackTrace();
	}
       Properties prop = new Properties();
        
       try {
		prop.load(fis);
	} catch (IOException e) {
		e.printStackTrace();
	}
	
	 }}
	
	*/
		
		/*
		
	try {
        prop = new Properties();
        FileInputStream ip = new FileInputStream("D:\\POCZerodha\\PocTravolook\\src\\main\\java\\com\\booking\\qa\\config.properties");
        prop.load(ip);
    } catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
}
*/
public static void initilization ()
{
	String browserName = prop.getProperty("browser");
	
	
	if (browserName.equals("chrome"))
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\DELL-PC\\Downloads\\DriverManager\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	
	} else if (browserName.equals("FF"))
	{
		System.setProperty("webdriver.gecko.driver","C:\\Users\\DELL-PC\\Downloads\\DriverManager\\geckodriver-v0.32.2-win32\\geckodriver.exe");
	 driver = new FirefoxDriver();
	
	 
	// System.out.println("LoginEmail: "+ prop.getProperty("LoginEmail"));
    // System.out.println("password: "+ prop.getProperty("password"));
      
}
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT,TimeUnit.SECONDS);
	driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT,TimeUnit.SECONDS);
	driver.get(prop.getProperty("url"));
}

public void screenShots () {
	extent = new ExtentReports(System.getProperty("user.dir")+"/test-output/TravolookExtentReport.html",true);
	//extent = new ExtentReports(System.get)
	extent.addSystemInfo("User Name", "Austraxpc64");
	extent.addSystemInfo("OS", "Windows 10");
	extent.addSystemInfo("Host Name", "AustraxPC64");
	
	
	
}

public void endReports() {
	
	
	extent.flush();
	extent.close();
	
}

public void getScreenShots(WebDriver driver, String screenshotname) {
	
	
//String datename=new SimpleDateFormat("yyyymmddmmss").format(new Date());
	
	
}
/*
public void ScrollByPage() {
	
	 JavascriptExecutor js = (JavascriptExecutor) driver;

     // Launch the application		
    // driver.get("http://demo.guru99.com/test/guru99home/");

     //This will scroll the web page till end.		
     js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	
	
}
*/

/*
public static void screenshots(String Filename) {	
	
	File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	
	try {
		FileUtils.copyFile(file, new File ("D:\\POCZerodha\\PocTravolook\\src\\test\\java\\com\\qa\\screenshots\\ScreenShots"+Filename+".jpeg"));
	} catch (IOException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	//FileUtils.copyFile(file, "D:\\POCZerodha\\PocTravolook\\src\\test\\java\\com\\qa\\screenshots\\ScreenShots");
}

/*
	
	public void screenShot(ITestResult result){
		//using ITestResult.FAILURE is equals to result.getStatus then it enter into if condition
		if(ITestResult.FAILURE==result.getStatus()){
		try{
		// To create reference of TakesScreenshot
		TakesScreenshot screenshot=(TakesScreenshot)driver;
		// Call method to capture screenshot
		File src=screenshot.getScreenshotAs(OutputType.FILE);
		// Copy files to specific location
		// result.getName() will return name of test case so that screenshot name will be same as test case name
		FileUtils.copyFile(src, new File("D:\\"+result.getName()+".png"));
		*/

}
      // System.out.println("LoginEmail: "+ prop.getProperty("LoginEmail"));
      // System.out.println("password: "+ prop.getProperty("password"));