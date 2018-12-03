package A;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acti13 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		// enter the url
		driver.get("https://www.actitime.com/");
	WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
	Actions actions = new Actions(driver);
	actions.contextClick(link).perform();//we get contex menu
	Robot r=new Robot();
	r.keyPress(KeyEvent.VK_T);//t-> new tap and w->new window
	
}
}