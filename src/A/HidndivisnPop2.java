package A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HidndivisnPop2 {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		// open the browser
		WebDriver c=new ChromeDriver();
		// enter the url
		c.get("http://retail.starhealth.in/renewal");
		// enter the policy number
		c.findElement(By.id("nqame2")).sendKeys("P123");
		// click DOB
		c.findElement(By.id("dtDOB")).click();
		//select a  date
		//c.findElement(By.linkText("15")).click();
		//select current date date
		c.findElement(By.cssSelector("li.currentdate>a")).click();
		// click submit
		c.findElement(By.id("proceed")).click();
	}

}
