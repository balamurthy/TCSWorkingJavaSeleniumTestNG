package testNGTests;

import static org.testng.Assert.assertEquals;

import org.testng.annotations.Test;
import Pages.DownloadPage;
import Pages.ShadowDomPage;
import Pages.theInternetShadowDom;
import Pages.WatirHomePage;
import utils.BaseTest;

public class ShadowDomTests extends BaseTest {

    @Test
    public void testShadowDom () {
        getDriver ().get ("https://the-internet.herokuapp.com/shadowdom");
        final theInternetShadowDom shadowDom = new theInternetShadowDom ();
        assertEquals (shadowDom.shadowTextOne (), "Let's have some different text!");
        System.out.println (shadowDom.shadowTextTwo ());
    }

    @Test
    public void testShadowDomRootOnChromeDownloadPage () {
        getDriver ().get ("chrome://downloads/");
        final DownloadPage downloadPage = new DownloadPage ();
        assertEquals (downloadPage.downloadPageHeaderText (), "Download history");
        assertEquals (downloadPage.googleDownloadPageHeaderText (), "Download history");
        assertEquals (downloadPage.pageHeaderTextUsingJScripExecutor (), "Download history");
    }

    @Test
    public void testShadowDomSeleniumPlayground () {
        getDriver ().get ("https://www.lambdatest.com/selenium-playground/shadow-dom");
        final ShadowDomPage shadowDomPage = new ShadowDomPage ();
        final String name = "xyz";
        final String email = "xyz.abcd@gmail.com";
        shadowDomPage.updateDetails (name, email);
        assertEquals (shadowDomPage.getNameText (), name);
        assertEquals (shadowDomPage.getEmailText (), email);
    }

    @Test
    public void testShadowDomWatir () {
        getDriver ().get ("http://watir.com/examples/shadow_dom.html");
        final WatirHomePage homePage = new WatirHomePage ();
        // assertEquals (homePage.getSomeText(), "some text");
        assertEquals (homePage.getShadowDomText (), "some text");
        assertEquals (homePage.getNestedShadowText (), "nested text");
        assertEquals (homePage.getNestedText (), "nested text");
        assertEquals (homePage.getNestedTextUsingJSExecutor (), "nested text");
    }
}