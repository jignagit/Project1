package A;

import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment7 {
	//7)print all the option present in listbox with out repeating the option

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/bani/Desktop/listboxhas.html");
		WebElement listbox = driver.findElement(By.id("SLV"));
		Select select=new Select(listbox);
		List<WebElement> alloptions = select.getOptions();
		LinkedHashMap<String, Integer> map=new LinkedHashMap<String, Integer>();
		for (WebElement option : alloptions) {
			String Key = option.getText();
			//Integer value=1;
			//map.putAll(Key);
			if(map.containsKey(Key)) {
				Integer value=map.get(Key);
				value++;
				map.put(Key, value);
			}
				else
				{
					map.put(Key,1);
				}
			}
		System.out.println(map.keySet());
		}
		//System.out.println(map.keySet());
		
		
		
		

}
