package testNGTests;

import org.testng.annotations.Test;

import SanityTests.dpCSV;
import SanityTests.loginUtil;
import utils.TestListener;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;

public class dpSimpleTest {
	
	@Test(
	        dataProvider = "csvLoginData",
	        dataProviderClass = dpCSV.class
	    )
	public void dispEmp(String un, String pw) {
	  //boolean result;
	 // System.out.println("Username:" + un + " Password:" + pw);
	  
	  /*result =loginUtil.login(un, pw);
	  
	  Assert.assertTrue(result);
	  */
	  
  }

  
}
