package curs20;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class ExplictWaitExample extends BaseTest {

	@Test
	public void explicitWait() {
		WebDriverWait wait = new WebDriverWait(browser, Duration.ofSeconds(10));

		browser.get("https://the-internet.herokuapp.com/dynamic_loading/2");
		
		wait.until(ExpectedConditions.elementToBeClickable
				(By.cssSelector("div[id='start']>button")));
		browser.findElement(By.cssSelector("div[id='start']>button")).click();
		
		wait.until(ExpectedConditions.textToBePresentInElementLocated
				(By.cssSelector("div[id='finish']>h4"), "Hello World!"));
		
		WebElement finishText = browser.findElement(By.cssSelector("div[id='finish']>h4"));
		assertEquals(finishText.getText(), "Hello World!");
		
		
	}
	
	
}
