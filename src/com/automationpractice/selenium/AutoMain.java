package com.automationpractice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
public class AutoMain {
	
	WebDriver driver;
	// WebElement element;
	
	public static String driverPath = "E:/alfi/Selenium_new/chromedriver_win32/";
	public void invokeBrowser() {
	
		try {
			System.setProperty("webdriver.chrome.driver", driverPath + "chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().deleteAllCookies();
			driver.manage().window().maximize();
					
			driver.get("http://automationpractice.com");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		
		AutoMain callBrowser = new AutoMain();
		callBrowser.invokeBrowser();

//		BrokenImagesTest imgTest = new BrokenImagesTest();
//		imgTest.findInvalidImages(callBrowser.driver);
//		
//		SearchButtonFuncTest searchBtnTest = new SearchButtonFuncTest();
//		searchBtnTest.searchFunc(callBrowser.driver);
		
//		BrokenLinksTest linkTest = new BrokenLinksTest();
//		linkTest.findInvalidLinks(callBrowser.driver);

//		SearchResultCountTest srcResCount = new SearchResultCountTest();
//		srcResCount.searchResCount(callBrowser.driver);
		
//		SelectedProductAttributeTest selectAttributes = new SelectedProductAttributeTest();
//		selectAttributes.findValidAttribute(callBrowser.driver);
		
//		SelectedProductTest selectProduct = new SelectedProductTest();
//		selectProduct.findValidProductLink(callBrowser.driver);
		
//		FilterSearchEachProductTest filterSearch = new FilterSearchEachProductTest(); 
//		filterSearch.findProductIrrelevantVisible(callBrowser.driver);
		
//		AddToCartTest addItem = new AddToCartTest();
//		addItem.AddToCart(callBrowser.driver);
		
//		LoginValidationTest toLogin = new LoginValidationTest();
//		toLogin.validLogin(callBrowser.driver);
		
//		LoginInvalidTest toLogin = new LoginInvalidTest();
//		toLogin.invalidLogin(callBrowser.driver);
		
//		LoginSessionTest loginSes = new LoginSessionTest();
//		loginSes.enterLoginPage(callBrowser.driver);
		
		ContactSessionTest contactSes = new ContactSessionTest();
		contactSes.enterContactPage(callBrowser.driver);
		
//		callBrowser.driver.quit();
	}
}