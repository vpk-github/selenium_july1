package mini_project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GiftCrdsPOM {

	@FindBy(partialLinkText = "Gift Cards")
	private WebElement giftCrds;
	
	public GiftCrdsPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getGiftCrds() {
		return giftCrds;
	}	

}
