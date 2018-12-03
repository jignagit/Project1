package fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Gmaillogin {

	@FindBy(id="identifierId")
	private WebElement untb;
	
	@FindBy(xpath="//input[@type='password']")
	private WebElement pwd;
	
	
	

	public Gmaillogin(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	public void setUserName(String un)
	{
		untb.sendKeys(un);
	}
	
	public void setPassword(String pw)
	{
		pwd.sendKeys(pw);
	}
	

}
