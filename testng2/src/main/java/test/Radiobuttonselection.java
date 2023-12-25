package test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Radiobuttonselection extends LoginPage {
	
	@Test(priority=5)
	public void test5() {
		WebDriverWait explict = new WebDriverWait(driver, Duration.ofSeconds(30));
		explict.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@value='en_IN']//following-sibling::i")));
		driver.findElement(By.xpath("//input[@value='en_IN']//following-sibling::i")).click();
		
		Actions action= new Actions(driver);
		WebElement ele= driver.findElement(By.xpath("//input[@value='ta_IN']//following-sibling::i"));
		action.moveToElement(ele).build().perform();
		
	}

}
