package A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locator1 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
		
		public static void main(String[] args) {
			WebDriver c=new ChromeDriver();
			c.get("file:///C:/Users/bani/Desktop/Demo.html");
			//WebElement e=c.findElement(By.tagName("a1"));
			c.findElement(By.tagName("a")).click();
			//e.click();
			//WebElement e=c.findElement(By.id("a1"));
			//c.findElement(By.tagName("b")).click();
			//e.click();
		}
			
		
		//in the browser find the element by using tag name and click it.
		//
	}
		
	


