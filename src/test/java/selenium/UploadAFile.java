package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class UploadAFile {
	
	@Test
	public void upload() throws InterruptedException {
		ChromeOptions co = new ChromeOptions();
		co.addArguments("--disable-notification");
		WebDriver driver = new ChromeDriver(co);
		driver.get("https://omayo.blogspot.com/");
		
		JavascriptExecutor jse = (JavascriptExecutor) driver;
		
		jse.executeScript("window.scrollBy(0,1500)");
		Thread.sleep(Duration.ofSeconds(2));
		driver.findElement(By.cssSelector("#uploadfile"))
		.sendKeys("C:\\Users//ADMIN//Downloads//bill.jpg");
		String projectPath = System.getProperty("user.dir");
		
	}
}
