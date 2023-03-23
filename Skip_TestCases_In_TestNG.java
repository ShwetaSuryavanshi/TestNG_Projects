package package1;

import org.testng.SkipException;
import org.testng.annotations.Test;

public class Skip_TestCases_In_TestNG {
     boolean dataset=true;
	@Test(enabled=false)
	public void skipTest1() {
		System.out.println("Skip this because it's Incomplete");
	}
	@Test
	public void skiptest2() {
		System.out.println("Skip this forecefully");
		throw new SkipException("Skip this test case forecefully");
	}
	@Test
	public void skiptest3() {
		System.out.println("Skip this on conditions");
		
		if(dataset==true)
			System.out.println("Execute");
		else
			System.out.println("Skip");
}
}
