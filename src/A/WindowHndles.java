package A;

import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHndles {
	static
	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://www.naukri.com");
		 Set<String> v = driver.getWindowHandles();
		System.out.println(v.size());
		System.out.println(v);
		
	}
	

}
