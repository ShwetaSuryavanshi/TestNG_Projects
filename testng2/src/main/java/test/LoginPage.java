package test;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginPage  {
	WebDriver driver;
	@BeforeTest
	public void setup() {
		
		System.setProperty("webdriver.http.factory","jdk-http-client");
		driver = new FirefoxDriver();
		driver.get("https://amazon.in");
		driver.manage().window().maximize();
	}
	
	@Test(priority=1)
    public void test1() {
		String title= driver.getTitle();
		Assert.assertEquals(title, "Online Shopping site in India: Shop Online for Mobiles, Books, Watches, Shoes and More - Amazon.in"); 
		
		WebDriverWait explict= new WebDriverWait(driver,Duration.ofSeconds(30));
		explict.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='nav-line-1-container']//child::span")));
	
		driver.findElement(By.xpath("//div[@class='nav-line-1-container']//child::span")).click();
		driver.findElement(By.cssSelector("input[id='ap_email']")).sendKeys("jhjgrfgf");
		
		driver.navigate().back();
		driver.navigate().back();
	}
	@Test(priority=2, enabled=false)	
	public void test2() {
		driver.findElement(By.cssSelector("i[class='hm-icon nav-sprite']")).click();
		driver.findElement(By.xpath("/html/body/div[2]/div[1]/div")).click();
		
	}
	
	@Test(priority=3, invocationCount=10)
	public void test3() throws InterruptedException {
	JavascriptExecutor jse= (JavascriptExecutor) driver;
	jse.executeScript("window.scrollBy(0,1000)");
	Thread.sleep(2000);
	}
	
	@Test(priority=4, dependsOnMethods="test3")	
	public void test4() throws InterruptedException {
		driver.findElement(By.xpath("//span[@class='nav-arrow icp-up-down-arrow']")).click();
		driver.findElement(By.xpath("//input[@value='kn_IN']//following-sibling::i")).click();
		Thread.sleep(2000);
		
		//Thread.sleep(2000);
	}
	
	
	
//	@AfterTest
//	public void teardown() {
//		driver.quit();
//	}
//	
}
