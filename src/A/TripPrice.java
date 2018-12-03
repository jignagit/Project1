package A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TripPrice {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//1. open the brwoser
		
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.cleartrip.in");
		driver.manage().window().maximize();
	
}
}
