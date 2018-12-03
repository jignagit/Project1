package A;

import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlipkartPrice {

	static
	{
		System.setProperty("webdriver.chrome.driver","./driver/chromedriver.exe");
	}
	public static void main(String[] args) throws InterruptedException {
		//1. open the brwose
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.flipkart.com");

		driver.findElement(By.xpath("(//button)[2]")).click();

		driver.findElement(By.name("q")).sendKeys("iphone x");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//span[text()='iphone x mobile']/../..")).click();
		Thread.sleep(1000);
		String xp = "//div[starts-with(text(),'Apple iPhone')]/../../div[2]/div[1]/div[1]/div[1]";
		List<WebElement> allP = driver.findElements(By.xpath(xp));
		System.out.println(allP.size());
		TreeSet<Integer> t=new TreeSet<Integer>();
		System.out.println("all prices");




		for(WebElement p:allP) {
			String strprice = p.getText().substring(1).replaceAll(",","");
			System.out.println(strprice);
			int v = Integer.parseInt(strprice);
			t.add(v);


		}
		System.out.println(t.first());
		System.out.println(t.last());
	}


}
