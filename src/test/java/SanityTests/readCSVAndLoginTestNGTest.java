package SanityTests;

import org.testng.Assert;
import org.testng.annotations.Test;


public class readCSVAndLoginTestNGTest{
	
	
	@Test(
	        dataProvider = "csvLoginData",
	        dataProviderClass = dpCSV.class
	    )
	public void loginTestNGTest(String s1,String s2) {
		boolean result;
		
		 result =   loginUtil.login(s1,s2);
		 
		 System.out.println("Login " +s1 + " and " +s2 + " " + result);
		 
		 Assert.assertEquals(result, true);   
		    
		}
	}


