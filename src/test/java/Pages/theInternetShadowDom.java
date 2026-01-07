package Pages;


import org.openqa.selenium.By;

import utils.BaseTest;

public class theInternetShadowDom extends BaseTest{

    public String shadowTextOne () {
        return getDriver ().findElement (By.cssSelector ("#content > my-paragraph:nth-child(4) > span"))
            .getText ();
    }

    public String shadowTextTwo () {
        return getDriver ().findElement (By.cssSelector ("#content > my-paragraph:nth-child(5) > ul:nth-child(1) > li"))
            .getText ();
    }
}