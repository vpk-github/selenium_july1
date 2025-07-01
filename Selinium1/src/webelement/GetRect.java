package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.Rectangle;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetRect {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Rectangle rect = driver.findElement(By.xpath("//input[@value='Search']")).getRect();
			System.out.println(rect.getHeight());
			System.out.println(rect.getWidth());
			
			System.out.println(rect.getX());
			System.out.println(rect.getY());

	}
}
