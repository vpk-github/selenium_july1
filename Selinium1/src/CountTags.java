import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountTags {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");

		List<WebElement> links = driver.findElements(By.tagName("a"));
			System.out.println("links count: "+links.size());

			
		List<WebElement> images = driver.findElements(By.tagName("img"));
			System.out.println("images count: "+images.size());

	}
}
