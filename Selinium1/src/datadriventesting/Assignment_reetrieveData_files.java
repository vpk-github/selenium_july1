package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_reetrieveData_files {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("./TestData/commondata2.properties");
		Properties prop = new Properties();
		prop.load(fis);
	
		String url = prop.getProperty("url");
		System.out.println(url);
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		driver.get(url);
		
		FileInputStream fis2 = new FileInputStream("./TestData/testscript2.xlsx");
		Workbook factory = WorkbookFactory.create(fis2);
		
		String fname = factory.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println("first name: "+fname);

		String sname = factory.getSheet("Sheet1").getRow(1).getCell(1).getStringCellValue();
		System.out.println("surname: "+sname);

		Double day = factory.getSheet("Sheet1").getRow(1).getCell(2).getNumericCellValue();
		System.out.println(day);
		
		Double month = factory.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();
		System.out.println(month);

		Double year = factory.getSheet("Sheet1").getRow(1).getCell(4).getNumericCellValue();
		System.out.println(year);

		
		Double gender = factory.getSheet("Sheet1").getRow(1).getCell(5).getNumericCellValue();
		System.out.println(gender);

		String email = factory.getSheet("Sheet1").getRow(1).getCell(6).getStringCellValue();
		System.out.println(email);

		String pswd = factory.getSheet("Sheet1").getRow(1).getCell(7).getStringCellValue();
		System.out.println(pswd);
		
		
		driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys(fname);
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys(sname);
		driver.findElement(By.xpath("//select[@id='day']")).sendKeys(""+day);
		driver.findElement(By.xpath("//select[@id='month']")).sendKeys(""+month);
		driver.findElement(By.xpath("//select[@id='year']")).sendKeys(""+year);
		driver.findElement(By.xpath("//input[@value=2]")).click();
		driver.findElement(By.xpath("//input[@aria-label='Mobile number or email address']")).sendKeys(email);
		driver.findElement(By.xpath("//input[@aria-label='New password']")).sendKeys(pswd);
	}
}
