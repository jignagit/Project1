package fb;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import A.Eloginpage;

public class FBtestlogin {

	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		ChromeOptions opt=new ChromeOptions();
		opt.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(opt);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com");
		FBloginpage login =new FBloginpage(driver);
		login.setUserName("vaghheart@yahoo.com");
		login.setPassword("hardy@12345");
		login.clickLogin();
		
		FBhomepage dc=new FBhomepage(driver);
		dc.dropList();
		FBlogout lo= new FBlogout(driver);
		lo.logoutLink();
		
	}
}
