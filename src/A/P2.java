package A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class P2 {
	//declaration
	private  WebElement untb;
	private  WebElement pwtb;
	private  WebElement loginbtn;
	//intializaation

	P2(WebDriver driver)
	{
		untb=driver.findElement(By.id("username"));
		pwtb=driver.findElement(By.name("pwd"));
		loginbtn=driver.findElement(By.xpath("//div[text()='Login ']"));
	}
	//utilization
	public void setUserName(String un)
	{
		untb.sendKeys(un);
	}
	public void setPassword(String pw)
	{
		pwtb.sendKeys(pw);
	}
	public void setLoginbtn()
	{
		loginbtn.click();
	}
}
