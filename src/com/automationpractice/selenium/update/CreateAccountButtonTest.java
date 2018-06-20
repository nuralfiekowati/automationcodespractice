package com.automationpractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

class CreateAccountButtonTest {

	WebElement element, element2, element3;

	public void accountButton(WebDriver driver) {

		element = driver.findElement(By.className("login"));
		element.click();

		driver.findElement(By.id("email_create")).sendKeys("youme@gmail.com");

		element2 = driver.findElement(By.id("SubmitCreate"));
		element2.click();

		WebDriverWait wait = new WebDriverWait(driver,
				20 /* timeout in seconds */);
		if (wait.until(ExpectedConditions.urlToBe(
				"http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation")) != null)
			System.out.println("Go to account creation page successfully!");
		else
			System.out.println("Not go to account creation page!");

	}

}
