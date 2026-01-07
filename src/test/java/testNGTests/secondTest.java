package testNGTests;

import org.testng.annotations.Test;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;

public class secondTest {
  @Test (groups="smoke")
  public void secondTestMethod1() {
	  System.out.println("In secondTest Method1");
  
	  Assert.assertEquals(false, true);
  }
  @AfterSuite
  public void afterSuite() {
	  
	  System.out.println("In secondTest Method2 closing db afterSuite");
	  
  }

}
