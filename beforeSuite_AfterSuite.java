package package1;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class beforeSuite_AfterSuite {

	@BeforeSuite
	public void beforeTestSuite() {
		System.out.println("Before test suite");
	}
	@AfterSuite
	public void afterTestSuite() {
		System.out.println("after test suite");
	}
}
