package A;

import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Hashmap {

	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		LinkedHashMap<String, String>map= new LinkedHashMap<String, String>();
		map.put("city", "banglore");
		map.put("city", "bang");
System.out.println(map.get("city"));
System.out.println(map);
}
}
