package sample_projects;

import java.awt.Window;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bng_Hyd_Cheapest_bus {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.abhibus.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		JavascriptExecutor exec = (JavascriptExecutor) driver;
		exec.executeScript("window.scrollBy(0,5000)");
	
	
		driver.findElement(By.xpath("//div[text()='Bangalore ']/..//div[text()=' Hyderabad']/..//a[text()='View Buses']")).click();
		
		Set<String> ids = driver.getWindowHandles();
		System.out.println(ids);

		for(String id: ids)
		{
			driver.switchTo().window(id);
			String url = driver.getCurrentUrl();
			System.out.println(url);
			if(url.equals("https://www.abhibus.com/buses/10/Bangalore-Hyderabad"))
				break;
		}
		
		driver.findElement(By.xpath("//div[text()='Bus Partner']")).click();
		driver.findElement(By.xpath("//label[text()='Go Tour Travels and Holidays']/..//input[@type='checkbox']")).click();		
		
		
		List<WebElement> pricesEle = driver.findElements(By.xpath("//span[text()='From']/..//span[contains(text(),'₹')]"));
		
		List<Integer> prices = new ArrayList<Integer>();

		for(WebElement ele: pricesEle)
		{
			String priceString = ele.getText();
			System.out.println("price: "+priceString);
			
			// to remove ₹ symbol
			priceString = priceString.substring(1);
			System.out.println("with R-rupee operator: "+priceString);

			// to remove , symbol
			priceString = priceString.replaceAll(",","");
			System.out.println("after removing comma , operator: "+priceString);
			
			// to convert into Integer
			int price = Integer.parseInt(priceString);
			prices.add(price);
		}				
		
		System.out.println(prices);
	
		int leastPrice= prices.get(0);
	
		for (int i=1; i<prices.size(); i++)
		{
			 if(prices.get(i) < leastPrice)
			 {
				 leastPrice = prices.get(i);
			 }   	
	    }
		 
	    System.out.println("least price among all buses= "+leastPrice);
	}
}
