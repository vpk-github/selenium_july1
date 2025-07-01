package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDependent {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://shoppersstack.com/");
		
			driver.findElement(By.xpath("//span[text()='ROADSTER']/../../..//button[text()='add to cart']"));
			//span[text()='ROADSTER']/..//span[text()='% off']
		    
			//label[text()='Good']/..//input[@type='radio']
	}
}
