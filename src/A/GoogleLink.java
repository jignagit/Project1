package A;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleLink {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver c=new ChromeDriver();
		c.get("file:///C:/Users/bani/Desktop/Demo.html");
		c.findElement(By.xpath("./html/body/a")).click();
		
		
		
	}
		

	
	}


