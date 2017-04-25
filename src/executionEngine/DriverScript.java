package executionEngine;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverScript {

	private static WebDriver driver = null;
	public static void main(String[] args) {
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.store.demoqa.com");
		driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	    driver.findElement(By.id("log")).sendKeys("testuser121212"); 
	    driver.findElement(By.id("pwd")).sendKeys("6DuHQyQbkx6GJ6$V");
	    driver.findElement(By.id("login")).click();
	    driver.findElement (By.xpath(".//*[@id='account_logout']/a")).click();
	    driver.quit();
		// TODO Auto-generated method stub

	}

}
