package A;

import java.io.File;
import java.io.IOException;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrenShot3 {
	private static final String Output = null;
	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws IOException {
		Date d=new Date();
		String v1 = d.toString();
		String v2 = v1.replaceAll(":", "-");
		WebDriver driver=new ChromeDriver();
		driver.get("http://localhost/login.do");
		TakesScreenshot t=(TakesScreenshot)driver;
		File srcfile = t.getScreenshotAs(OutputType.FILE);
		File dscfile=new File("./photo/"+v2+".png");
		FileUtils.copyFile(srcfile, dscfile);
		driver.close();
		
		

}
}
