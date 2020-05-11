package RemoteLearningBatch;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ChooseDriver {
	public static WebDriver Use(String browser)
	{
		if(browser.equalsIgnoreCase("c"))
		{
			return new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("f"))
		{
			return new FirefoxDriver();
		
		}
		else
		{
			System.out.println("Invalid browser");
			return null;
		}
	}

}
