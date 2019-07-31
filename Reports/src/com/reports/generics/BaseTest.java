package com.reports.generics;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.seleniumhq.jetty9.util.ByteArrayISO8859Writer;

public class BaseTest implements IAutoReportConst
{
	public static WebDriver driver;
 
	 static
	 {
		// System.setProperty(CHROME_KEY, CHROME_VALUE);
		 System.setProperty(FIREFOX_KEY, FIREFOX_VALUE);
	 }
	 
	public static void Initlization()
	{
		//driver  = new ChromeDriver();
		driver  = new FirefoxDriver(); //This starts Web Browser
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(ITO, TimeUnit.SECONDS);
	
		driver.get(URL);
	}
	
	
	public void closeApplication() {
		driver.close();
	}
	
}
