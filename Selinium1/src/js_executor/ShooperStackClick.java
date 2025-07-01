package js_executor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShooperStackClick {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://shoppersstack.com/");
		driver.manage().window().maximize();	
				//Thread.sleep(10000);
			
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.findElement(By.id("loginBtn")).click();
		
		
	}
}
