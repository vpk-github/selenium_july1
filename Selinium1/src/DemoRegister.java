import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DemoRegister {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
			driver.findElement(By.id("gender-male")).click();
			driver.findElement(By.id("FirstName")).sendKeys("pavan");
			driver.findElement(By.name("LastName")).sendKeys("velamuuri");
			driver.findElement(By.name("Email")).sendKeys("v_pavan@gmail.com");

			driver.findElement(By.id("Password")).sendKeys("adjcj2345@");
			driver.findElement(By.name("ConfirmPassword")).sendKeys("adjcj2345@");
			driver.findElement(By.name("register-button")).click();
	}
}
