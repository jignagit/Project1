package A;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Mozilla {

	static
	{ 
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws AWTException, Exception {
		FirefoxDriver driver=new FirefoxDriver();
		//driver.get("http:/www.naukri.com");
		//driver.close();
		driver.get("http:/www.seleniumhq.org/download/");
		driver.findElement(By.xpath("//td[text()='Java']/../td[4]/a")).click();
		Thread.sleep(1000);
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		Thread.sleep(1000);
		
		r.keyPress(KeyEvent.VK_ENTER);
		
		
		
	}
	
}
