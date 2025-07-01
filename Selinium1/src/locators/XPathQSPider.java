package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XPathQSPider {

	public static void main(String[] args) throws InterruptedException  {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
			driver.get("https://demoapps.qspiders.com/");
		
		driver.findElement(By.xpath("//p[text()='UI Testing Concepts']")).click();
		//driver.findElement(By.xpath("//section[text()='Web Table']")).click();
		
		Thread.sleep(10000);
		driver.findElement(By.xpath("//a[@href='/ui/table']")).click();

		String collection = driver.findElement(By.xpath("::td[1]")).getText();
		System.out.println(collection);
		
		//String collection = driver.findElement(By.xpath("//td[text()='SALAR']/preceding-sibling::td[1]")).getText();
		//System.out.println(collection);
			
	}
}
