package com.booking.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadDataFromPropertiesFile1 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		
		 FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\Travolook\\Travolook\\src\\main\\java\\com\\booking\\qa\\config\\config.properties");
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	        Properties prop = new Properties();
	         
	        prop.load(fis);
	        

	        System.out.println("LoginEmail: "+ prop.getProperty("LoginEmail"));
	        System.out.println("password: "+ prop.getProperty("password"));
	        System.out.println("password: "+ prop.getProperty("url"));
	         
	       // String user = prop.getProperty(LoginEmail);
	      //  String pword = prop.getProperty(password);
	       // String fname = prop.getProperty(&quot;firstname&quot;);
	         
	      //  System.out.println(user);
	       // System.out.println(pword);
	       // System.out.println(fname);
	    }
	 
		
		
		
		
	}