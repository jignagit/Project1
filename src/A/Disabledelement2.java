package A;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Disabledelement2 {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:Users/bani/Desktop/Demo5.html");
		String code = "document.getElementById('t1').value='abc';";
		JavascriptExecutor j=(JavascriptExecutor)driver;
		j.executeScript(code);
	}
}
