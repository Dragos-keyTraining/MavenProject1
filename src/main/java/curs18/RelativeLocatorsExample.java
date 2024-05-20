package curs18;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class RelativeLocatorsExample extends BaseTest{

	/*
	 * toLeftOf()
	 * toRightOf()
	 * above()
	 * below()
	 * near()
	 * 
	 */
	
	
	@Test
	public void relativeLocatorsExample() {
		JavascriptExecutor jse = (JavascriptExecutor)browser;

		//toLeftOf
		WebElement price = browser.findElement(RelativeLocator.with
				(By.cssSelector("h5[class*='sc_title_regular']")).toLeftOf
				(By.cssSelector("a[href*='garden']")));
		
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid green;')", price);
		
		//toRightOf
		WebElement price2 = browser.findElement(RelativeLocator.with
				(By.cssSelector("h5[class*='sc_title_regular']")).toRightOf
				(By.cssSelector("a[href*='garden']")));
		
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid green;')", price2);
		
		//below
		WebElement price3 = browser.findElement(RelativeLocator.with
				(By.cssSelector("h5[class*='sc_title_regular']")).below
				(By.cssSelector("a[href*='garden']")));
		
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid green;')", price3);
		
		//above
		WebElement author = browser.findElement(RelativeLocator.with
				(By.cssSelector("div[class='wpb_wrapper']")).above
				(price));
	
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid green;')", author);
	
		//near
		WebElement picture = browser.findElement(RelativeLocator.with
				(By.cssSelector("img[src*='book3']")).near
				(By.cssSelector("a[href*='garden']"), 300));
	
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:14px solid green;')", picture);
		
	
	}
	
	
	
}
