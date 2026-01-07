package testNGTests;

import org.testng.Assert;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import utils.TestListener;

@Listeners(TestListener.class)

public class firstTest {
  
  @Test(dependsOnMethods="registrationmethod", groups="sanity")
  public void  loginmethod() {
	  
	  System.out.println("In first Test first method");
	  
	  Assert.assertEquals(true,true);
  
  }
  @Test(groups="regression")
  public void registrationmethod() {
	  
	  System.out.println("In first Test second method");
	  Assert.assertEquals(10, 10);
  }
  
  @BeforeSuite
  public void beforeSuite() {
      System.out.println("open db Before Suite in firstTest");
  }
}
