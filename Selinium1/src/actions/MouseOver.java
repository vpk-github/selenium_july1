package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://www.vtiger.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		WebElement feature = driver.findElement(By.partialLinkText("Features"));
		
		Actions act = new Actions(driver);
		act.moveToElement(feature).perform();		
		
		WebElement salesAuto = driver.findElement(By.partialLinkText("Sales Automation"));
		act.moveToElement(salesAuto).perform();
		
		//Actions act = new Actions(driver);
		//act.moveByOffset(357,105).perform();			
		
	}
}
