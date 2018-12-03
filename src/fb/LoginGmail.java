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

public class LoginGmail {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException, InterruptedException {
		WebDriver driver= new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.gmail.com");
		driver.findElement(By.id("identifierId")).sendKeys("jignaparmar2910@gmail.com");
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		//Thread.sleep(2000);
		//driver.findElement(By.xpath("//input[@type='password']")).sendKeys("jigna@123");
		WebDriverWait wait=new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='password']"))).sendKeys("jigna@123");
		
		
		r.keyPress(KeyEvent.VK_ENTER);
		//Thread.sleep(3000);
		//driver.findElement(By.className("gb_b gb_eb gb_R")).click();
	}

}
