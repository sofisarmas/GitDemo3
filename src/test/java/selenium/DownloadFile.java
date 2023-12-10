package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class DownloadFile {
	@Parameters("URL")
	@Test(groups = {"Regression","Hello"})
	public void download(String url) {
		ChromeOptions options = new ChromeOptions();
		WebDriver driver = new ChromeDriver();
		driver.get("https://omayo.blogspot.com/p/page7.html");
		driver.findElement(By.linkText("ZIP file")).click();
		System.out.println(url);
	}
}
