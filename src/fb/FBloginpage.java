package fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FBloginpage {
	private WebElement untb;
	private WebElement passwd;
	private WebElement loginbtn;
	private WebElement droplist;

	public FBloginpage(WebDriver driver) {
		untb=driver.findElement(By.id("email"));
		passwd=driver.findElement(By.name("pass"));
		loginbtn=driver.findElement(By.xpath("//input[@value='Log In']"));
		
		
	}
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
	


