package screenshot_package;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class TakeMultipleScreenshots {

	public static void main(String[] args) throws IOException {
		LocalDateTime time = LocalDateTime.now();
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://flipkart.com/");
			
		    TakesScreenshot ts =  (TakesScreenshot) driver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File dest = new File("./screenshots/"+time+".png");
			FileHandler.copy(temp, dest);
	}
	
}
