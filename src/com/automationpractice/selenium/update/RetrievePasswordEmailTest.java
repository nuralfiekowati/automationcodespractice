package com.automationpractice.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class RetrievePasswordEmailTest {

	WebElement element, element2, element3;

	public void forgotPassword(WebDriver driver) {

		element = driver.findElement(By.className("login"));
		element.click();

		element2 = driver.findElement(By.cssSelector("a[title='Recover your forgotten password']"));
		element2.click();

		element3 = driver.findElement(By.cssSelector("button[type='submit']"));

		Boolean check = isAttributePresent(element3, "href");

		if (check != true) {

			System.out.println("Button of retrieve password does not work to redirect to any link");

		}

	}

	private boolean isAttributePresent(WebElement element, String attribute) {

		Boolean result = false;
		try {
			String value = element.getAttribute(attribute);

			if (value != null) {
				result = true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return result;

	}

}
