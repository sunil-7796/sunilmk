package com.qa.launch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class GoogleTest {
	
	WebDriver driver;
	
	@BeforeMethod
	 public void setup() {
	     System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\eclipse-workspace\\Selenium Training\\executable\\chromedriver.exe");
	     driver =new ChromeDriver();
	      driver.manage().window().maximize();
		  driver.manage().deleteAllCookies();
	   	driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		}
	
	@Test
	public void googleTitleTest() {
		String title = driver.getTitle();
		 System.out.println(title);
		}
	@Test
	public void googleLogoTest() {
		
	}
	    
	@AfterMethod
	public void tearDown(){
		driver.quit();
		
	}
	

}
