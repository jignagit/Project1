package A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomWait {
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
		for(int i=1;i<=100;i++)
		{
			String title = c.getTitle();
			if(title.contains("Enter"))
			{
				System.out.println(title);
				break;
			}
			else
			{
				System.out.println("still in login page:iteration:"+i);
			}
		}
		c.close();


	}
}
