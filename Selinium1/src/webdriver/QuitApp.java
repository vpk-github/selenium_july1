package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitApp {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/23");
		
		Thread.sleep(30000);
		driver.findElement(By.id("compare")).click();
		
		driver.quit();
		
	}	
}
