package SanityTests;

import utils.CSVUtils;

public class readCSVAndLoginTest extends CSVUtils{
	public static String un;
	public static String pw;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Object[][] myData =readData("src/test/resources/testdata.csv");
		int r=1;
		int c=0;
		for (Object[] row : myData) {
			
			c=0;
			for (Object value : row) {
		       // System.out.print(  "Row: " + r + " Col:" +  c+ " " +value + " ");
		        
		        un = (String) row[0];
		        pw = (String) row[1];
		        c+=1;
		        }
			System.out.print("Username:" + un + " Password:" + pw);
		    loginUtil.login(un, pw);
			r+=1;
		    System.out.println();
		    
		    
		    
		}
	}

}
