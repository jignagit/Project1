package fb;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FBhomepage {
	private WebElement droplist;

	public FBhomepage(WebDriver driver) {
		 droplist = driver.findElement(By.id("pageLoginAnchor"));
		
		
	}
	
	public void dropList()
	{
	droplist.click();
	}

}
