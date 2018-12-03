package A;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gprint {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws AWTException, Exception {
		//open the browser
		WebDriver driver=new ChromeDriver();

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
