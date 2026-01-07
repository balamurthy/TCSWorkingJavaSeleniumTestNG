package SanityTests;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;


public class BooksPWAShadowDom {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://books-pwakit.appspot.com/");
        Thread.sleep(3000); // allow shadow DOM to load

        // 1️⃣ book-app shadow root
        WebElement bookApp = driver.findElement(By.cssSelector("book-app"));
        SearchContext bookShadow = bookApp.getShadowRoot();

        // 2️⃣ app-header shadow root
        WebElement appHeader =
                bookShadow.findElement(By.cssSelector("app-header"));
        SearchContext headerShadow = appHeader.getShadowRoot();

        WebElement toolbarBottomhost =
                bookShadow.findElement(By.cssSelector("app-header > app-toolbar.toolbar-bottom"));
        SearchContext  shadowBottom= toolbarBottomhost.getShadowRoot();

               // 5️⃣ input box inside shadow DOM
        WebElement searchBox =
                shadowBottom.findElement(By.cssSelector("input"));

        searchBox.sendKeys("Selenium Shadow DOM");
        Thread.sleep(3000);

        driver.quit();
    }
}
