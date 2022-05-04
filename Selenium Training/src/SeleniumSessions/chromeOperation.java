package SeleniumSessions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class chromeOperation {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\eclipse-workspace\\Selenium Training\\executable\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        
        driver.get("https://www.amazon.in");
        
        String title = driver.getTitle();
        System.out.println("page title name:"+title);
        driver.findElement(By.linkText("Best Sellers")).click();
        
        String afterBestSellers = driver.getTitle();
        System.out.println("page title afterBestSellers:"+afterBestSellers);
        
        driver.navigate().back();
         
        String afternavigateback = driver.getTitle();
        System.out.println("page title afternavigateback:"+afternavigateback);
        
        String ActualResult = driver.getTitle();
        String ExpectedResult = "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in";
        if(ActualResult.equals(ExpectedResult))
        {
        	System.out.println("test case pass successfully");
        }else {
        	System.out.println("test case Fail");
        }
        
         driver.close();
        
        
        
      
        
        
      
        
        
	}

}
