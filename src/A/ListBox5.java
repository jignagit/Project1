package A;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;



public class ListBox5 {

	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		 WebElement listbox = driver.findElement(By.id("month"));
		 Select select =new Select(listbox);
		List<WebElement> allOptions = select.getOptions();
		List<String> allText1= new ArrayList<String>();
		
		for (WebElement option: allOptions) {
			
		}
		
	}
}
