package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorConcept {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Shree\\eclipse-workspace\\Selenium Training\\executable\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		// driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/");
		
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
			
		WebElement usernameInputField=driver.findElement(By.id("username"));	
		usernameInputField.sendKeys("admin12345");
		
		usernameInputField.clear();
		usernameInputField.sendKeys("admin");
		
		WebElement passwordInputField=driver.findElement(By.name("pwd"));
		passwordInputField.sendKeys("manager");
		
	
		WebElement loginButton=driver.findElement(By.id("loginButton"));
		loginButton.click();
		
		
	//	driver.findElement(By.id("logoutLink")).click();
		}
	
	}
}


