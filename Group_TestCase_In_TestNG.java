package package1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Group_TestCase_In_TestNG {
	@Test(priority=2,groups="UITesting")
	public void test1() {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.ebay.com.au/");
		
		String expectedvalue="Search";
		String actualvalue=driver.findElement(By.id("gh-btn")).getAttribute("value");
		
		SoftAssert softassert=new SoftAssert();
		
		softassert.assertEquals(actualvalue, expectedvalue, "SoftAssert");
		softassert.assertAll();
		
	}
	@Test(priority=1, groups="Regression")
	public void test2() {
		System.out.println("Test2");
		
	}
	@Test(groups={"Regression","UITesting"})
	public void test3() {
		System.out.println("Test3");
		
	}
	
	@Test(priority=3, groups={"Regression","UITesting"})
	public void test4() {
		System.out.println("Test4");
		
	}

}
