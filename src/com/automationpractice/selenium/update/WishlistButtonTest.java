package com.automationpractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class WishlistButtonTest {

	WebElement element, element2, element3, element4, element5;

	public void AddToWishlist(WebDriver driver) {

		element = driver.findElement(By.className("login"));
		element.click();

		driver.findElement(By.id("email")).sendKeys("nuralfiekowati@yahoo.com");
		driver.findElement(By.id("passwd")).sendKeys("lalala");
		driver.findElement(By.id("SubmitLogin")).click();

		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		element = driver.findElement(By.name("submit_search"));
		element.click();
		element2 = driver.findElement(By.partialLinkText("Printed Dress"));
		element2.click();

		element3 = driver.findElement(By.id("wishlist_button"));
		element3.click();

		element4 = driver.findElement(By.cssSelector("a[title='View my customer account']"));
		element4.click();

		element5 = driver.findElement(By.cssSelector("a[title='My wishlists']"));
		element5.click();

	}

}
