package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowser3 {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\eclipse-workspace\\Selenium Training\\executable\\chromedriver.exe");
		
	     WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.actitime.com");

		
		String title = driver.getTitle();
		System.out.println("page title name:"+title);
		System.out.println("page title length:"+title.length());
        
		if(title.equals("actiTIME - Login")) {
			System.out.println("correct title");
		}
		else {
			System.out.println("in-correct title");
		}
		System.out.println(driver.getCurrentUrl());
		
		if(driver.getCurrentUrl().equals("https://demo.actitime.com/login.do")) {
			System.out.println("correct url");
		}
		else {
			System.out.println("in-correct url");
		}
		String sourceCode=driver.getPageSource();
     //   System.out.println("Application current code:"+sourceCode);
        System.out.println("Source code length:"+sourceCode.length());
        
        driver.close();
        
	}
	
		
	}

