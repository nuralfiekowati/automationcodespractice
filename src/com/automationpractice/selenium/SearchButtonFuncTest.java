package com.automationpractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class SearchButtonFuncTest {
	
	WebElement element;
	
	void searchFunc(WebDriver driver) {
		
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		element = driver.findElement(By.name("submit_search"));
		element.click();
		System.out.println("Search button works well.");
		
	}

}
