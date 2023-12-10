package testngPack;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class testng1 {

	@BeforeSuite
	public void testsuite() {
		System.out.println("Testsuite");
	}
	
	@BeforeClass
	public void class1 () {
		System.out.println("beforeclass");
	}
	@BeforeMethod
	public void method1 () {
		System.out.println("beforemethod");
	}
	
	@Test
	public void login() {
		System.out.println("Logged in");
	}
	@AfterSuite
	public void testsuite1() {
		System.out.println("afterTestsuite");
	}
	@AfterClass
	public void class2 () {
		System.out.println("afterclass");
	}
	@AfterMethod
	public void method2 () {
		System.out.println("aftermethod");
	}
	
	
}
