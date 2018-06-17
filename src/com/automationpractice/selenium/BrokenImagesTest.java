package com.automationpractice.selenium;

import java.io.IOException;
import java.util.List;

import org.apache.http.HttpResponse;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.HttpClientBuilder;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class BrokenImagesTest {

	private int brokenImageCount;

	public void findInvalidImages(WebDriver driver) {

		brokenImageCount = 0;

		List<WebElement> imageList = driver.findElements(By.tagName("img"));

		System.out.println("Total number of images : " + imageList.size());

		if (imageList != null && imageList.size() > 0) {

			for (WebElement imageElement : imageList) {

				if (imageElement != null) {

					verifyImageVisible(imageElement);

				}

			}

		}

		System.out.println("Total number of invalid image : " + brokenImageCount);

	}

	public void verifyImageVisible(WebElement imageElement) {

		try {
			HttpClient client = HttpClientBuilder.create().build();
			HttpGet request = new HttpGet(imageElement.getAttribute("src"));
			HttpResponse response = client.execute(request);

			if (response.getStatusLine().getStatusCode() != 200) {

				brokenImageCount++;

			}
		} catch (ClientProtocolException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
