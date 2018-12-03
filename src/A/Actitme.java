package A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Actitme {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		//1. open the brwoser
		
		WebDriver c=new ChromeDriver();
		c.get("http://demo.actitime.com/login.do");
		String expectedTitle = "actiTIME - Login";
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
		//check point 2-verify elements are present or not

		WebElement username=c.findElement(By.id("username"));
		//username=c.findElement(By.id("username"));
		//c.i
		if(username.isDisplayed())
		{
			System.out.println("pass:userfield is displayed");
		}
		else
		{
			System.out.println("fail:userfield is not displayed");
		}
		WebElement password=c.findElement(By.name("pwd"));
		if(password.isDisplayed())
		{
			System.out.println("pass:password is displayed");
		}
		else
		{
			System.out.println("fail:password is not displaye");
		}
		c.findElement(By.id("username")).sendKeys("admin");
		c.findElement(By.id("pwd")).sendKeys("manager");
		c.findElement(By.xpath("//div[text()='Login ']")).click();;
		Thread.sleep(1000);
		String expTitle = "actiTIME-Enter Time-Track";
		//System.out.println("expTitle"+expTitle);
		String actTitle = c.getTitle();
		//System.out.println("actTitle"+actTitle);
		if(expTitle.equals(actTitle))
		{

			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}

	}
}
