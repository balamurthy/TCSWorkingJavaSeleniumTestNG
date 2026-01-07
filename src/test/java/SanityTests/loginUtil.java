package SanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.BaseTest;

public class loginUtil {
	
	static WebDriver driver;
	
	//public static void main(String[] args) {
	
	public static boolean login(String u,String p) {	
		boolean success;
		
		driver = BaseTest.getDriver();
		driver.get("https://the-internet.herokuapp.com/login");
		
		//id=username
	
		driver.findElement(By.id("username")).sendKeys(u);
		
		WebElement pwd;
		pwd = driver.findElement(By.id("password"));
		
		
		try {
			pwd.sendKeys(p);
		}
		catch (NoSuchElementException e)
		{
			System.out.println("Password field not there");
		}
		
		//security test case
		
		String typeOfBox = pwd.getAttribute("type");
		if(typeOfBox.equals("password")) {
			System.out.println("Password field is masked");
		}
		else {
			
			System.out.println("Security breach! password is not masked!");
		}
		
		driver.findElement(By.cssSelector("#login > button > i")).click();

		//to validate, use try catch block to see if logout link is found
		try {
			driver.findElement(By.partialLinkText("out")).click();
			System.out.println("Login successful for " + u + " " + p);
			success=true;
		}
		catch(NoSuchElementException e)
		{
			System.out.println("Login failed for " + u  + " "+ p);
			success=false;
		}
		
		return success;
		
	}
		
		
	
	}


