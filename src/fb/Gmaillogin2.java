package fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Gmaillogin2 {
	private WebElement untb;
	
	private WebElement pwtb;

	public Gmaillogin2(WebDriver driver) {
		untb=driver.findElement(By.id("identifierId"));
		
		pwtb=driver.findElement(By.xpath("//input[@type='password']"));

		

	}
	public void setUserName(String un)
	{
		untb.sendKeys(un);
	}
	
	public void setPassword(String pw)
	{
		pwtb.sendKeys(pw);
	}
}
