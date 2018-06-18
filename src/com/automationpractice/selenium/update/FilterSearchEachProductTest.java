package com.automationpractice.selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class FilterSearchEachProductTest {

	WebElement element, element2;
	String productTitle = "";
	int j;

	public void trackProductTopDisplay(WebDriver driver) {

		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		element = driver.findElement(By.name("submit_search"));
		element.click();

		ArrayList<WebElement> productResultList = new ArrayList<WebElement>(
				driver.findElements(By.className("product_img_link")));

		System.out.println("Total number of product result : " + productResultList.size());

		if (productResultList != null && productResultList.size() > 0) {

			System.out.println("==========================");
			System.out.println("Product names order display");
			System.out.println("==========================");

			for (int i = 0; i < productResultList.size(); i++) {

				j = i + 1;
				productTitle = productResultList.get(i).getAttribute("title");
				System.out.println("Product name " + j + ": " + productTitle);

			}

		}

	}

}
