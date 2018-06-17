package com.automationpractice.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class SearchResultCountTest {

	WebElement element;

	void searchResCount(WebDriver driver) {

		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		element = driver.findElement(By.name("submit_search"));
		element.click();

		driver.manage().timeouts().pageLoadTimeout(2000000000, TimeUnit.SECONDS);

		List<WebElement> imageResultList = driver.findElements(By.className("product_img_link"));

		System.out.println("Total number of image result : " + imageResultList.size());

	}

}
