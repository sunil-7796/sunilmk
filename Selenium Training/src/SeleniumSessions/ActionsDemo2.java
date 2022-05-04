package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionsDemo2 {

	public static void main(String[] args) throws InterruptedException {
		
       System.setProperty("webdriver.chrome.driver","C:\\Users\\Shree\\eclipse-workspace\\Selenium Training\\executable\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
	   driver.manage().window().maximize();
	   driver.get("https://demo.guru99.com/test/drag_drop.html");
	   
	   Actions act = new Actions(driver);
	 /*   // scroll down
	    Thread.sleep(2000);
	    
	    act.keyDown(Keys.CONTROL).sendKeys(Keys.END).build().perform();
	    //Scroll up
	    Thread.sleep(2000);
	    
	    act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).build().perform();
	    
	    driver.findElement(By.linkText("Register")).sendKeys(Keys.chord(Keys.CONTROL,Keys.ENTER));
	    WebElement fname = driver.findElement(By.id("FirstName"));
	    WebElement lname = driver.findElement(By.id("LastName"));
	    
	    fname.sendKeys("Mule");
	    
	    act.keyDown(Keys.CONTROL).sendKeys("a").build().perform();
	    act.keyDown(Keys.CONTROL).sendKeys("c").build().perform();
	    
	    lname.click();
	    
	    act.keyDown(Keys.CONTROL).sendKeys("v").build().perform();
	 */   
	  WebElement bankbutton =  driver.findElement(By.xpath("//li/a[contains(text(),'BANK')]"));
	  
	  WebElement place = driver.findElement(By.className("placeholder"));
	  
	  act.dragAndDrop(bankbutton, place).build().perform();
	  
	  
	    
	    
	    
	    
	    
	  
			

	}

}
