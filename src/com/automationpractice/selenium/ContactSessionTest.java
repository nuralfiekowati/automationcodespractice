package com.automationpractice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ContactSessionTest {
	
	WebElement element;

	public void enterContactPage(WebDriver driver) {

		element = driver.findElement(By.id("contact-link"));
		element.click();

		List<WebElement> element2 = driver.findElements(By.className("contact-form-box"));

		if (element2.size() > 0) {

			System.out.println("Successful!");

		}

	}

}
