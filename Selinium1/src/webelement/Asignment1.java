package webelement;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Asignment1 {

	public static void main(String[] args)  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.vtiger.com/vtigercrm/");
		
			driver.findElement(By.linkText("Vtiger")).click();
			
			Set<String> windowIDS = driver.getWindowHandles();
			
			for(String id: windowIDS)
			{
				driver.switchTo().window(id);
				String url = driver.getCurrentUrl();
				if(url.equals("https://www.vtiger.com/"))
				{
					System.out.println("equal");
					break;
				}
				
			}
			driver.findElement(By.id("login")).click();
		
			driver.findElement(By.xpath("//input[@name='username']")).sendKeys("pavan123");
			driver.findElement(By.xpath("//input[@name='password']")).sendKeys("pavan123");
			driver.findElement(By.xpath("//button[text()='Sign in']")).click();			
	}
}
