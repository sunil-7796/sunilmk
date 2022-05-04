package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeBrowser {

	private static final String SourceCode = null;

	public static void main(String[] args) {
		
		//get required browser executable path
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\eclipse-workspace\\Selenium Training\\executable\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
        WebDriverManager.chromedriver();
		
        driver.get("http://www.google.com");
        
        String sourceCode=driver.getPageSource();
        System.out.println("Application current code:"+sourceCode);
        System.out.println("Source code length:"+sourceCode.length());
        
        System.out.println("Application current URL:"+driver.getCurrentUrl());
        
        System.out.println("Application current title:"+driver.getTitle());
       
       
      //  driver.close();// quit the browser
       
}
}