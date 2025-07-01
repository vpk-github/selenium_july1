package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
			//WebDriver driver = new EdgeDriver();
		//driver.get("https://www.myntra.com/");
		
		driver.get("https://www.myntra.com/");
//		String title = driver.getTitle();
//		System.out.println(title);
//		
//		if(title.equals("Online Shopping for Women, Men, Kids Fashion"))
//		{
//			System.out.println("Welcome page is disaplayed");
//		}
//		else
//		{
//			System.out.println("Welcome page is not disaplayed");
//			
//		}
	}
}
