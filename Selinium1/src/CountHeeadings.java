import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountHeeadings {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://www.facebook.com");
			driver.findElement(By.partialLinkText("Contact uploading")).click();
		List<WebElement> headings = driver.findElements(By.tagName("h2"));
		System.out.println("headings count: "+headings.size());
	}
}
