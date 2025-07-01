package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCSSProperty {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
			driver.findElement(By.xpath("//input[@value='Log in']")).click();
			String color = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getCssValue("color");
			String fontSize = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getCssValue("fontSize");
			String fontFamily = driver.findElement(By.xpath("//div[@class='validation-summary-errors']")).getCssValue("fontFamily");
				
			System.out.println(color);
			System.out.println(fontSize);
			System.out.println(fontFamily);
			
		
	}
	
}
