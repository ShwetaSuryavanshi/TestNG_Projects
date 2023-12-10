package testngPracticeProject1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;


public class _1testng_simpleCode {
	 WebDriver driver;
	 
	 @BeforeTest
	public  void setup() {
		 System.setProperty("webdriver.http.factory", "jdk-http-client");
		 driver= new FirefoxDriver();
		
		 driver.get("https://google.com");
		 driver.manage().window().maximize();
	}
	
	 @Test
	public void test() {
		driver.findElement(By.xpath("//a[text()='Gmail']"));
		driver.navigate().back();
		driver.findElement(By.xpath("//span[text()=\"Sign in\"]"));
	}
	
	@AfterTest
	public void teardown() {
		driver.close();
	}
}
