package testme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class google {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		d.findElement(By.name("q")).sendKeys("accenture");
		WebDriverWait wait= new WebDriverWait(d,20);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("btnK"))).click();
	

	}

}
