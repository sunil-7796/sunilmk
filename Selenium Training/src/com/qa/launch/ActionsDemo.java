package com.qa.launch;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\eclipse-workspace\\Selenium Training\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();http:
			
        driver.get("http://demo.automationtesting.in/Register.html");
		
	//	WebElement username = driver.findElement(By.cssSelector("input[placeholder='First Name']"));
		//username.click();
		Actions act = new Actions(driver);
		driver.findElement(By.cssSelector("input[placeholder='First Name']")).sendKeys("Selenium");
		//act.sendKeys(Keys.ENTER).perform();
		act.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(1))
		.sendKeys("Webdriver")
		.sendKeys(Keys.TAB)
		.pause(Duration.ofSeconds(1))
        .sendKeys("At.beed")
        .sendKeys(Keys.TAB)
        .pause(Duration.ofSeconds(1))
        .sendKeys("asdasdasd")
        .sendKeys(Keys.TAB)
        .pause(Duration.ofSeconds(1))
        .sendKeys("9876543298")
        .sendKeys(Keys.TAB)
        .pause(Duration.ofSeconds(1))
        .sendKeys("Male")
        .sendKeys(Keys.TAB)
        .pause(Duration.ofSeconds(1))
        .sendKeys("Cricket")
        .sendKeys(Keys.TAB)
        .pause(Duration.ofSeconds(1))
        .sendKeys("English")
        .build().perform();
		
		
        
                
        
         	     
	
		
		
		
		
		

	}

}
