package dataprovider;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class RegisterDemoWebShop {

	@Test(dataProviderClass = RegisterData.class, dataProvider = "registerUser")
	public void register(String user[])
	{

		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demowebshop.tricentis.com/register");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	
		driver.findElement(By.xpath("//input[@value='M']")).click();
		driver.findElement(By.id("FirstName")).sendKeys(user[0]);
		driver.findElement(By.id("LastName")).sendKeys(user[1]);
		driver.findElement(By.id("Email")).sendKeys(user[2]);

		driver.findElement(By.id("Password")).sendKeys(user[3]);
		driver.findElement(By.id("ConfirmPassword")).sendKeys(user[4]);

	}
	
}
