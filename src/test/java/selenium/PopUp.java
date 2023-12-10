package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class PopUp {
	
	@Test(groups = {"Smoke", "Regression"}, dependsOnMethods = "all", enabled = false)
	public static void demo() {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
//		driver.findElement(By.id("confirmbtn")).click();
//		driver.switchTo().alert().dismiss();
		driver.switchTo().frame("courses-iframe");
		String email = driver.findElement(By.className("fa-envelope")).getText();
		System.out.println(email);
		System.out.println("HELLO");
		driver.switchTo().parentFrame();
		Select sel = new Select(driver.findElement(By.name("dropdown-class-example")));
		sel.selectByIndex(1);
	}
	
	@Test
	public void all() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.xpath("//input[@value ='radio1']")).click();
	}
}
