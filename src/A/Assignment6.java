package A;

import java.util.LinkedHashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment6 {
	//6) check  if given option is duplicate in listbox

	static {
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/bani/Desktop/listboxhas.html");
		WebElement listbox = driver.findElement(By.id("SLV"));
		Select select=new Select(listbox);
		List<WebElement> alloption = select.getOptions();
		
		LinkedHashMap<String, Integer> map=new LinkedHashMap<String, Integer>();
		for (WebElement option : alloption) {
			String Key = option.getText();
			if(map.containsKey(Key))
			{
				Integer value = map.get(Key);//here it will give key of value(1,2 like that)
				value++;
				map.put(Key, value);
			}
			else
			{
				map.put(Key, 1);
			}
			
		}
		String s="Idly";
		if(map.get(s)>1)
		{
		System.out.println(s+"is duplicate value");	
		}
		else
		{
			System.out.println(s+"is not duplicate value");
		}
	} 

}
