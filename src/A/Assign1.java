package A;

import java.util.LinkedHashMap;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assign1 {

	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		LinkedHashMap<String, Integer>map= new LinkedHashMap<String, Integer>();
		map.put("pc", 2);
		map.put("projector", 4);
		map.put("chair", 130);
		map.put("pc", 4);
		
       System.out.println(map.get("pc"));
       System.out.println(map);
       
       System.out.println(map.entrySet());
       System.out.println(map.keySet());
       System.out.println(map.containsKey("projector"));
       
       

}
}
