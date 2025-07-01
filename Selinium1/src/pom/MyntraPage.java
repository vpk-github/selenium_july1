package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyntraPage {

	@FindBy(xpath="//input[contains(@placeholder,'Search for products')]")
	private WebElement searchTextField;
	
	public MyntraPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getSearchTextField() {
		return searchTextField;
	}
	
}
