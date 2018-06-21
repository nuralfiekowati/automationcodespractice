package com.automationpractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductRemoveButtonTest {

	WebElement element, element2, element3;

	public void removeProduct(WebDriver driver) {

		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		element = driver.findElement(By.name("submit_search"));
		element.click();
		element2 = driver.findElement(By.partialLinkText("Printed Dress"));
		element2.click();
		element3 = driver.findElement(By.id("add_to_cart"));
		element3.click();

		element = driver.findElement(By.className("login"));
		element.click();

		driver.findElement(By.id("email")).sendKeys("nuralfiekowati@yahoo.com");
		driver.findElement(By.id("passwd")).sendKeys("lalala");
		driver.findElement(By.id("SubmitLogin")).click();

		driver.findElement(By.className("shopping_cart"));
		
		driver.findElement(By.className("icon-trash"));

	}

}
