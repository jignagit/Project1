package A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Acti11 {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		//open the browser
		WebDriver driver=new ChromeDriver();
		// enter the url
		driver.get("https://www.actitime.com/");
		//find the menu
		WebElement menu = driver.findElement(By.linkText("Features"));
		//mouse Hover on the menu
		Actions actions=new Actions(driver);
		
		actions.moveToElement(menu).perform();
		//select 1st sub menu
		driver.findElement(By.linkText("Simple Time Tracking")).click();
		
	}
}