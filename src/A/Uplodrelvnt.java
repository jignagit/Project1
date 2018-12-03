package A;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Uplodrelvnt {


	
		static 
		{
			System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
		}

		public static void main(String[] args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			driver.get("http:/www.naukri.com");
			driver.findElement(By.xpath("//span[text()='Later']")).click();
			File f=new File("./cv/CV_Jashoda.docx");
			//relevent path convert into absolute path
			String path = f.getAbsolutePath();
			//Thread.sleep(3000);
			//driver.findElement(By.xpath("//span[text()='Later']")).click();
			driver.findElement(By.id("input_resumeParser")).sendKeys(path);
			
			//driver.findElement(By.id("input_resumeParser")).sendKeys("D:/CV_jashoda.docx");
			 String msg = driver.findElement(By.className("success")).getText();
			System.out.println(msg);
		}

	}



