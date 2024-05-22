package curs19;

import javax.sql.rowset.BaseRowSet;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class CssSelectorExample extends BaseTest{

	
	//@Test
	public void cssSelectorExample1() {
		JavascriptExecutor jse = (JavascriptExecutor)browser;
		//direct child -- > adica >
		browser.findElement(By.cssSelector("li[class='menu_user_login']>a")).click();
		
		//descendant --> adica un spatiu intre caracterul parinte si caracterul de tip descendant
		WebElement username = browser.findElement
				(By.cssSelector("ul[id='menu_user'] input[name='log']"));
		
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid green;')", username);
		
		
		WebElement password = browser.findElement
				(By.cssSelector("ul#menu_user form.login_form>div.password_field>input[type='password']"));
			
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid green;')", password);
	
		//not()
		WebElement checkbox = browser.findElement
				(By.cssSelector("ul input:not([type='hidden'],[type='text'],[type='password'],[type='submit'])"));
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid green;')", checkbox);
		checkbox.click();
	}
	
	@Test
	public void cssExample2() {
		JavascriptExecutor jse = (JavascriptExecutor)browser;

		browser.findElement
			(By.cssSelector("div[class='menu_main_wrap'] a[href='https://keybooks.ro/shop/']"))
			.click();
		
		Actions action = new Actions(browser);
		action.scrollByAmount(0, 1200).perform();
		
		//first-child
		WebElement category1 = browser.findElement
				(By.cssSelector("ul[class='product-categories']>li:first-child"));
		
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid green;')", category1);
		
		//last-child
		WebElement category11 = browser.findElement
				(By.cssSelector("ul[class='product-categories']>li:last-child"));
		
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid green;')", category11);
	
		//nth-child()
		WebElement category5 = browser.findElement
				(By.cssSelector("ul[class='product-categories']>li:nth-child(5)"));
		
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid green;')", category5);
		
		
		//selectez din n in n (n = ce nr vreau eu)
		// --> ul[class='product-categories']>li:nth-child(4n)
		
		
		//selectez din n in n pornind de la un anumit numar
		//--> ul[class='product-categories']>li:nth-child(2n+4)
		
		//selectez par sau impar
		//--> ul[class='product-categories']>li:nth-child(even)
		//--> ul[class='product-categories']>li:nth-child(odd)
	}
	
	
}
