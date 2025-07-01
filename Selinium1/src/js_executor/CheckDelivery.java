package js_executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public interface CheckDelivery {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://shoppersstack.com/products_page/23");
		driver.manage().window().maximize();	
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,500)");
	
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

	
			driver.findElement(By.id("Check Delivery")).sendKeys("560010");
			driver.findElement(By.xpath("//button[@id='Check']")).click();
	}
}
