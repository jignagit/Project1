package A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class DisabledElement3 {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.get("https://jqueryui.com/droppable/");
		//without frame we will get InvalidElementStateException
		WebElement s = driver.findElement(By.id("droppable"));
		WebElement t = driver.findElement(By.id("draggable"));
		Actions action=new Actions(driver);
		action.dragAndDrop(s, t).perform();
		

}
}
