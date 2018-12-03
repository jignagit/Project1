package A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook2 {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//1. open the brwoser
		
		WebDriver c=new ChromeDriver();
		c.get("http://www.facebook.com/login");
		String expectedTitle = "Log in to Facebook | Facebook";
		System.out.println("expected:"+expectedTitle);
		String actualTitle = c.getTitle();
		System.out.println("actual:"+actualTitle);
		if(actualTitle.equals(expectedTitle))
		{
			System.out.println("pass: title is matching");
		}
		else
		{
			System.out.println("fail: title is not matching");
		}
		WebElement username=c.findElement(By.id("email"));
		
		if(username.isDisplayed())
		{
			System.out.println("pass:userfield is displayed");
		}
		else
		{
			System.out.println("fail:userfield is not displayed");
		}
WebElement password=c.findElement(By.id("pass"));
		
		if(password.isDisplayed())
		{
			System.out.println("pass:passwordfield is displayed");
		}
		else
		{
			System.out.println("fail:passwordfield is not displayed");
		}
WebElement login=c.findElement(By.id("loginbutton"));
		
		if(login.isDisplayed())
		{
			System.out.println("pass:login button is  is displayed");
		}
		else
		{
			System.out.println("fail:loginbutton is not displayed");
		}

}
}



