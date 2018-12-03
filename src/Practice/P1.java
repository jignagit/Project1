package Practice;

import org.openqa.selenium.chrome.ChromeDriver;

public class P1 {

	public static void main(String[] args) {
		String Key="webdriver.chrome.driver";
		String Value="C:\\Users\\bani\\Desktop\\BTM\\Project1\\driver\\chromedriver.exe";
		System.setProperty(Key, Value);
		ChromeDriver driver=new ChromeDriver();
		}
}
