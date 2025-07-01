package actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Scrolling {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://www.redbus.in/");
		
		WebElement bookTickets = driver.findElement(By.xpath("//h2[text()='FAQs related to Bus Tickets Booking']"));
		
		Actions act = new Actions(driver);
		act.scrollToElement(bookTickets).perform();		
	
		//act.scrollByAmount(0, 3500).perform();
	}
}
