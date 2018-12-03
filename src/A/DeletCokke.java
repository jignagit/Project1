package A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeletCokke {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver c=new ChromeDriver();
		c.manage().deleteAllCookies();
		c.manage().window().maximize();
		
	


}


}
