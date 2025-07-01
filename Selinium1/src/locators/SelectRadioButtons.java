package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelectRadioButtons {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/LENOVO/Desktop/webpage.html");
			driver.findElement(By.xpath("/html/body/input[5]")).click();
			driver.findElement(By.xpath("//input[7]")).click();
	}
}
