package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dream11_assignment {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.dream11.com/");
	
		//driver.findElement(By.id("regEmail")).sendKeys("8080987621");
		driver.findElement(By.xpath("//input[@id='regEmail']")).sendKeys("8080875421");
		
	}
}
