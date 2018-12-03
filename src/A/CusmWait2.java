package A;

import org.apache.commons.exec.ExecuteException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CusmWait2 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver c=new ChromeDriver();

		c.get("http://demo.actitime.com/login.do");
		c.findElement(By.id("username")).sendKeys("admin");
		c.findElement(By.name("pwd")).sendKeys("manager");
		c.findElement(By.xpath("//div[text()='Login ']")).click();
		while(true)
		{
			try
			{
				c.findElement(By.id("logoutLink")).click();
				System.out.println("logout link is present");
				break;
			}
			catch(Exception e)
			{
				System.out.println("logout link is not present");
			}
		}
		c.close();
	}


}




