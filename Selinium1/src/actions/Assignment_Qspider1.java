package actions;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Assignment_Qspider1 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://demoapps.qspiders.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		driver.findElement(By.xpath("//section[text()='Button']")).click();

		driver.findElement(By.xpath("//a[text()='Right Click']")).click();

		WebElement rightClick = driver.findElement(By.xpath("//button[text()='Right Click']"));
		Actions act = new Actions(driver);
		act.contextClick(rightClick).perform();
		
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		
		WebElement selectedOption = driver.findElement(By.xpath("//span[text()='You selected 'Yes']"));
		String text = selectedOption.getText();
		System.out.println(text);
		
	    TakesScreenshot ts =  (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/selectedYes1.png");
		FileHandler.copy(temp, dest);
		
	}
}
