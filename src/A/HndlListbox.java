package A;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HndlListbox {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/bani/Desktop/handlinglistbox.html");
		WebElement listbox = driver.findElement(By.id("SLV"));
		Select select=new Select(listbox);
		select.selectByIndex(0);
		select.selectByValue("v");
		select.selectByVisibleText("Dosa");
		List<WebElement> a = select.getAllSelectedOptions();
		System.out.println(a.size());
		WebElement b = select.getFirstSelectedOption();
		System.out.println(b.getText());
		List<WebElement> c = select.getOptions();
		System.out.println(c.size());
		if(select.isMultiple())
		{
			System.out.println("yes... we can desect");
			select.deselectByIndex(0);
			select.deselectByValue("v");
			select.deselectByVisibleText("Dosa");
			select.deselectAll();
		}
		else
		{
			System.out.println("sorry... we can not use  deselect on single list box");
		}
	}

}
