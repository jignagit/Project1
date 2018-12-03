package A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hiddenp2
{

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver c=new ChromeDriver();
		
		c.get("http://www.flipkart.com");
		c.findElement(By.xpath("(//input[@type='text'])[2]")).sendKeys("jigna");
		Thread.sleep(2000);
     c.findElement(By.xpath("(//button)[2]")).click();;
	}

}
