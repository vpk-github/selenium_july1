package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetURL {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		String url = driver.getCurrentUrl();
		System.out.println(url);
		if(url.equals("https://www.myntra.com/"))
		{
			System.out.println("Welcome page is disaplayed");
		}
		else
		{
			System.out.println("Welcome page is not disaplayed");
		}

	}
}
