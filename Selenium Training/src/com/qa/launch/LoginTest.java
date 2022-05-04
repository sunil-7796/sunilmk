package com.qa.launch;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shree\\eclipse-workspace\\Selenium Training\\executable\\geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://demo.actitime.com/");
		
        driver.findElement(By.name("userName")).sendKeys("admin");
		
		driver.findElement(By.name("Password")).sendKeys("admin123");
		
		driver.findElement(By.name("login")).click();
		
           String exp_title="actiTIME -  Login";
		
		String act_title = driver.getTitle();//returns the title of the page
		
		if(exp_title.equals(act_title)==true)
		{
			System.out.println("test is passed");
		}
		else {
			System.out.println("test is failed");
		

	}
	}
}
