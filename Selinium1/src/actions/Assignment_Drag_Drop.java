package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment_Drag_Drop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
		
		WebElement frame1 = driver.findElement(By.xpath("//iframe[@class='demo-frame lazyloaded']"));
		driver.switchTo().frame(frame1);
		
		WebElement src1 = driver.findElement(By.xpath("//img[@alt='The peaks of High Tatras']"));
			WebElement target = driver.findElement(By.id("trash"));
		Actions act = new Actions(driver);
		act.dragAndDrop(src1, target).perform();
		
		WebElement src2 = driver.findElement(By.xpath("//img[@alt='The chalet at the Green mountain lake']"));
		act.dragAndDrop(src2, target).perform();
		
		//driver.findElement(By.partialLinkText("CheatSheets")).click();

		driver.findElement(By.xpath("//a[text()='CheatSheets']")).click();
		//driver.findElement(By.xpath("//li[@class='menu-item menu-item-type-post_type menu-item-object-page menu-item-6898']")).click();
		
		driver.navigate().back();
		driver.navigate().forward();

		driver.findElement(By.linkText("CheatSheets")).click();

	}
}
