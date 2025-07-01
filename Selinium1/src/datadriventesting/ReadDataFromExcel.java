package datadriventesting;

import java.io.FileInputStream;

import java.io.IOException;
import java.time.LocalDateTime;
import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("./TestData/testscriptdata.xlsx");
		Workbook wfactory = WorkbookFactory.create(fis);
		
		String url = wfactory.getSheet("Sheet1").getRow(1).getCell(0).getStringCellValue();
		System.out.println(url);
 
		double price = wfactory.getSheet("Sheet1").getRow(1).getCell(3).getNumericCellValue();
		System.out.println(price);

		boolean status = wfactory.getSheet("Sheet1").getRow(1).getCell(4).getBooleanCellValue();
		System.out.println(status);

		LocalDateTime date = wfactory.getSheet("Sheet1").getRow(1).getCell(5).getLocalDateTimeCellValue();
		System.out.println(date);

		System.out.println(date.getDayOfMonth());
		System.out.println(date.getMonth());
		System.out.println(date.getYear());
		
		
		

		
	
	
	}
}
