package SanityTests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import utils.BaseTest;

public class shadowDomExamplechaining extends BaseTest {
	static WebDriver driver;
	
	public static void main(String [] args) {
		driver=getDriver();
		
		 driver.get("https://books-pwakit.appspot.com/");
		 
		 driver.findElement(By.xpath("/html/body/book-app/app-header/app-toolbar[2]/book-input-decorator/input")).sendKeys("Selenium"+Keys.ENTER);
		 
		 //String result = getNestedText();
		
		 
		//System.out.println(result);
	}

	public static String getNestedText() {
		 WebElement nestedText = getDriver ().findElement (By.cssSelector ("book-app"))
			 .getShadowRoot ()
			 .findElement (By.cssSelector ("app-header"))
			 .getShadowRoot ()
			 .findElement (By.cssSelector ("app-toolbar.toolbar-bottom"))
			 .getShadowRoot().findElement(By.cssSelector("book-input-decorator"))
			 .findElement(By.id("input"));
			 return nestedText.getText ();
		}


}
