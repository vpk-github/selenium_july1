import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import pom.MyntraPage;

public class StaleElementExample {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://myntra.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
//		WebElement searchTF = driver.findElement(By.xpath("//input[contains(@placeholder,'Search for products')]"));
//		searchTF.sendKeys("mobiles",Keys.ENTER);
//		searchTF.sendKeys("shoes");

		MyntraPage mp = new MyntraPage(driver);
		mp.getSearchTextField().sendKeys("mobiles",Keys.ENTER);
		mp.getSearchTextField().sendKeys("shoes");
		

		
		
	}
}
