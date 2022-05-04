package com.qa.launch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", ".\\executable\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	        driver.manage().window().maximize();
	        
	        driver.get("https://www.amazon.in");
	        
	        String title = driver.getTitle();
	        System.out.println("page title name:"+title);
	        driver.findElement(By.linkText("Mobiles")).click();
	        
	        String afterMobiles = driver.getTitle();
	        System.out.println("page title afterMobiles:"+afterMobiles);
	        
	        String verifyitwithexpected = driver.getTitle();
	        System.out.println("page title verifyitwithexpected:"+verifyitwithexpected);
	        
	        String ActualResult = driver.getTitle();
	        String ExpectedResult = "Mobile Phones: Buy New Mobiles Online at Best Prices in India | Buy Cell Phones Online - Amazon.in";

	        if(ActualResult.equals(ExpectedResult))
	        {
	        	System.out.println("test case pass successfully");
	        }else {
	        	System.out.println("test case Fail");
	        }
	         driver.navigate().back();
	         String afternavigateback = driver.getTitle();
	         System.out.println("page title afternavigateback:"+afternavigateback);
	         
	         String actualResult = driver.getTitle();
	         String expectedResult = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
	         if(ActualResult.equals(ExpectedResult))
	         {
	         	System.out.println("test case pass successfully");
	         }else {
	         	System.out.println("test case Fail");
	         }
	      //   driver.close();
	          
	        
	}

}
