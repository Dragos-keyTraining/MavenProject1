package curs19;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class IsSelectedExample extends BaseTest{

	/*
	 * isSelected() --> functioneaza doar pe elemente de tip input care au
	 * atributul type=checkbox sau type=radio
	 * 
	 * daca nu au acest atribut isSelected() intoarce false
	 * 
	 */
	
	@Test
	public void isSelectedTest() {
		
		browser.findElement(By.cssSelector("li[class='menu_user_login']>a")).click();

		WebElement passField = browser.findElement(By.cssSelector("input[type='password']"));
		
		System.out.println(passField.isSelected());
		
		passField.click();
		
		System.out.println(passField.isSelected());

		System.out.println("-------------------------------------------------");
		
		WebElement checkbox = browser.findElement(By.cssSelector("input[type='checkbox']"));
		
		System.out.println(checkbox.isSelected());

		checkbox.click();
		
		System.out.println(checkbox.isSelected());

	}
	
	
}
