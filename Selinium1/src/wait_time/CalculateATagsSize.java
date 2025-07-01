package wait_time;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalculateATagsSize {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();	
		
	    driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(2));
		
				driver.get("https://shoppersstack.com/");
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println(images.size());
		
		
	}
}
