package com.automationpractice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class FilterSearchEachProductTest {

	WebElement element;
	String irrelevantProd = "";

	public void findProductIrrelevantVisible(WebDriver driver) {

		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		element = driver.findElement(By.name("submit_search"));
		element.click();
		
		List<WebElement> productResultList = driver.findElements(By.xpath("//img[contains(text(), 'Dress')]"));

		System.out.println("Total number of image result : " + productResultList.size());

		if (productResultList != null && productResultList.size() > 0) {

			for (WebElement productResult : productResultList) {
				
				System.out.println("Product result : " + productResult);
				System.out.println("Get text product result : " + productResult.getText());

			}
		}

	}

}
