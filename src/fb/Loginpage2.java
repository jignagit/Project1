package fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage2 {
	//declaration
	@FindBy(id="username")
	private WebElement untb;
	@FindBy(name="pwd")
	private WebElement passwd;
	@FindBy(xpath="//div[.='Login ']")
	private WebElement loginbtn;
	//intilation

	public Loginpage2(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	//utilization
	public void setUserName(String un)
	{
		untb.sendKeys(un);
	}
	public void setPassword(String pw)
	{
		passwd.sendKeys(pw);
		
	}
	
	public void clickLogin()
	{
		loginbtn.click();
	}
}

	
