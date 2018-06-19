package com.automationpractice.selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class ProductPrintPageTest {

	WebElement element, element2, element3;

	public void redirectToPrintPage(WebDriver driver) {

		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		element = driver.findElement(By.name("submit_search"));
		element.click();
		element2 = driver.findElement(By.partialLinkText("Printed Dress"));
		element2.click();

		element3 = driver.findElement(By.cssSelector("a[href='javascript:print();']"));
		element3.click();

		Set<String> childWindows = driver.getWindowHandles();
		System.out.println("Number of window: " + childWindows.size());

		if (childWindows.size() > 1) {
			System.out.println("Correctly redirected to print page!");
		} else {
			System.out.println("Redirecting to print page is wrong!");
		}

	}

}
