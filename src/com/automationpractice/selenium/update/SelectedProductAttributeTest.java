package com.automationpractice.selenium;

import java.util.ArrayList;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

class SelectedProductAttributeTest {

	WebElement element, element2, select, element3, element4, element5, element6, element7;

	public void chooseSize(WebDriver driver) {

		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		element = driver.findElement(By.name("submit_search"));
		element.click();
		element2 = driver.findElement(By.partialLinkText("Printed Dress"));
		element2.click();

		Select toSelect = new Select(driver.findElement(By.id("group_1")));
		ArrayList<WebElement> allOptions = new ArrayList<WebElement>(toSelect.getOptions());

		System.out.println("Option size: " + allOptions.size());

		for (int i = 0; i < allOptions.size(); i++) {
			System.out.println(allOptions.get(i).getText());
		}

		/*
		 * Choose the product size 1 for S, 2 for M, 3 for L.
		 */
		toSelect.selectByValue("3");

	}

	public void chooseQuantity(WebDriver driver) {

		driver.findElement(By.id("search_query_top")).sendKeys("Dress");
		element = driver.findElement(By.name("submit_search"));
		element.click();
		element2 = driver.findElement(By.partialLinkText("Printed Dress"));
		element2.click();

		element3 = driver.findElement(By.id("quantity_wanted"));
		String value1 = element3.getAttribute("value");
		System.out.println("Origin value: " + value1);

		element4 = driver.findElement(By.className("icon-plus"));
		element4.click();

		element5 = driver.findElement(By.id("quantity_wanted"));
		String value2 = element5.getAttribute("value");
		System.out.println("Value after click button plus: " + value2);

		element6 = driver.findElement(By.className("icon-minus"));
		element6.click();

		element7 = driver.findElement(By.id("quantity_wanted"));
		String value3 = element7.getAttribute("value");
		System.out.println("Value after click button minus: " + value3);

	}

}
