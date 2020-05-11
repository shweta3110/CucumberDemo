package Remote;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class MouseActions {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
      WebDriver d=new ChromeDriver();
      d.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
			  d.manage().window().maximize();
	  		 //d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			  d.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	  		 Actions a=new Actions(d);
	  	    a.moveToElement(d.findElement(By.xpath("//span[contains(text(),'AboutUs')]"))).moveToElement(d.findElement(By.xpath("//span[contains(text(),'Our')]"))).moveToElement(d.findElement(By.xpath("//span[contains(text(),'Chennai')]"))).click().build().perform();
	        //a.moveToElement(d.findElement(By.linkText("AboutUs"))).moveToElement(d.findElement(By.linkText("Our Offices"))).moveToElement(d.findElement(By.linkText("Chennai"))).click().build().perform();        
	        //Assert.assertTrue(d.getCurrentUrl().contains("Chennai"));
	         System.out.println("Test is passed");
	  		 
	  	
  }
}
