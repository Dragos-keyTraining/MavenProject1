package curs18;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import selenium.utils.BaseTest;

public class CssSelectorExample extends BaseTest{

	/* 
	 * tagname[atribut=valoareAtribut]
	 * 
	 * <li class="menu_user_login">
	 * li --> tagname
	 * class--> atribut
	 * menu_user_login --> valoare atribut
	 * 
	 * li[class='menu_user_login']
	 * 
	 * li.menu_user_login  --> li[class='menu_user_login']
	 * 
	 * .menu_user_login --> [class='menu_user_login']
	 * 
	 * 
	 */
	
	
	//@Test
	public void cssSelectorExample1() {
	JavascriptExecutor jse = (JavascriptExecutor)browser;
		
	// . --> class	
	WebElement loginLink = browser.findElement(By.cssSelector(".menu_user_login"));	
	jse.executeScript("arguments[0].setAttribute"
			+ "('style', 'background:yellow; border:4px solid green;')", loginLink);
	
	loginLink.click();
	
	// # --> id
	WebElement user = browser.findElement(By.cssSelector("input#log"));
	jse.executeScript("arguments[0].setAttribute"
			+ "('style', 'background:yellow; border:4px solid green;')", user);
	
	user.sendKeys("Test");
	
	// logical AND
	WebElement pass = browser.findElement
			(By.cssSelector("input[name='pwd'][placeholder='Password'][type='Password']"));
	
	jse.executeScript("arguments[0].setAttribute"
			+ "('style', 'background:pink; border:4px solid black;')", pass);
	
	pass.sendKeys("test");
	
	//logical OR
	WebElement rememeberMe = browser.findElement
			(By.cssSelector("input[id='rememberme'],[type='checkbox'],[value='forever']"));
	
	rememeberMe.click();
	
	//direct child -->   >
	WebElement submitButton = browser.findElement
			(By.cssSelector("form[name='login_form']>div>input[class='submit_button']"));
	
	jse.executeScript("arguments[0].setAttribute"
			+ "('style', 'background:pink; border:4px solid red;')", submitButton);
	
	
	submitButton.click();
	}
	
	@Test
	public void cssSelectorExample2() {
		JavascriptExecutor jse = (JavascriptExecutor)browser;

		
		// * --> contains
		WebElement book1 = browser.findElement
				(By.cssSelector("a[href*='deep-silence']"));
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:pink; border:4px solid red;')", book1);
		// ^ --> starts with
		WebElement book2 = browser.findElement(By.cssSelector("a[href^=\"life\"]"));
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid green;')", book2);
		// $ --> ends with
		WebElement book3 = browser.findElement(By.cssSelector("a[href$='story']"));
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid green;')", book3);
		// ~ --> contains word
		WebElement book4 = browser.findElement(By.cssSelector("div[class~='wpb_content_element']"));
		jse.executeScript("arguments[0].setAttribute"
				+ "('style', 'background:yellow; border:4px solid green;')", book4);
	}
	
	
	
}
