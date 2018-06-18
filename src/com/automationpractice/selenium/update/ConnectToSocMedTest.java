package com.automationpractice.selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class ConnectToSocMedTest {
	
	WebElement element;

	public void toFacebook (WebDriver driver) {

		driver.findElement(By.className("facebook")).click();

		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    
	    System.out.println("Current Page: " + driver.getTitle());
	    
	    if (driver.getTitle().contains("Facebook"))
	    {
	    	System.out.println("Successful go to Facebook page!");
	    }
	}
	
	public void toTwitter (WebDriver driver) {

		driver.findElement(By.className("twitter")).click();

		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    
	    System.out.println("Current Page: " + driver.getTitle());
	    
	    if (driver.getTitle().contains("Twitter"))
	    {
	    	System.out.println("Successful go to Twitter page!");
	    }
	}
	
	public void toYoutube (WebDriver driver) {

		driver.findElement(By.className("youtube")).click();

		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    
	    System.out.println("Current Page: " + driver.getTitle());
	    
	    if (driver.getTitle().contains("YouTube"))
	    {
	    	System.out.println("Successful go to Youtube page!");
	    }
	}
	
	public void toGooglePlus (WebDriver driver) {

		driver.findElement(By.className("google-plus")).click();

		ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    
	    System.out.println("Current Page: " + driver.getTitle());
	    
	    if (driver.getTitle().contains("Google+"))
	    {
	    	System.out.println("Successful go to Youtube page!");
	    }
	}

}