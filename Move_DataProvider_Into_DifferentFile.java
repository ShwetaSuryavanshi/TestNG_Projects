package package1;

import org.testng.annotations.Test;

public class Move_DataProvider_Into_DifferentFile {

	
	@Test(dataProvider="create",dataProviderClass=DataProvider_Moved_Into_DifferentFile.class)
	//@Test(dataProvider="create") // either provide dataprovider name or method name both works same
	public void dataset(String username, String password) {
		
		System.out.println(username+"     "+password);
	}
	
	@Test(dataProvider="create",dataProviderClass=DataProvider_Moved_Into_DifferentFile.class)
	public void dataset2(String username, String password, String test) {
		
		System.out.println(username+"     "+password+"      "+test);
	}
	
	
	
}
