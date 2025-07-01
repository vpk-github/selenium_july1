package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class VTigerLogin {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
		driver.findElement(By.id("username")).sendKeys("pavan_v345@gmail.com");
		driver.findElement(By.id("password")).sendKeys("pavan2234@");
		driver.findElement(By.xpath("//button[text()='Sign in']")).click();
		
		
		 
	}
}
