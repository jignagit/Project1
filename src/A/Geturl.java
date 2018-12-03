package A;

import org.openqa.selenium.chrome.ChromeDriver;

public class Geturl {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		ChromeDriver c=new ChromeDriver();
		c.get("http://www.naukri.com");
		//String v = c.getPageSource();
		//System.out.println(v);
		//String url = c.getCurrentUrl();
		//System.out.println(url);
		//c.quit();
	


}

}
