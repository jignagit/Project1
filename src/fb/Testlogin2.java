package fb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testlogin2 {

	
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		Loginpage2 login =new Loginpage2(driver);
		login.setUserName("abc");
		login.setPassword("xyz");
		Thread.sleep(1000);
		login.clickLogin();
		Thread.sleep(1000);
		login.setUserName("admin");
		login.setPassword("manager");
		login.clickLogin();
	}
	}

