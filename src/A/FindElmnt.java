package A;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElmnt {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//1. open the brwoser
		
		WebDriver driver=new ChromeDriver();
		driver.get("file:///C:/Users/bani/Desktop/Demo3.html");
		List<WebElement> allLinks = driver.findElements(By.xpath("//a"));
		int count = allLinks.size();
		for(int i=0;i<=count;i++)
		{
			WebElement link = allLinks.get(i);
			String text = link.getText();
			String url = link.getAttribute("href");
			System.out.println(text+"-->"+url);
		}
		}
}
