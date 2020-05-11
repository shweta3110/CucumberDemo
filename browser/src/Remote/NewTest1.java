package Remote;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class NewTest1 {
  @Test
  public void f() {
	  WebDriver d;
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
      d=new ChromeDriver();
      d.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
      d.findElement(By.linkText("SignIn")).click();
      d.findElement(By.name("userName")).sendKeys("Lalitha");
      d.findElement(By.name("password")).sendKeys("Password123");
      d.findElement(By.name("Login")).click();
      Actions a=new Actions(d);
      a.moveToElement(d.findElement(By.linkText("AboutUs"))).perform();
      //actions.moveToElement(d.findElement(By.linkText("AboutUs"))).perform();
		//actions.moveToElement(d.findElement(By.xpath("//span[contains(text(),'Our')]"))).perform();
		//actions.moveToElement(d.findElement(By.cssSelector("a[href$='=chn']"))).click().build().perform();

      a.moveToElement(d.findElement(By.xpath("//span[contains(text(),'Our')]"))).perform();
      a.moveToElement(d.findElement(By.xpath("//span[contains(text(),'Chennai')]"))).click().build().perform();
      
      for(String handle:d.getWindowHandles())
      {
    	  d.switchTo().window(handle);
      }
      d.switchTo().frame(d.findElement(By.name("main_page")));
      String add=d.findElement(By.cssSelector("div[class='contact-info']")).getText();
      String name="Chennai";
      Assert.assertTrue(add.contains(name));
    		  
      
      
  
  }
}
