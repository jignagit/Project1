package A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmail2 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		//1. open the brwoser
		WebDriver c=new ChromeDriver();
		
		c.get("http://www.Gmail.com");
		c.findElement(By.id("username")).sendKeys("admin");
		c.findElement(By.name("pwd")).sendKeys("manager");
		c.findElement(By.xpath("//div[text()='Login ']")).click();;
		c.findElement(By.id("Email")).sendKeys("yDmH0d");
		
	}


	
}
