package com.automationpractice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class AddToCartTest {
	
	WebElement element, element2, element3;
	
	public void AddToCart(WebDriver driver) {
		
		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		element = driver.findElement(By.name("submit_search"));
		element.click();
		element2 = driver.findElement(By.partialLinkText("Printed Dress"));
		element2.click();
		element3 = driver.findElement(By.id("add_to_cart"));
		element3.click();
		
		List<WebElement> quantityCart = driver.findElements(By.className("ajax_cart_quantity unvisible"));
		
		if (quantityCart.size() > 0)
		{
			System.out.println("Add item to cart is successful!");
		}
		
	}

}
