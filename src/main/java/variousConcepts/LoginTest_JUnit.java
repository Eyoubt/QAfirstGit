 package variousConcepts;

import java.awt.AWTException;
import java.awt.Desktop.Action;
import java.awt.event.ActionEvent;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.netty.handler.codec.AsciiHeadersEncoder.NewlineType;



public class LoginTest_JUnit {
	
	static WebDriver driver;
	
	@BeforeTest
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();		
	}
	
	@Test
	public static void loginTest() throws AWTException {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.id("password")).clear();
//		driver.findElement(By.name("login")).click();
	
	}
	
	@Test()
	public static void negLoginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc1236");	
		driver.findElement(By.name("login")).click();
		
	}
	
	
	@AfterTest
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
