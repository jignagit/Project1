package fb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Gmailtest2 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		Robot r=new Robot();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		Gmaillogin2 login=new Gmaillogin2(driver);
		login.setUserName("jignaparmar2910@gmail.com");
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		login.setPassword("jigna@123");
		r.keyPress(KeyEvent.VK_ENTER);
		
	}

	

}
