package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetPageSource {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		String src = driver.getPageSource();
		System.out.println(src);
		
	}
}
