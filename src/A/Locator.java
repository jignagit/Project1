package A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
		
		public static void main(String[] args)throws InterruptedException {
			WebDriver c=new ChromeDriver();
			c.get("file:///C:/Users/bani/Desktop/Demo1.html");
			//WebElement e=c.findElement(By.tagName("a"));
			c.findElement(By.tagName("a")).click();
			Thread.sleep(1000);
			c.navigate().back();
			c.findElement(By.id("a1")).click();
			Thread.sleep(1000);
			c.navigate().back();
			c.findElement(By.name("n1")).click();
			Thread.sleep(1000);
			c.navigate().back();
			c.findElement(By.className("c1")).click();
			Thread.sleep(1000);
			c.navigate().back();
			c.findElement(By.linkText("Google")).click();
			Thread.sleep(1000);
			c.navigate().back();
			c.findElement(By.partialLinkText("Goo")).click();
			Thread.sleep(1000);
			c.navigate().back();
			c.findElement(By.cssSelector("a[id='a1']")).click();
		
			Thread.sleep(1000);
			c.navigate().back();
		}
			

}
