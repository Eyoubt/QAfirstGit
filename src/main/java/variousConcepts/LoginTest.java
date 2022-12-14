package variousConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		launchBrowser();
		loginTest();
	}
	
	public static void launchBrowser() {
		System.setProperty("webdriver.chrome.driver", ".\\driver\\chromedriver.exe");
		
		driver = new ChromeDriver();
		driver.get("https://techfios.com/billing/?ng=admin/");
		driver.manage().window().maximize();
	}
	
	public static void loginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc123");
		driver.findElement(By.name("login")).click();
	}
	
	public static void negLoginTest() {
		driver.findElement(By.id("username")).sendKeys("demo@techfios.com");
		driver.findElement(By.id("password")).sendKeys("abc1236");
		driver.findElement(By.name("login")).click();
	}
	
	
	public void tearDown() {
		driver.close();
		driver.quit();
	}
	
}
