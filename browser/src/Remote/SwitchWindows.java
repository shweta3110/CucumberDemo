package Remote;


import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;



public class SwitchWindows {
  @Test
  public void f() {
	  WebDriver d;
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
      d=new ChromeDriver();
      d.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
      d.findElement(By.linkText("SignIn")).click();
      d.findElement(By.name("userName")).sendKeys("Lalitha");;
      d.findElement(By.name("password")).sendKeys("Password123");
      d.findElement(By.cssSelector("input[type='submit']")).click();
      Actions action=new Actions(d);
      action.moveToElement(d.findElement(By.linkText("AboutUs"))).perform();
      action.moveToElement(d.findElement(By.xpath("//span[contains(text(),'Our')]"))).perform();
      action.moveToElement(d.findElement(By.xpath("//span[contains(text(),'Chennai')]"))).click().build().perform();
      String parent=d.getWindowHandle();
      System.out.println(parent);
      Set<String> allw=d.getWindowHandles();
      ArrayList<String> child=new ArrayList(allw);
      d.switchTo().window(child.get(1));
      d.switchTo().frame(d.findElement(By.name("main_page")));
      String info=d.findElement(By.cssSelector("div[class='contact-info']")).getText();
      System.out.println(info);
      Assert.assertTrue(info.contains("Chennai"));
      
      
      
      
      
      
      
      //Actions a=new Actions(d);
      //a.moveToElement(d.findElement(By.linkText("AboutUs"))).perform();
      //a.moveToElement(d.findElement(By.xpath("//span[contains(text(),'Our')]"))).perform();
      //a.moveToElement(d.findElement(By.xpath("//span [contains(text(),'Chennai')]"))).click().build().perform();
      //String handle=d.getWindowHandle();
      //System.out.println(handle);
      //Set<String> allWindows=d.getWindowHandles();
      //System.out.println(allWindows);
      //ArrayList<String> tab=new ArrayList(allWindows);
      //d.switchTo().window(tab.get(1));
     //for(String child:allWindows)
    // {
    	// d.switchTo().window(child);
    // }
      
      
      //a.moveToElement(d.findElement(By.xpath("//span[contains(text(),'Our')]"))).perform();
  }
}
