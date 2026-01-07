package testNGTests;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import utils.BaseTest;

public class brokenLinkTest extends BaseTest {
	static WebDriver driver;
	
	@BeforeClass
	public void init() {
		driver=getDriver();
		driver.get("file:///E:/BLaptop/TCSRjp/sample.html");
	}
  @Test
  public void testbrokenlinks() {
	  
	List <WebElement> l = driver.findElements(By.tagName("a"));
	l.size();
	
	 for (WebElement link : l) {
		 String retval;
		 
         String url = link.getAttribute("href");
        retval = BaseTest.linkValidation(url);
        System.out.println(url + " " + retval);
        
	 
	 }
  }
}
  
