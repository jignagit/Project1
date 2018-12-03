package A;

import org.openqa.selenium.chrome.ChromeDriver;

public class OpenBrser {
	public static void main(String[] args) {

		String key="webdriver.chrome.driver";
		String value="C:\\Users\\bani\\Desktop\\BTM\\Project1\\driver\\chromedriver.exe";
		System.setProperty(key, value);
		ChromeDriver c=new ChromeDriver();
		c.close();
		
	}


}
