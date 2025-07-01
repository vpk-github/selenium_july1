package listener;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerImplementation.class)
public class TestScriptLogin extends BaseClass
{

	@Test
	public void login()
	{
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.id("Email")).sendKeys("virat18rc@gamail.com");
		driver.findElement(By.id("Password")).sendKeys("virat18rc");
		driver.findElement(By.xpath("//input[@value='Log in']")).click();
		
		Assert.assertEquals(driver.getTitle(), "Demo Web Shop", "Home page is not displayed");
		Reporter.log("home page is displayed");
	}
}
