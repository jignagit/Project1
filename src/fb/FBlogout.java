package fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FBlogout {
private WebElement logout;
	public FBlogout(WebDriver driver) {
		logout=driver.findElement(By.xpath("//span[text()='Log Out']/../.."));
	}
	public void logoutLink()
	{
		logout.click();
	}
	
	
	
	

}
