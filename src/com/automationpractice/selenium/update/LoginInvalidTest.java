package com.automationpractice.selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class LoginInvalidTest {

	WebElement element;

	public void invalidLogin(WebDriver driver) {

		element = driver.findElement(By.className("login"));
		element.click();

		driver.findElement(By.id("email")).sendKeys("abcde@yahoo.com");
		driver.findElement(By.id("passwd")).sendKeys("abcdef12");
		driver.findElement(By.id("SubmitLogin")).click();

		List<WebElement> errorList = driver.findElements(By.className("page-heading"));

		if (errorList != null && errorList.size() > 0) {
			System.out.println("Error found: Authentication failed!");
		}

	}
	
	public void invalidLogin2(WebDriver driver) {

		element = driver.findElement(By.className("login"));
		element.click();

		driver.findElement(By.id("email")).sendKeys("nuralfiekowati@yahoo.com");
		driver.findElement(By.id("passwd")).sendKeys("");
		driver.findElement(By.id("SubmitLogin")).click();

		List<WebElement> errorList = driver.findElements(By.className("page-heading"));

		if (errorList != null && errorList.size() > 0) {
			System.out.println("Error found: Authentication failed!");
		}

	}
	
	public void invalidLogin3(WebDriver driver) {

		element = driver.findElement(By.className("login"));
		element.click();

		driver.findElement(By.id("email")).sendKeys("");
		driver.findElement(By.id("passwd")).sendKeys("lalala");
		driver.findElement(By.id("SubmitLogin")).click();

		List<WebElement> errorList = driver.findElements(By.className("page-heading"));

		if (errorList != null && errorList.size() > 0) {
			System.out.println("Error found: Authentication failed!");
		}

	}

}
