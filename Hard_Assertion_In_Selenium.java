package package1;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Hard_Assertion_In_Selenium {
	
	@Test
	public void tittle() {
		System.setProperty("webdriver.http.factory", "jdk-http-client");
	//	System.setProperty("webdriver.chrome.driver", "D:\\Devops\\Selenium_Related_configurations\\Selenium_Chromedriver\\chromedriver.exe");
	//Hard Assertion: if one fails it stops at that point. it doesn't proceed further
		
		WebDriver driver = new ChromeDriver();
		//driver= new ChromeDriver();
        String expectedtitle="Amazon.com. Spend less. Smile more.";
        String expectedtext="Search Amazon";
	driver.get("https://www.amazon.com/");
		System.out.println("Title");
		String actualtitle=driver.getTitle();
		
		Assert.assertEquals(actualtitle, expectedtitle);
		System.out.println("Text");
		String actualtext=	driver.findElement(By.xpath("//*[@id=\"nav-search-keywords\"]")).getAttribute("placeholder");
		Assert.assertEquals(actualtext, expectedtext, "text");
		
		
	}

}
