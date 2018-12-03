package A;

import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment8 {
	//8)print only unique options present in list box

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/bani/Desktop/listboxhas.html");
		WebElement listbox = driver.findElement(By.id("SLV"));
		Select select=new Select(listbox);
		List<WebElement> alloptions = select.getOptions();
		LinkedHashMap<String, Integer> map= new LinkedHashMap<String, Integer> ();
		for (WebElement option: alloptions) {
			String key = option.getText();
			if(map.containsKey(key))
			{
				Integer value = map.get(key);
				value++;
				map.put(key, value);
			}
			else
			{
				map.put(key, 1);
			}
			
		}
		System.out.println(map.keySet());
		for(String key:map.keySet())
		{
			if(map.get(key)==1)
			{
				System.out.println(key);
			}
			
		}

	}

}
