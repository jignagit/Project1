package fb;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Gmailtest {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver=new ChromeDriver();
		Robot r=new Robot();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		Gmaillogin login=new Gmaillogin(driver);
		login.setUserName("jignaparmar2910@gmail.com");
		r.keyPress(KeyEvent.VK_ENTER);
		Thread.sleep(3000);
		
		login.setPassword("jigna@123");
		r.keyPress(KeyEvent.VK_ENTER);
		GMhomepage gm=new GMhomepage(driver);
		gm.logoutLink();
		
	}
}