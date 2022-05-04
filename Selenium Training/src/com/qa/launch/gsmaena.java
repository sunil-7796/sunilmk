package com.qa.launch;


		
		import java.awt.List;

import org.openqa.selenium.By;
		import org.openqa.selenium.WebDriver;
		import org.openqa.selenium.WebElement;
		import org.openqa.selenium.chrome.ChromeDriver;
		import org.openqa.selenium.firefox.FirefoxDriver;
		import org.openqa.selenium.support.ui.ExpectedConditions;
		import org.openqa.selenium.support.ui.WebDriverWait;

	
		public class gsmaena {

			public static void main(String[] args) {
			 
			
				System.setProperty("webdriver.chrome.driver", ".\\executables\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
				driver.get("https://www.gsmarena.com/");
				
				String expectedTitle = "GSMArena.com - mobile phone reviews, news, specifications and more...";
				
				if (expectedTitle.equals(driver.getTitle())) {
					System.out.println("Your Page title is as expected, You are on RIGHT page");
				}else {
					System.out.println("Your page title is not as excpected, You are on WRONG page");
				}
				driver.findElement(By.cssSelector("div.brandmenu-v2>ul>:first-child>a")).click();
				
				WebDriverWait wait = new WebDriverWait(driver,20);
				
				WebElement firstSamPhone = driver.findElement(By.cssSelector("div.makers>ul>:first-child>a>strong"));
				
				wait.until(ExpectedConditions.elementToBeClickable(firstSamPhone));
				
				List <WebElement> samsungPhone = driver.findElements(By.cssSelector(".makers>ul strong>span"));//.makers>ul strong>span
				
				System.out.println("Total Number of Samsung Phones :"+samsungPhone.size());
				
				for(int i =0,j=1;i<samsungPhone.size();i++,j++) {
					
					WebElement samsung = samsungPhone.get(i);
					
					String phoneName = samsung.getText();
					
					System.out.println(j+".Samsung "+phoneName);
				}
				driver.navigate().back();
			}



	}


