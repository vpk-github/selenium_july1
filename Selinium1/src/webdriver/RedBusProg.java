package webdriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBusProg {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.redbus.in/");
		String title = driver.getTitle();
		
		System.out.println(title);
		
		Thread.sleep(10000);
		driver.quit();
		
	}
}
