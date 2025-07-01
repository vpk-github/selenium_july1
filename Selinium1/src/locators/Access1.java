package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Access1 {

	public static void main(String[] args) {
		

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("file:///C:/Users/LENOVO/Desktop/MovieTable.html");
		
			String collection = driver.findElement(By.xpath("//td[text()='KGF']/following-sibling::td[1]")).getText();
			System.out.println(collection);
			
			////td[text()='SALAR']/preceding-sibling::td[1]
	}
}
