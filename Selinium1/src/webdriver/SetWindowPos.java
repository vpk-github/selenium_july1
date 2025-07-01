package webdriver;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetWindowPos {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.shoppersstack.com/products_page/23");
		driver.manage().window().maximize();
		Thread.sleep(15000);
	
		driver.findElement(By.id("compare")).click();
		SwitchToWindow(driver, "flipkart");
			Point flipkartPos = driver.manage().window().getPosition();
		
		SwitchToWindow(driver, "ebay");
			Point ebayPos = driver.manage().window().getPosition();
			driver.manage().window().setPosition(flipkartPos);
	
		
	}

	public static void SwitchToWindow(WebDriver driver, String expUrl)
	{
		Set<String> windowIDs = driver.getWindowHandles();
		for(String id: windowIDs)
		{
			driver.switchTo().window(id);
			String actualURL = driver.getCurrentUrl();
			if(actualURL.equals(expUrl))
			{
				Point point = driver.manage().window().getPosition();
				System.out.println(point.getX());
				System.out.println(point.getY());
				
				break;
			}
		}
	}

}

