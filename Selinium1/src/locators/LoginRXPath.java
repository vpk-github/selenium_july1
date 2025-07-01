package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginRXPath {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
			driver.findElement(By.xpath("//a[@class='ico-login']")).click();
			
		driver.findElement(By.xpath("//input[contains(@class,'email')]")).sendKeys("pavankrishna123@gmail.com");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("pavankrishna123@gmail.com");
		
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
	}
}
