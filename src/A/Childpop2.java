package A;

import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Childpop2 {

	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		 driver.get("http://www.naukri.com");
		String parent = driver.getWindowHandle();
		Set<String> allWHS = driver.getWindowHandles();
		allWHS.remove(parent);
		for (String wh:allWHS)
			driver.switchTo().window(wh).close();
		//System.out.println(v.size());
	//System.out.println();
	}
}
