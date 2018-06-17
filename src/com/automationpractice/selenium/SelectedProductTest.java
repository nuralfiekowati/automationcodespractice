package com.automationpractice.selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
//import java.util.Iterator;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class SelectedProductTest {

	String url = "";
	HttpURLConnection con = null;
	int respnsCode = 200;

	public void findValidProductLink(WebDriver driver) {

		List<WebElement> productList = driver.findElements(By.className("product_img_link"));
		// Iterator<WebElement> it = productList.iterator();
		List<WebElement> visited = new ArrayList<WebElement>();
		WebElement random = productList.get(new Random().nextInt(productList.size()));
		if (!visited.contains(random)) {
			random.click();
			System.out.println("Product has been clicked correctly.");
			visited.add(random);
			driver.navigate().back();
		}
	}

	public void toConnect() {

		try {
			con = (HttpURLConnection) (new URL(url).openConnection());
			con.setRequestMethod("HEAD");
			con.connect();

			respnsCode = con.getResponseCode();

			if (respnsCode >= 400) {
				System.out.println(url + " is a broken link.");
			} else {
				System.out.println(url + " is a valid link.");
			}
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
