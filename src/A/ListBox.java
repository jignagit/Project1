package A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		//1. open the brwoser
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.facebook.com");
		
	
}
}
