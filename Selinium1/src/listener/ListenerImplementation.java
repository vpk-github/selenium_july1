package listener;
import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class ListenerImplementation extends BaseClass implements ITestListener
{
	@Override
	public void onTestSuccess(ITestResult result) {
		Reporter.log("Test script is passs", true);
	}

	@Override
	public void onTestFailure(ITestResult result) {	
		Reporter.log("Test script is failed", true);
		
		TakesScreenshot screenshot = (TakesScreenshot) driver;
		File temp = screenshot.getScreenshotAs(OutputType.FILE);
		File dest = new File("./screenshots/failedTestScript.png");
		try {
			FileHandler.copy(temp, dest);
		} 
		catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		Reporter.log("Test script is skipped", true);
	}
}
