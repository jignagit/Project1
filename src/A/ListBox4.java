package A;


import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ListBox4 {


	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		List<String> a= new ArrayList<String>();
		a.add("a");
		a.add("c");
		a.add("b");

		System.out.println(a);
		List<String> b= new ArrayList<String>();
		
	}
}
