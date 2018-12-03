package fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBhomepage2 {
	@FindBy(id="pageLoginAnchor")
	private WebElement droplist;
	
	@FindBy(xpath="//span[text()='Log Out']/../..")
	//@FindBy(xpath="//span[(text(),'Log Out')]")
	private WebElement logout;
	
	public FBhomepage2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	public void dropList()
	{
		droplist.click();
	}
	public void logoutClick()
	{
		logout.click();
	}

}
