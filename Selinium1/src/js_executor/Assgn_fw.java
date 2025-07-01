package js_executor;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Assgn_fw {

	public static void main(String[] args) throws IOException {
		
		LocalDateTime time = LocalDateTime.now();

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.freshersworld.com/");
		driver.manage().window().maximize();
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2200)");
		
	    TakesScreenshot ts =  (TakesScreenshot) driver;
		File temp = ts.getScreenshotAs(OutputType.FILE);
		
		File dest = new File("./screenshots/fw_img1"+time+".png");
		FileHandler.copy(temp, dest);

	}
}
