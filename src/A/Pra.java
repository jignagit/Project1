package A;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
   
	


public class Pra {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		

System.setProperty("webdriver.chrome.driver","C:/Users/bani/Desktop/BTM/Project1/driver/chromedriver.exe");
WebDriver c=new ChromeDriver();
c.get("http://www.google.com/intl/en-GB/drive/");
	}

	

}
