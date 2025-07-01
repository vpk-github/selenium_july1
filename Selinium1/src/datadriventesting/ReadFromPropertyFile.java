package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ReadFromPropertyFile {

	public static void main(String[] args) throws IOException, InterruptedException {
		
		//1. create FileInputStream object
		FileInputStream fis = new FileInputStream("./TestData/commondata.properties") ;
		
		//2. create respective file type object
		Properties prop = new Properties();
		
		//3. call read method
		prop.load(fis);
		
		String url = prop.getProperty("url");
		System.out.println(url);
	
	
		String email = prop.getProperty("email");
			System.out.println(email);
		String pswd = prop.getProperty("password");
			System.out.println(pswd);

	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
	
		Thread.sleep(2000);
		driver.findElement(By.linkText("Log in")).click();
		
		driver.findElement(By.xpath("//input[@id='Email']")).sendKeys(email);
				
		driver.findElement(By.xpath("//input[@id='Password']")).sendKeys(pswd);
		
		
	}
}
