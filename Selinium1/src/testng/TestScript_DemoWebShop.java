package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript_DemoWebShop extends BaseClass_Conditions
{
	@Test
	public void clickOnBook()
	{
		driver.findElement(By.partialLinkText("BOOKS")).click();
		if(driver.getTitle().equals("Demo Web Shop. Books"))
		{
			Reporter.log("Books page is disaplyed", true);
		}
		else
		{
			Reporter.log("Books page is not disaplyed", true);			
		}
	}

}
