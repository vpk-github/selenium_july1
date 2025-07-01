package dropdown;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class GetSelectedOption {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("file:///C:/Users/LENOVO/Desktop/dropdown.html");
		
		WebElement cars = driver.findElement(By.id("car"));
		Select carSel = new Select(cars);
		
		
		System.out.println(carSel.isMultiple());
		carSel.selectByIndex(0);
		carSel.selectByIndex(2);
		carSel.selectByIndex(4);
		
		List<WebElement> options = carSel.getAllSelectedOptions();
		System.out.println(options);
		System.out.println(carSel.getFirstSelectedOption());
		
		for(WebElement ele: options)
		{
			System.out.println(ele.getText());
		}
		
	}
}
