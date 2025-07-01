package testng;

import org.openqa.selenium.By;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestScript2 extends BaseClass_Conditions
{
	@Test
	public void clickOnComputers()
	{
		driver.findElement(By.partialLinkText("COMPUTERS")).click();
		System.out.println(driver.getTitle());
		if(driver.getTitle().equals("Demo Web Shop. Computers"))
		{
			Reporter.log("Computers page is disaplyed", true);
		}
		else
		{
			Reporter.log("Computers page is not disaplyed", true);			
		}

		
	}

}
