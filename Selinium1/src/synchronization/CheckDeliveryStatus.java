package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CheckDeliveryStatus {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://shoppersstack.com/products_page/23");
		driver.manage().window().maximize();	
			JavascriptExecutor js = (JavascriptExecutor) driver;
			js.executeScript("window.scrollTo(0,400)");
	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

			driver.findElement(By.id("Check Delivery")).sendKeys("560010");			
			WebElement checkBtn = driver.findElement(By.id("Check"));
			
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(checkBtn));
		checkBtn.click();
	
//		FluentWait wf = new FluentWait(driver);
//		wf.withTimeout(Duration.ofSeconds(20));
//		wf.until(ExpectedConditions.elementToBeClickable(checkBtn));
//		checkBtn.click();
	}
}
