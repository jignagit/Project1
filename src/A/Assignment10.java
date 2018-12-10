
package A;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment10 {

	//10) select and deselect all hte the options in reverse order
	static

	{
	System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");	
	}
	public static void main(String[] args) {
		WebDriver driver= new ChromeDriver();
		driver.get("file:///C:/Users/bani/Desktop/listboxhas.html");
		WebElement listbox = driver.findElement(By.id("SLV"));
		Select select=new Select(listbox);
		List<WebElement> alloption = select.getOptions();
		System.out.println(alloption.size());
		for(int i=alloption.size()-1;i>=0;i--)
		{
			select.selectByIndex(i);
		}
	
	for(int i=alloption.size()-1;i>=0;i--)
	{
		select.deselectByIndex(i);
	}
	}
}


