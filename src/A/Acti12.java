package A;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acti12 {

	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com");
		WebElement link = driver.findElement(By.linkText("actiTIME Inc."));
		//CTRL+click(its  an example for composite action>multiple actions at a time)
		Actions actions = new Actions(driver);
		actions.sendKeys(Keys.CONTROL).click(link).perform();
		Thread.sleep(1000);
		// in this example getwindowhandles return windowhandle of all the TABs
		Set<String> allWHS = driver.getWindowHandles();
		System.out.println(allWHS.size());// to count all the tabs
		for (String wh : allWHS) {
			driver.switchTo().window(wh);//switch to tab
			System.out.println(driver.getTitle());
			
		}
		driver.close();//close only current tab
		driver.quit();//close all the tabs
}
}
