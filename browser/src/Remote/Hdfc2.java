package Remote;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Hdfc2 {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://www.hdfcbank.com/");
		//d.switchTo().frame(d.findElement(By.name("login_page")));
		//d.findElement(By.name("fldLoginUserId")).sendKeys("444378");
		 String title=d.getTitle();
		 System.out.println(title);
		d.switchTo().frame(d.findElement(By.name("footer")));
		d.findElement(By.linkText("Privacy Policy")).click();
		 Set<String>allWindows=d.getWindowHandles();
		 ArrayList<String> tab=new ArrayList<String> (allWindows);
		 d.switchTo().window(tab.get(1));
		 
		//String title=d.getTitle();
		//System.out.println("title");
		
		
		
  }
  
}
