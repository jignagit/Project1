package A;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uplodrpth {
	static 
	{
		System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	}
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http:/www.naukri.com");
		//driver.findElement(By.xpath("//span[text()='Later']")).click();
		//absolute path
		//driver.findElement(By.id("input_resumeParser")).sendKeys("D:/CV_jashoda.docx");
	}

}
