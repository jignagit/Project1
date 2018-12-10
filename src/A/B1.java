package A;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B1 {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.naukri.com");
		//driver.manage().deleteAllCookies();
		//driver.manage().window().maximize();
		Set<String> v = driver.getWindowHandles();
		System.out.println(v);
		System.out.println(v.size());
	

}
}
