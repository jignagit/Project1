package fb;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FBlogout2 {
	//FBlogout2 class is not need in pom class
	//if we try to using without pom class that we need also FBlogout2
	@FindBy(id="")
	
	private WebElement logout;
	public FBlogout2(WebDriver driver) {

		PageFactory.initElements(driver, this);
	}
	public void logoutLink()
	{
		
	}

}
