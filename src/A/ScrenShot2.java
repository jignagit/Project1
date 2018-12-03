package A;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrenShot2 {
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		Date d=new Date();
		String v1 = d.toString();
		System.out.println(v1);
		String v2 = v1.replaceAll(":", "-");
		System.out.println(v2);
		WebDriver c=new ChromeDriver();
	
		c.get("http://www.facebook.com");
		TakesScreenshot t=(TakesScreenshot)c;
		File SrcFile = t.getScreenshotAs(OutputType.FILE);
		File destFile=new File("./photo/"+v2+".png");
		FileUtils.copyFile(SrcFile, destFile);
		c.close();
		
	
	}	

	
}
