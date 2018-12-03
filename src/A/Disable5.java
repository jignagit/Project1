package A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disable5 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/bani/Desktop/Page1.html");
		//using index
		driver.switchTo().frame(0);
		//child frame
		driver.findElement(By.id("t2")).sendKeys("A1");
		driver.switchTo().parentFrame();
		//parent frame
		driver.findElement(By.id("t1")).sendKeys("A2");
		//using the id
		driver.switchTo().frame("f1");
		driver.findElement(By.id("t2")).sendKeys("b1");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("b2");
		//using the address
		//WebElement e = driver.findElement(By.tagName("iframe"));//using tagname
		WebElement e = driver.findElement(By.id("f1"));//using id
		driver.switchTo().frame(e);
		driver.findElement(By.id("t2")).sendKeys("c1");
		driver.switchTo().defaultContent();
		driver.findElement(By.id("t1")).sendKeys("c2");
		


	
}
}
