package A;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pythonfindelnt {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("python");
		//String xp = "//div[contains(text(),'python')]";
	//	List<WebElement> alle = driver.findElements(By.xpath(xp));
		List<WebElement> alle = driver.findElements(By.xpath("//div[contains(text(),'python')]"));
		for (WebElement ele : alle) {
			//String b = ele.getText();
			//System.out.println(b);
			System.out.println(ele.getText());
			
		}
	}

}
