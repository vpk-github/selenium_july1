package testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Honda {

	@Test(groups="regression")
	public void launch()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.honda2wheelersindia.com/");
		Reporter.log("Honda launched", true);
	}
}
