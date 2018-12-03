package A;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		WebElement listbox = driver.findElement(By.id("day"));
		Select select=new Select(listbox);
		List<WebElement> alloptions = select.getOptions();
		for(int i=1;i<alloptions.size();i++)
		{
			WebElement option = alloptions.get(i);
			String text = option.getText();
			System.out.println(text);
			
		}
		System.out.println(alloptions.size());
	}

}
