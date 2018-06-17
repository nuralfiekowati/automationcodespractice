package com.automationpractice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class LoginSessionTest {

	WebElement element;

	public void enterLoginPage(WebDriver driver) {

		element = driver.findElement(By.className("login"));
		element.click();

		List<WebElement> element2 = driver.findElements(By.id("login_form"));

		if (element2.size() > 0) {

			System.out.println("Successful!");

		}

	}

}
