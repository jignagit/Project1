package A;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment4 {
	//4) check if conent of listbox sorted oder or not

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
public static void main(String[] args) {
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com");
	WebElement listbox = driver.findElement(By.id("month"));
	Select select=new Select(listbox);
	List<WebElement> alloptions = select.getOptions();
	ArrayList<String> all=new ArrayList<String>();
	for (WebElement a : alloptions) {
		all.add(a.getText());
		//System.out.println(all);
		
	}
	System.out.println(all);
	ArrayList<String> sort=new ArrayList<String>(all);
	Collections.sort(sort);
	System.out.println(sort);
	if(sort.equals(all))
	{
	System.out.println("list is sorted");	
	}
	else
	{
		System.out.println("list is not sorted");
	}
	
	
	
	
}
}
