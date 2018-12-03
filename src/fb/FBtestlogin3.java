package fb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FBtestlogin3 {

	
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver= new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		FBloginpage3 login=new FBloginpage3(driver);
		//invalid user name and password
		login.setUserName("abc");
		login.setPassword("xyz");
		login.clickLogin();
		driver.navigate().refresh();
		
		//valid user name and password
		login.setUserName("vaghheart@yahoo.com");
		login.setPassword("hardy@12345");
		login.clickLogin();
}
}
