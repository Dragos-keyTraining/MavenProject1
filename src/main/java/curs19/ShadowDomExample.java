package curs19;

import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class ShadowDomExample extends BaseTest{
	
	
	
	@Test
	public void shadowDomExample() throws InterruptedException {
		
		browser.get("https://keybooks.ro/events_calendar/");
		
		Thread.sleep(3000);
		
		//browser.findElement(By.cssSelector("div[class='shadow-element']>button")).click();
		
		WebElement button = browser.findElement(By.cssSelector("div[id='shadow-host']"))
				.getShadowRoot()
				.findElement(By.cssSelector("div[class='shadow-element']>button"));
				
		button.click();
		
		WebElement pictureBooksDay = browser.findElement(By.cssSelector("div[id='shadow-host']"))
				.getShadowRoot()
				.findElement(By.cssSelector("img[src*='www.keybooks.ro_.png']"));
		
		
		assertTrue(pictureBooksDay.isDisplayed());
		
	}

}
