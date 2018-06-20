package com.automationpractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class AddToCartTest {

	WebElement element, element2, element3, element4;

	public void AddToCart(WebDriver driver) {

		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		element = driver.findElement(By.name("submit_search"));
		element.click();
		element2 = driver.findElement(By.partialLinkText("Printed Dress"));
		element2.click();
		element3 = driver.findElement(By.id("add_to_cart"));
		element3.click();

		WebElement quantityCart = driver.findElement(By.className("icon-ok"));
		WebDriverWait wait = new WebDriverWait(driver,
				20 /* timeout in seconds */);
		if (wait.until(ExpectedConditions.visibilityOf(quantityCart)) != null)
			System.out.println("Added to the cart successfully!");
		else
			System.out.println("Not added to the cart!");

	}

}
