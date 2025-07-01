package js_executor;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Assignment_Register {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://shoppersstack.com/");
		driver.manage().window().maximize();	
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.id("loginBtn")).click();

			driver.findElement(By.id("Create Account")).click();
			
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);
		
		for(String id: ids)
		{
			System.out.println(id);
			
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			if(url.equals("https://shoppersstack.com/signup"))
				break;
		}
		driver.findElement(By.id("First Name")).sendKeys("Pavan");
		driver.findElement(By.id("Last Name")).sendKeys("Velamuri");
			
		driver.findElement(By.name("Male")).click();

		driver.findElement(By.id("Phone Number")).sendKeys("9875674420");
		driver.findElement(By.id("Email Address")).sendKeys("v_pavan123@gmail.com");

		driver.findElement(By.id("Password")).sendKeys("vpavanK@123");
		driver.findElement(By.id("Confirm Password")).sendKeys("vpavanK@123");

		driver.findElement(By.id("Terms and Conditions")).click();
		
		//driver.findElement(By.xpath("//button[@id='Register']")).click();
		
		WebElement regBtn = driver.findElement(By.id("Register"));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(regBtn));
		regBtn.click();
		
		TakesScreenshot ts =  (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/imageREG.png");
		FileHandler.copy(temp, dest);

	}
}
