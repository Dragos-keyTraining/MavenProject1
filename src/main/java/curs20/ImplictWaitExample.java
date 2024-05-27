package curs20;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class ImplictWaitExample extends BaseTest{

	@Test
	public void implictWait() throws InterruptedException {
		
		browser.get("https://the-internet.herokuapp.com/dynamic_loading/1");
		
		//astepta ca elementul sa fie prezent in DOM
		browser.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		browser.findElement(By.cssSelector("div[id='start']>button")).click();
		
		//Thread.sleep(10000);//bad practice
		
		WebElement finishText = browser.findElement(By.cssSelector("div[id='finish']>h4"));
		assertEquals(finishText.getText(), "Hello World!");
		
	}
	
	
}
