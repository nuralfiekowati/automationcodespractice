package com.automationpractice.selenium;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WebDriver;

class BrokenLinksTest {
	
	String url = "";
	HttpURLConnection con = null;
	int respnsCode = 200;
	
	public void findInvalidLinks (WebDriver driver) {
		
		List<WebElement> linksList = driver.findElements(By.tagName("a"));
		
		System.out.println("Total number of links : " + linksList.size());
		
		Iterator<WebElement> it = linksList.iterator();
		
		while(it.hasNext()) {
			
			url = it.next().getAttribute("href");
			System.out.println(url);
			
			if (url.isEmpty() || url == null) {
				
				System.out.println("URL is either empty or not configured for the anchor tag.");
				
				continue;
				
			}
			
			toConnect();
			
		}
	}
	
	public void toConnect() {
		
		try {
			con = (HttpURLConnection)(new URL(url).openConnection());
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
