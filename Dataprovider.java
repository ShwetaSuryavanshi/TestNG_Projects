package package1;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



public class Dataprovider {

	@Test(dataProvider="dataprovider")
	//@Test(dataProvider="create") // either provide dataprovider name or method name both works same
	public void dataset(String username, String password) {
		
		System.out.println(username+"     "+password);
	}
	
	@Test(dataProvider="dataprovider1")
	public void dataset2(String username, String password, String test) {
		
		System.out.println(username+"     "+password+"      "+test);
	}
	
	
	@DataProvider
	//DataProvider(name="create")
	public Object[][] dataprovider() {
		
	 Object[][] dataset = new Object[4][2];
	 dataset[0][0]= "user1";
	 dataset[0][1]= "pass1";
	 
	 dataset[1][0]= "user2";
	 dataset[1][1]= "pass2";
	 
	 dataset[2][0]= "user3";
	 dataset[2][1]= "pass3";
	 
	 dataset[3][0]= "user4";
	 dataset[3][1]= "pass4";
	 
	 return dataset;
	 }
	
	
	@DataProvider
	public Object[][] dataprovider1() {
		 
		 return new  Object[][] {{"username0","password0","test0"},{"username1","password1","test1"}};
		 } 
}


