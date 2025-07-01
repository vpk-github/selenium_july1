package popups;

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
import org.openqa.selenium.support.ui.Select;

public class Assignment_June1 {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demowebshop.tricentis.com/");
	
		driver.findElement(By.xpath("//a[text()='Facebook']")).click();
		
		Set<String> ids = driver.getWindowHandles();
		for(String id: ids)
		{
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			if(url.contains("facebook"))
			{
				break;
			}
		}

		//driver.findElement(By.xpath("//input[@name='email']")).sendKeys("velamuri_pk123");
		//driver.findElement(By.xpath("//input[@name='pass']")).sendKeys("velamuri_PK123@");
		
		driver.findElement(By.xpath("//span[text()='Create new account']")).click();		
	
		ids = driver.getWindowHandles();
		for(String id: ids)
		{
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			if(url.contains("facebook/reg"))
			{
				break;
			}
		}
		
		WebElement month = driver.findElement(By.id("month"));
		Select monthSel = new Select(month);
			monthSel.selectByValue("12");
	
		TakesScreenshot ts =  (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/addToCart1.png");
		FileHandler.copy(temp, dest);
		
	}
}
