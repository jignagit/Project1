package A;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandl2 {
	static{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) {
		WebDriver wd=new ChromeDriver();
		wd.get("http://www.google.com");
		Set<String> v = wd.getWindowHandles();
		System.out.println(v.size());
		System.out.println(v);
		
		
	}
	

}
