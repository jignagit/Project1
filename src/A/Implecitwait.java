package A;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Implecitwait {
	static
	{

	System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
}

public static void main(String[] args) throws InterruptedException {
	//1. open the brwoser
	WebDriver c=new ChromeDriver();
	c.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	c.get("http://demo.actitime.com/login.do");
	c.findElement(By.id("username")).sendKeys("admin");
	c.findElement(By.name("pwd")).sendKeys("manager");
	c.findElement(By.xpath("//div[text()='Login ']")).click();
	Thread.sleep(5000);
	c.findElement(By.id("logoutLink")).click();
	c.close();
}

	

}
