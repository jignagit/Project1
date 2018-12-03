package A;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Popup {

	static
	{ 
		System.setProperty("webdriver.gecko.driver", "./driver/geckodriver.exe");
	}
	public static void main(String[] args) throws AWTException, Exception {
		//open the browser
		WebDriver driver=new FirefoxDriver();
        driver.get("http://www.yatra.com");
        Robot r= new Robot();

}
}
