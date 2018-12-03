package fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBloginpage2 {
	@FindBy(id="email")
	private WebElement untb;
	@FindBy(name="pass")
	private WebElement pstb;
	@FindBy(xpath="//input[@value='Log In']")
	private WebElement loginbtn;
	

	public FBloginpage2(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	public void setUserName(String un)
	{
		untb.sendKeys(un);
	}
	public void setPassword(String pw)
	{
		pstb.sendKeys(pw);
	}
	public void clickLogin()
	{
		loginbtn.click();
	}
	

}
