package A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Eloginpage {
	//declaration
	private WebElement untb;
	private WebElement passwd;
	private WebElement loginbtn;

	public Eloginpage(WebDriver driver) {
		
		//intilization
		untb=driver.findElement(By.id("username"));
		passwd=driver.findElement(By.name("pwd"));
		loginbtn=driver.findElement(By.xpath("//div[text()='Login ']"));
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


