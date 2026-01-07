package SmokeTests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.BaseTest;
public class smokeTests {
	
	static WebDriver browser;
	
	public static void main(String[] args)  {
		// TODO Auto-generated method stub
		//not to be done but can remove in testNG
		BaseTest b = new BaseTest();
		browser = b.getDriver();
				
		browser.get("https://the-internet.herokuapp.com/login");
		String expectedtitle = "The";
		String actualtitle = browser.getTitle();
		//testcase1 -checking title of the page Test case
		if (actualtitle.startsWith(expectedtitle)) {
			
			System.out.println("Title is as expected.Starts with The");
		}
		else
		{
			System.out.println("Fail");
		}
		
		//Second smoke test - check if pwd is a password field
		
		WebElement pwd;
		pwd=browser.findElement(By.id("password"));
		String type = pwd.getAttribute("type");
		
		//testcase2 
		if (type.equals("password")) {
			System.out.println("Password field is masked");
			
		}
		else
		{
			System.out.println("Password field Not masked");
			
		}
	
		//testcase3 - check if login button is displayed 
		//if element's selector is copied
		boolean isLoginButtonDisplayed =browser.findElement(By.cssSelector("#login > button > i")).isDisplayed();
		
		if (isLoginButtonDisplayed == true) {
			System.out.println("Login button is displayed");
		}
		else {
			System.out.println("Login button not displayed");
				
		}
			
		browser.close();
		
	}
		
		
	
	}


