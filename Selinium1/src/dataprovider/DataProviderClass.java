package dataprovider;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderClass {

	@DataProvider
	public String[][] dataSender()
	{
		String data[][] = {{"adminA1","abc123"}, {"adminA2","def456"}, {"adminA3","jkl789"}};
		return data;
	}
	
	@Test(dataProvider = "dataSender")
	public void login(String cred[])
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.saucedemo.com/");
		
		driver.findElement(By.id("user-name")).sendKeys(cred[0]);
		driver.findElement(By.id("password")).sendKeys(cred[1]);		
	}
}
