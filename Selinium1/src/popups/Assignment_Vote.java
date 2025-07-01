package popups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Vote {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demowebshop.tricentis.com/");

		driver.findElement(By.xpath("//input[@value='Vote']")).click();
		Alert popup = driver.switchTo().alert();
		String text = popup.getText();
		System.out.println(text);
		popup.accept();

		
	}
}
