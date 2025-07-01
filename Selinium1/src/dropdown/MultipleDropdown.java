package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleDropdown {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("file:///C:/Users/LENOVO/Desktop/dropdown.html");
		
		WebElement cars = driver.findElement(By.id("car"));
		Select carSel = new Select(cars);
		
		carSel.selectByIndex(0);
		carSel.selectByValue("2");
		carSel.selectByVisibleText("TATA");	
		
		Thread.sleep(2000);
		carSel.deselectByIndex(0);
		carSel.deselectByValue("2");
		carSel.deselectByVisibleText("TATA");
		
		
		List<WebElement> allOptions = carSel.getOptions();
		for(WebElement ele:allOptions)
		{
			System.out.println(ele);
		}
		
		for(WebElement ele:allOptions)
		{
			System.out.println(ele.getText());
		}
		
		
	}
}
