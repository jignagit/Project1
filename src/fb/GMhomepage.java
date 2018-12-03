package fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GMhomepage {
	//@FindBy(className="gb_b gb_eb gb_R")
	//private WebElement logout;
	@FindBy(xpath="//a[@class='gb_b gb_eb gb_R']")
		private WebElement logout;

	public GMhomepage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	public void logoutLink()
	{
		logout.click();
	}


}
