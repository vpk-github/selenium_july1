package popups;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChildWindowPopup {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get("https://shoppersstack.com/prodcuts_page/23");

		switchToWindow(driver, "amazon");
		String title = driver.getTitle();
		System.out.println(title);		
		
		switchToWindow(driver, "flipkar");
		title = driver.getTitle();
		System.out.println(title);		
		
	}
	
	public static void switchToWindow(WebDriver driver, String expUrl)
	{
		Set<String> ids = driver.getWindowHandles();
		for(String id: ids)
		{
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			if(url.contains(expUrl))
			{
				break;
			}
		}
	}
}
