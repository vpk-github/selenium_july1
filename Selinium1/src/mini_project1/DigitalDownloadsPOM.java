package mini_project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DigitalDownloadsPOM {

	@FindBy(partialLinkText = "Digital downloads")
	private WebElement digitialDownloads;
	
	public DigitalDownloadsPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getDigitialDownloads() {
		return digitialDownloads;
	}

	
}
