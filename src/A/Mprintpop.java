package A;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mprintpop {
	static
	{ 
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws AWTException, Exception {
		//open the browser
		WebDriver driver=new FirefoxDriver();

		driver.get("http:/www.google.com");

		
		//press the cntrol+p
		Robot r=new Robot();

		r.keyPress(KeyEvent.VK_CONTROL);

		r.keyPress(KeyEvent.VK_P);
		r.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		//press Esc to cancel the popup
		r.keyPress(KeyEvent.VK_ESCAPE);



	}

}
