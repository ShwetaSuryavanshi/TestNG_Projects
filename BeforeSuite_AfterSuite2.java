package package1;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class BeforeSuite_AfterSuite2 extends beforeSuite_AfterSuite {
	@BeforeTest
	public void before() {
		System.out.println("BeforeTest");
		
	}
	@BeforeMethod
	public void before1() {
		System.out.println("BeforeMethod");
		
	}
	@Test(priority=2)
	public void test1() {
		System.out.println("Test1");
		
	}
	@Test(priority=1, groups="Regression")
	public void test2() {
		System.out.println("Test2");
	}
	@AfterMethod
	public void after() {
		System.out.println("AfterMethod");
	}
	
	@AfterTest
	public void After1() {
		System.out.println("AfterTest");
		
	}

}
