package com.automationpractice.selenium;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

class SelectedProductAttributeTest {

	public void findValidAttribute(WebDriver driver) {

		List<WebElement> productList = driver.findElements(By.className("product-image-container"));
		List<WebElement> visited = new ArrayList<WebElement>();
		WebElement random = productList.get(new Random().nextInt(productList.size()));
		if (!visited.contains(random)) {
			random.click();

			try {
				WebElement productSizeDropdown = driver.findElement(By.id("group_1"));

				Select select = new Select(productSizeDropdown);
				select.selectByVisibleText("S");

				System.out.println("Click size S is ok!");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			visited.add(random);
			driver.navigate().back();
		}

	}

}
