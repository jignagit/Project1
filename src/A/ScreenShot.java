package A;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScreenShot {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		WebDriver c=new ChromeDriver();
		c.get("http://www.google.com");
		TakesScreenshot t=(TakesScreenshot)c;
		File SrcFile = t.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./photo/b.png");
		FileUtils.copyFile(SrcFile, destFile);
		c.close();
		
	
	}	

}
