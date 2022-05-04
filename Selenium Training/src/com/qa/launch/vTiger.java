package com.qa.launch;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class vTiger {

	public static void main(String[] args) {
System.setProperty("webdriver.gecko.driver", "C:\\Users\\Shree\\eclipse-workspace\\Selenium Training\\executable\\geckodriver.exe");
		
		WebDriver vt = new FirefoxDriver();
		
		vt.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(vt,20);
		
		vt.get("https://demo.vtiger.com/vtigercrm/index.php");
		
		String beforeLogin=vt.getTitle();
		
		vt.findElement(By.id("username")).clear();
		
		vt.findElement(By.id("password")).clear();
		
		vt.findElement(By.id("username")).sendKeys("admin");
		
		vt.findElement(By.id("password")).sendKeys("Test@123");
		
		vt.findElement(By.className("button")).click();
		
		WebElement logoutNav=vt.findElement(By.cssSelector("div#navbar a.pull-right"));
		
		wait.until(ExpectedConditions.elementToBeClickable(logoutNav));
		
		String afterLogin=vt.getTitle();
		
		if(beforeLogin.equals(afterLogin)) {
			System.out.println("Unsuccesful Login");
		}else {
			System.out.println("Succesful Login");
		}
		
		vt.findElement(By.cssSelector("div#navbar a.pull-right")).click();
		
		vt.findElement(By.cssSelector("span.pull-right>a")).click();
		
		WebElement signIn =vt.findElement(By.className("button"));
		
		wait.until(ExpectedConditions.elementToBeClickable(signIn));
		
		String afterLogout =vt.getTitle();
		
		if(beforeLogin.equals(afterLogout)) {
			System.out.println("Logout Successful");
		}else {
			System.out.println("Logout Unsuccessful");
		}
		


		

	}

}
