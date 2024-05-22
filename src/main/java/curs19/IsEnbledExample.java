package curs19;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class IsEnbledExample extends BaseTest{

	
	
	@Test
	public void isEnabledTest() {
		JavascriptExecutor jse = (JavascriptExecutor)browser;

		browser.findElement(By.cssSelector("li[class='menu_user_login']>a")).click();

		WebElement passField = browser.findElement(By.cssSelector("input[name='pwd']"));
		
		System.out.println(passField.isEnabled());
		
		jse.executeScript("arguments[0].setAttribute('disabled', '')", passField);
		
		System.out.println("Vizibil? : " + passField.isDisplayed());
		
		//passField.sendKeys("Test");
		
		System.out.println(passField.isEnabled());

	}
	
	
	
}
