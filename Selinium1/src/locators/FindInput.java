package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindInput {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
			driver.findElement(By.id("email")).sendKeys("pavankrishna");
			driver.findElement(By.id("pass")).sendKeys("anbwux13243@");
	
	}
}
