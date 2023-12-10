package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicSelDemo {
	@Test(groups = "Smoke")
	public void print() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com");
//		driver.findElement(By.cssSelector("#APjFqb")).sendKeys("Best place in the world");
//		driver.findElement(By.xpath("//input[@value='Google Search']")).click(); 
//		driver.findElement(By.linkText("Gmail")).click();
//		String name = driver.findElement(By.xpath("//div[text()='India']")).getText();
//		String name =driver.findElement(By.xpath("//div[.='India']")).getText();
//		String name = driver.findElement(By.xpath("//div[contains(@class,'uU7dJb')]")).getText();
		String name = driver.findElement(By.xpath("//div[contains(.,'India')]")).getText();
		System.out.println(name);
		
	}
}
