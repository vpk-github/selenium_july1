package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		driver.manage().window().maximize();
			Thread.sleep(1000);
		
		driver.navigate().back();
			Thread.sleep(1000);
		
			driver.navigate().forward();
			Thread.sleep(1000);
		
		driver.navigate().refresh();
			Thread.sleep(1000);
		
		driver.navigate().to("https://www.redbus.in/");
	}
}
