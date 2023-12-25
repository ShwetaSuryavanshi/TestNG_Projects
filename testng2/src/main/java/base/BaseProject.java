package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import java.util.Properties;
public class BaseProject {
	
	public static WebDriver driver;
	public static FileReader f;
	public static Properties prop= new Properties();
			

@BeforeTest
public void browsersetup() throws IOException {
	
	if(driver==null) {
		
		f= new FileReader(System.getProperty("D:\\Devops\\TestNG_Updated\\testng2\\configFiles\\configuration.properties"));
		
		prop.load(f);
		 System.out.println(driver);
	}
	
	if(prop.getProperty("browser").equalsIgnoreCase("chrome")) {
		WebDriverManager.chromedriver().setup();
		 driver= new ChromeDriver();
		driver.get(prop.getProperty("url"));
		System.out.println("driver1"+driver);
	}
	
	else if(prop.getProperty("browser").equalsIgnoreCase("firefox")) {
		WebDriverManager.firefoxdriver().setup();
		driver = new FirefoxDriver();
		driver.get(prop.getProperty("url"));
		System.out.println("driver2"+driver);
	}
		
}

@AfterTest
public void teardown() {
	driver.close();
}
}

