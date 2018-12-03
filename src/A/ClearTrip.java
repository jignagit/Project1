package A;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ClearTrip {

	static
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		
	}
	public static void main(String[] args) {
		ChromeOptions option=new ChromeOptions();
		option.addArguments("--disable-notifications");
		WebDriver driver=new ChromeDriver(option);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		//driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get("http://www.cleartrip.com");
		driver.findElement(By.id("FromTag")).sendKeys("bangalore");
		//driver.findElement(By.xpath("//a[@id='ui-id-24']")).click();
		driver.findElement(By.xpath("//a[contains(text(),'Kempegowda ')]")).click();
		driver.findElement(By.xpath("//input[@id='ToTag']")).sendKeys("goa");
		driver.findElement(By.partialLinkText("Goa")).click();
		driver.findElement(By.xpath("//a[text()='10']")).click();
		//driver.findElement(By.xpath("input[id='SearchBtn']")).click();
		driver.findElement(By.id("SearchBtn")).click();
		//driver.findElement(By.className("booking large")).click();
		List<WebElement> price = driver.findElements(By.id("BaggageBundlingTemplate"));
		for (WebElement w : price) {
			
			String t = w.getText().substring(1).replaceAll(",", "");
			int r = Integer.parseInt(t);
			System.out.println(r);
		}
		
		
	}

}
