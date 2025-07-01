package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathDepInd2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://www.redbus.in/railways");
				driver.findElement(By.xpath("//span[text()='Live train status']")).click();
				
	driver.findElement(By.xpath("//div[text()='RAJENDRANAGAR T']/../../..//button[text()='Show Availability']")).click();
			
			
	}
}
