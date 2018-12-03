package A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gamil1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		//1. open the brwoser
		WebDriver c=new ChromeDriver();
		c.get("http://www.Gmail.com");
		/*String expectedTitle = "Gmail";
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
		
	//WebElement username=c.findElement(By.id("yDmH0d"));
	//username.sendKeys("jigna");
	//username=c.findElement(By.id("username"));
	//c.i
	//if(username.isDisplayed())
	//{
		//System.out.println("pass");
	//}
	//else
	//{
		//System.out.println("fail");*/
		//}
		c.findElement(By.xpath("//input[@type='email']")).sendKeys("jignaparmar2910");
		Thread.sleep(1000);
		c.findElement(By.xpath("//span[text()='Next']")).click();
		Thread.sleep(1000);
		c.findElement(By.name("password")).sendKeys("jigna@123");
		Thread.sleep(1000);
		c.findElement(By.className("CwaK9")).click();
}
}

