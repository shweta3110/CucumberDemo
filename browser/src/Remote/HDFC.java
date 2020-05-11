package Remote;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class HDFC {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://netbanking.hdfcbank.com/netbanking/");
		d.switchTo().frame(d.findElement(By.name("login_page")));
		d.findElement(By.name("fldLoginUserId")).sendKeys("qwert123");
		 String title=d.getTitle();
		 System.out.println(title);
		
		d.switchTo().defaultContent();
		d.switchTo().frame(d.findElement(By.name("footer")));
		d.findElement(By.linkText("Privacy Policy")).click();
		for(String handle:d.getWindowHandles())
		{
			d.switchTo().window(handle);
		}
		d.findElement(By.linkText("Security"));
		
	
		
		
  }
  
}
