package webdriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DimensionDetails {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		//Dimension size = driver.manage().window().getSize();
		//System.out.println(size.getHeight());
		//System.out.println(size.getWidth());
		
		driver.manage().window().setSize(new Dimension(500, 500));
		
	}
}
