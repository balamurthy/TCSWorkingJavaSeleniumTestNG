package SanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;

import utils.BaseTest;

public class alertsCheck {

	static WebDriver driver;
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		driver=BaseTest.getDriver();
		
		driver.get("https://demoqa.com/alerts");
	
		JavascriptExecutor js =  ( JavascriptExecutor)driver;
		//Alert click
		driver.findElement(By.id("alertButton")).click();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		
		//confirm click
		//Assignment
		//Prompt click
		//validate 
		
		
		
	}	

}
