package package1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class BeforeClass_BeforeGroups {
	@BeforeClass
	public void beforeclass() {
		System.out.println("Run before class");
		
	}
	@AfterClass
	public void afterclass() {
		System.out.println("Run after class");
		
	}
	@BeforeGroups(value="Regression")
	public void beforegroup() {
		System.out.println("Run before group");
		
	}
	
	@AfterGroups(value="Regression")
	public void Aftergroup() {
		System.out.println("Run after group");
		
	}
	
	@Test(priority=2, groups="Regression")
	public void test1() {
		System.out.println("Regression test1");
	}
	@Test(priority=3, groups="Regression")
	public void test2() {
		System.out.println("Regression test2");
	}
	@Test(groups={"Regression", "UI"})
	public void test3() {
		System.out.println("Regression + UI test3");
	}
	@Test(priority=1, groups="UI")
	public void test4() {
		System.out.println("UI test4");
	}
}
