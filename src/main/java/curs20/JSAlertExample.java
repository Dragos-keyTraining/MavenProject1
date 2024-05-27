package curs20;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class JSAlertExample extends BaseTest{

	
	@Test(priority=1)
	public void simpleJsAlert() throws InterruptedException {
		
		browser.get("https://keybooks.ro/events_calendar/");
		
		browser.findElement(By.cssSelector("div[id='simpleBtn']>button")).click();
		
		Thread.sleep(3000);
		//browser.switchTo().alert().accept();
		
		Alert alertaJs = browser.switchTo().alert();
		alertaJs.accept();//accept() --> da click pe butonul de OK din alerta JS
		
		WebElement resultText = browser.findElement(By.cssSelector("div[id='demo']"));
		assertEquals(resultText.getText(), "You did it.....!");
		
	}
	
	
	@Test(priority=2)
	public void confirmJsAlert() throws InterruptedException {
		
		browser.get("https://keybooks.ro/events_calendar/");
		
		browser.findElement(By.cssSelector("div[id='confirmBtn']>button")).click();
		
		Thread.sleep(3000);
		//browser.switchTo().alert().accept();
		
		Alert alertaJs = browser.switchTo().alert();
		alertaJs.dismiss();//dimiss() --> da click pe butonul de Cancel din alerta JS
		
		WebElement resultText = browser.findElement(By.cssSelector("div[id='demo']"));
		assertEquals(resultText.getText(), "You pressed Cancel!");
		
	}
	
	
	@Test(priority=3)
	public void promptJsAlert() throws InterruptedException {
		
		browser.get("https://keybooks.ro/events_calendar/");
		
		browser.findElement(By.cssSelector("div[id='promptBtn']>button")).click();
		
		Thread.sleep(3000);
		//browser.switchTo().alert().accept();
		
		Alert alertaJs = browser.switchTo().alert();
		Thread.sleep(6000);

		System.out.println(alertaJs.getText());
		
		alertaJs.sendKeys("Harry Potter");
		Thread.sleep(6000);

		alertaJs.accept();
		
		WebElement resultText = browser.findElement(By.cssSelector("div[id='demo']"));
		assertEquals(resultText.getText(), "Hello Harry Potter! How are you today?");
		
	}
	
	
}
