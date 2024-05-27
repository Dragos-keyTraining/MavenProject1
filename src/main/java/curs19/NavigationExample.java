package curs19;

import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class NavigationExample extends BaseTest {
	
	@Test
	public void navigationExample() throws InterruptedException {
		
		browser.navigate().to("https://keyfood.ro/");
		Thread.sleep(3000);
		browser.navigate().back();
		Thread.sleep(3000);
		browser.navigate().forward();
		Thread.sleep(3000);
		browser.navigate().refresh(); 
		
		
	}
	
	

}
