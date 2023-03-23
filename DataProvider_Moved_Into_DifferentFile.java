package package1;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class DataProvider_Moved_Into_DifferentFile {

	@DataProvider(name="create")
	public Object[][] dataprovider1(Method m) {
		 
		Object[][] testdata= null;
		
		if(m.getName().equals("dataset")) {
			
			testdata= new Object[][]	
					
					{
				{"user1","pass1"},
				{"user2","pass2"},
				{"user3","pass3"},
				{"user4","pass4"}
				
					};
}
		else if(m.getName().equals("dataset1")) {
testdata= new Object[][]	
					
					{
			
			{"user1","pass1","test1"},
			{"user2","pass2","test2"},
			{"user3","pass3","test3"},
			{"user4","pass4","test4"}
					};
		}
		return testdata;		
	}
	
	
}
