package Remote;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class SwitchFrame {
	@Test
	public void f() {

		// System.setProperty("webdriver.chrome.driver","C:\\Users:\\Sakshi\\Dekstop\\GFT
		// Selinium Training\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.get("https://netbanking.hdfcbank.com/netbanking/");
		d.switchTo().frame(d.findElement(By.name("login_page")));
		d.findElement(By.name("fldLoginUserId")).sendKeys("Helloqw123");
		d.switchTo().defaultContent();
		d.switchTo().frame(d.findElement(By.name("footer")));
		d.findElement(By.linkText("Privacy Policy")).click();
		Set<String> alltabs = d.getWindowHandles();//adress store of all windows in alltabs in string format
		for (String handle : alltabs) {//Switching Windows 
			d.switchTo().window(handle);
		}
		d.findElement(By.linkText("Security")).click();
	 

	}
}
