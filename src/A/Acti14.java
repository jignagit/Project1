package A;

import java.awt.AWTException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Acti14 {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws AWTException {
		//open the browser
		WebDriver driver=new ChromeDriver();
		// enter the url
		driver.get("https://www.dhtmlgoodies.com/submitted-scripts/i-google-like-drag-drop/index.html");
		WebElement source = driver.findElement(By.xpath("//h1[.='Block 1']"));
		WebElement target = driver.findElement(By.xpath("//h1[.='Block 1']"));
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target).perform();
	}
}
