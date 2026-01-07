package SanityTests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.BaseTest;

public class brokenLinkTest extends BaseTest{
    static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		driver=BaseTest.getDriver();
		
		driver.get("file:///E:/BLaptop/TCSRjp/sample.html");
		
		List <WebElement> links = driver.findElements(By.tagName("a"));
		String linkText= "";
		String href ="";
		String result;
		System.out.println("Number of links " + links.size());
		
		for(WebElement i : links )
		{
			linkText = i.getText();
			
		     href = i.getAttribute("href");
		    
		
		result =BaseTest.linkValidation(href);
	    System.out.println("Text: " + linkText + " | URL: " + href + " Result:" + result);	}
		
		driver.close();
	}

}
