package A;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Trivago {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//1. open the brwoser
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.trivago.in");
		//driver.findElement(By.id("horus-querytext")).sendKeys("banglore");
         driver.findElement(By.id("horus-querytext")).sendKeys("b");
         Thread.sleep(2000);
       // driver.findElement(By.xpath("(//span[@class='ssg-title'])[4]")).click();
        // driver.findElement(By.xpath("(//span[@class='btn-horus__type']")).click();
        // driver.findElement(By.xpath("(//span[@class='ssg-title'])[1]")).click();
        String xp = "//span[@class='ssg-title']";
         List<WebElement> allL = driver.findElements(By.xpath(xp));
        Thread.sleep(1000);
		System.out.println(allL.size());
		for(WebElement e:allL)
		{
			System.out.println(e.getText());
		}
		allL.get(0).click();
		// driver.findElement(By.xpath("(//span[@class='ssg-title'])[1]")).click();
      
	
}
}
