package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class vtigerLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\eclipse-workspace\\Selenium Training\\executable\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        
        driver.get("https://demo.vtiger.com/vtigercrm/index.php");
        
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("Test@123");
        driver.findElement(By.id("Sign in")).click();
	}

}
