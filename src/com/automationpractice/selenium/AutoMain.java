package com.automationpractice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class AutoMain {
	
	WebDriver driver;
	
	public static String driverPath = "E:/alfi/Selenium_new/chromedriver_win32/";
	public void invokeBrowser() {
	
		try {
			System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
			//driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			//driver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
						
			driver.get("http://automationpractice.com");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		AutoMain checking1 = new AutoMain();
		checking1.invokeBrowser();
		
	}
}