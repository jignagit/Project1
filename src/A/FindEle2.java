package A;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindEle2 {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//1. open the brwoser
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://www.google.com");
		driver.findElement(By.id("lst-ib")).sendKeys("java");
		String xp = "//div[contains(text(),'java')]";
	   List<WebElement> allAS = driver.findElements(By.xpath(xp));
	   Thread.sleep(1000);
		System.out.println(allAS.size());
		for(WebElement e:allAS)
		{
			System.out.println(e.getText());
		}
		allAS.get(0).click();
}
}
