package com.qa.launch;



import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class firefoxautomation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Shree\\eclipse-workspace\\Selenium Training\\executable\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        driver.get("https://demosite.executeautomation.com/Login.html");
        
        String title = driver.getTitle();
        System.out.println("page title name:"+title);
        System.out.println("page title length"+title.length());
        
        System.out.println(driver.getCurrentUrl());
        if(driver.getCurrentUrl().equals("https://demosite.executeautomation.com/Login.html"))
        {
        	System.out.println("correct url");
        }
        else {
              System.out.println("in-correct url"); 	
        }
        driver.findElement(By.name("UserName")).sendKeys("execution");
        
        driver.findElement(By.name("Password")).sendKeys("admin");
        
        driver.findElement(By.name("Login")).click();
		
        
	}

}
