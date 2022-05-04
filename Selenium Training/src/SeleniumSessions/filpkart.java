package SeleniumSessions;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class filpkart {

	public static void main(String[] args) {
		
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\eclipse-workspace\\Selenium Training\\executable\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.manage().window().maximize(); 
       driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
       
        driver.get("https://www.filpkart.com");
        
       
       
     
    		  
        	 
         
	} 
       
       
	}


