import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CalnderPop {

	
static
{
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\bani\\Desktop\\BTM\\Project1\\driver\\chromedriver.exe");
	
	}
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://retail.starhealth.in/renewal");
	driver.findElement(By.id("nqame2")).sendKeys("1234");
}
}
