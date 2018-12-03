package A;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaSrpt {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		
		JavascriptExecutor j=(JavascriptExecutor)driver;
		//j.executeScript("alert('Hi')");
		String msg="Happy Festivals";
		j.executeScript("alert('"+msg+"')");
		//System.out.println("The'"+msg+"'");
		for(int i=1;i<=10;i++)
		{
			j.executeScript("window.scrollBy(0,500)");
			//it will move to 500 margin to up
			Thread.sleep(500);
		}
		for(int i=1;i<=10;i++)
			
		{
			//it will move to 500 margin to down
			//and 0 is present left or right scrollbar.here not presenet right scrollbar 
			//so we gave 0 argument.
			j.executeScript("window.scrollBy(0,-500)");
			Thread.sleep(500);
		}


}
}
