package webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
		boolean selected = driver.findElement(By.xpath("//label[text()='Excellent']/..//input[@type='radio']")).isSelected();
		System.out.println(selected);
		driver.findElement(By.xpath("//label[text()='Excellent']/..//input[@type='radio']")).click();
		selected = driver.findElement(By.xpath("//label[text()='Excellent']/..//input[@type='radio']")).isSelected();
		System.out.println(selected);
		
		
	}
}
