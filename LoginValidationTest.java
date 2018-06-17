package com.automationpractice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class LoginValidationTest {

	WebElement element;

	public void validLogin(WebDriver driver) {

		element = driver.findElement(By.className("login"));
		element.click();

		driver.findElement(By.id("email")).sendKeys("nuralfiekowati@yahoo.com");
		driver.findElement(By.id("passwd")).sendKeys("lalala");
		driver.findElement(By.id("SubmitLogin")).click();

		List<WebElement> errorList = driver.findElements(By.className("alert alert-danger"));

		System.out.println("Error count: " + errorList.size());

		if (errorList != null || errorList.size() > 0) {

			System.out.println("Authentication failed.!");
		}

	}

}
