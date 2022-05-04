package com.qa.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSDemo {

	public static void main(String[] args) throws InterruptedException {
	    
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\eclipse-workspace\\Selenium Training\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
	    driver.get("https://demo.nopcommerce.com/register?returnUrl=%2F");
	    // using #id
	    driver.findElement(By.cssSelector("#FirstName")).sendKeys("sunil");
	    //using.class
	    driver.findElement(By.cssSelector(".male")).click();
	    //using tagname attribute
	    driver.findElement(By.cssSelector("input[name=Company]")).sendKeys("QA");
	    // using contains text 
	    driver.findElement(By.cssSelector("input[name*=LastName]")).sendKeys("kumar");
	    // using starts text
	    driver.findElement(By.cssSelector("input[name^=Email]")).sendKeys("kk@gmail.com");
	    // using ends text
	    driver.findElement(By.cssSelector("input[name$=word]")).sendKeys("1234");
	    Thread.sleep(1000);
	    //
	    driver.findElement(By.cssSelector("select[name=DateOfBirthDay]>option:nth-of-type(16)")).click();
	    Thread.sleep(1000);
	    //
	    driver.findElement(By.cssSelector("select[name=DateOfBirthMonth]>option:nth-of-type(5)")).click();
	    Thread.sleep(1000);
	    //
	    driver.findElement(By.cssSelector("select[name=DateOfBirthYear]>option:last-of-type")).click();
	  
	    
	    
	    
		
		
		

	}

}
