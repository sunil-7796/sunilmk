package com.qa.launch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class techlisticLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver","C:\\Users\\Shree\\eclipse-workspace\\Selenium Training\\executable\\geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		 driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		
		driver.get("https://www.techlistic.com");
		 driver.findElement(By.linkText("JAVA")).click();
		
		driver.navigate().back();
		
		driver.findElement(By.linkText("SELENIUM")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("BDD")).click();
		driver.navigate().back();
		
		driver.findElement(By.linkText("TESTING")).click();
		driver.navigate().back();
		
		driver.close();
		
		

	}

}
