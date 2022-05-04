package com.qa.launch;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGDemo {
/*@BeforeSuite
 *@BeforeTest
 *@BeforeClass
 *
 *@BeforeMethod
 *@Test
 *@AfterMethod
 *
 *@BeforeMethod
 *@Test
 *@AfterMethod
 *
 *@BeforeMethod
 *@Test
 *@AfterMethod
 *
 *@AfterClass
 *@AfterTest
 * 
*/
	// pre-conditions annotation -- starting with @Before
	@BeforeSuite//1
	public void setUp() {
     System.out.println("setup system property for chrome");
	}
	
	@BeforeTest//2
	public void launchBrowser() {
		System.out.println("launchBrowser");
		
	}
	
	@BeforeClass//3
	public void login() {
		System.out.println("login to app");
	}
	
	@BeforeMethod//4
	public void enterURL() {
		System.out.println("enter URL");
	}
	//test cases -- starting with @test
	@Test//5
	public void googleTitleTest() {
		System.out.println("Google Title Test");
		
	}
	//post conditions -- starting with @After
	@AfterMethod//6
	public void logout() {
		System.out.println("logout from app");
	}
	
	@AfterTest//8
	public void deleteAllCookies() {
		System.out.println("deleteAllCookies");
	}
	@AfterClass//7
	public void classBrowser() {
		System.out.println("close Browser");
	}
    @AfterSuite//9
    public void generateTestReport() {
    	System.out.println("generateTestReport");
    }
}
