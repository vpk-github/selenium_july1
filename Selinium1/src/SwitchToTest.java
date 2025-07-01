import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToTest {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/23");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		driver.findElement(By.id("compare")).click();
		Set<String> ids = driver.getWindowHandles();

		for(String id: ids)
		{
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			if(url.contains("ebay"))
			{
				
			}
		}
		
	}
}
