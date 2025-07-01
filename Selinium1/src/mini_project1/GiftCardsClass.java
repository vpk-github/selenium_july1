package mini_project1;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class GiftCardsClass extends BaseClass1
{

	@Test
	public void launch() throws IOException
	{		
		FileInputStream fis = new FileInputStream("./TestData/commondata5.properties");
		Properties prop = new Properties();
		prop.load(fis);
		
		String url = prop.getProperty("url");
		System.out.println(url);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(url);	
				
		GiftCrdsPOM gcpom = new GiftCrdsPOM(driver);
		gcpom.getGiftCrds().click();
	}
}
