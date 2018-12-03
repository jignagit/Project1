package A;

import org.openqa.selenium.ie.InternetExplorerDriver;

public class InternetExp {
	static
	{
		System.setProperty("webdriver.ie.driver", "./driver/IEDriverServer.exe");
	}
	public static void main(String[] args) {
	InternetExplorerDriver driver= new InternetExplorerDriver();
	driver.close();
	}

	
}
