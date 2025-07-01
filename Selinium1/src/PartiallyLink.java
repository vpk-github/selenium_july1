import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartiallyLink {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://demowebshop.tricentis.com/");
		
		//driver.findElement(By.partialLinkText("viewed")).click();
		//driver.findElement(By.partialLinkText("Computers")).click();
			
			driver.findElement(By.className("ico-login")).click();
	}
}
