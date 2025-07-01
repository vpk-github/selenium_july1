package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_Electronics extends BaseClass_Conditions
{
	@Test
	public void clickOnElectronics()
	{
		driver.findElement(By.partialLinkText("Electronics")).click();
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("Demo Web Shop. Elect1ronics"))
		{
			Reporter.log("Electronics page is disaplyed", true);
		}
		else
		{
			Reporter.log("Electronics page is not disaplyed", true);			
		}
	}
}
