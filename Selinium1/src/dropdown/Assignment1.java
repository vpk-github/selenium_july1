package dropdown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment1 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			driver.get("https://demowebshop.tricentis.com/");
			
		driver.findElement(By.partialLinkText("Books")).click();		

		WebElement display = driver.findElement(By.id("products-pagesize"));
		Select displaySel = new Select(display);
		displaySel.selectByValue("https://demowebshop.tricentis.com/books?pagesize=12");
		
		WebElement view = driver.findElement(By.id("products-viewmode"));
		Select viewSel = new Select(view);
		viewSel.selectByVisibleText("List");
		
		WebElement sort = driver.findElement(By.id("products-orderby"));
		Select sortSel = new Select(sort);
		sortSel.selectByIndex(1);

		
	}
}
