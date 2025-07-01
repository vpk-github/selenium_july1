package mini_project1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ApparelShoesPOM {

	@FindBy(partialLinkText = "Apparel & Shoes")
	private WebElement apparelShoes;
	
	public ApparelShoesPOM(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	public WebElement getApparelShoes() {
		return apparelShoes;
	}
	
}
