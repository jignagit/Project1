package fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginpage1 {

	
	private WebElement untb;
	private WebElement passwd;
	private WebElement loginbtn;

	public Loginpage1(WebDriver driver) {
		untb=driver.findElement(By.id("username"));
		passwd=driver.findElement(By.name("pwd"));
		loginbtn=driver.findElement(By.xpath("//div[.='Login ']"));
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
