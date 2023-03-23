package package1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Soft_Assertion_in_selenium {
	
	@Test
	public void tittle() {
		
		
		
		
		
		System.setProperty("webdriver.http.factory", "jdk-http-client");
	//	System.setProperty("webdriver.chrome.driver", "D:\\Devops\\Selenium_Related_configurations\\Selenium_Chromedriver\\chromedriver.exe");
	//Soft Assertion: if one fails it won't stops at that point. it  proceeds further
		
		WebDriver driver = new ChromeDriver();
		//driver= new ChromeDriver();
		
		SoftAssert softassert= new SoftAssert();
        
        
	driver.get("https://www.amazon.com/");
		
	String expectedtitle="Amazon.com. Spend less. Smile more.";
	System.out.println("Title");
		String actualtitle=driver.getTitle();
		softassert.assertEquals(actualtitle, expectedtitle);
		
		String expectedtext="lkjh";
		System.out.println("Text");
		String actualtext="hjgj";
		softassert.assertEquals(actualtext, expectedtext, "text");
		
	String	expextded1= "abcd";
	String actual1="abcd";
	softassert.assertEquals(actual1, expextded1);
		softassert.assertAll();		
	}

	
	
}
