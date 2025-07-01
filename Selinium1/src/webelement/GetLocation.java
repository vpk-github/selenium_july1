package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetLocation {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/login");
		Point point = driver.findElement(By.xpath("//input[@value='Search']")).getLocation();
			System.out.println(point.getX());
			System.out.println(point.getY());
	
		Point point2 = driver.findElement(By.xpath("//input[@value='Search store']")).getLocation();
			System.out.println(point2.getX());
			System.out.println(point2.getY());
	
			

	}
}
