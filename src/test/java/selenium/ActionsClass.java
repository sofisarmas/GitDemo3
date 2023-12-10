package selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.devtools.v118.indexeddb.model.Key;
import org.openqa.selenium.interactions.Actions;

public class ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
//		JavascriptExecutor jse = (JavascriptExecutor)driver;
//		jse.executeScript("window.scrollBy(0,1300)");
		Actions a = new Actions(driver);
//		a.moveToElement(driver.findElement(By.id("mousehover"))).build().perform();
//		Thread.sleep(Duration.ofSeconds(3));
		
//		a.contextClick().build().perform();
		WebElement name = driver.findElement(By.id("name"));
		a.keyDown(Keys.SHIFT).sendKeys(name, "Sofi").build().perform();
//		driver.close();
		name.sendKeys("Sarmas");
		a.keyUp(Keys.SHIFT).sendKeys("sarmas").build().perform();
		
	}

}
