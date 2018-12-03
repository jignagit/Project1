import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Facebook {
	private WebElement untb;

	public Facebook(WebDriver driver) {
		untb=driver.findElement(By.id("email"));
		
	}
	public void setUserName(String un)
	{
		untb.sendKeys(un);
	}

}
