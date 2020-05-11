package Remote;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class CountryName {
	
  @Test
  public void f() {
	 
	
	 
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
	  WebDriver d=new ChromeDriver();
	  d.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	  d.findElement(By.linkText("SignIn")).click();
	  d.findElement(By.id("userName")).sendKeys("Lalitha");
      d.findElement(By.id("password")).sendKeys("Password123");
      d.findElement(By.name("Login")).click();
      d.findElement(By.linkText("OrderDetails")).click();
      WebElement table=d.findElement(By.xpath("/html/body/b/section/div/div/div/form/table/tbody"));
   
	  
      List<WebElement> columlinks=table.findElements(By.tagName("tr"));
	  int size=columlinks.size();
	  System.out.println("No of  order  is"+size);
	  List<WebElement> rowsize=table.findElements(By.tagName("a"));
	  // /html/body/b/section/div/div/div/form/table/tbody/tr[1]/td[5]/a
	  // /html/body/b/section/div/div/div/form/table/thead/tr/th[5]
			  // /html/body/b/section/div/div/div/form/table/thead/tr/th[5]
	//  /html/body/b/section/div/div/div/form/table/thead/tr/th[5]
	 // /html/body/b/section/div/div/div/form/table/tbody
	 // /html/body/b/section/div/div/div/form/table/tbody
	  
	  int no=rowsize.size();
	  System.out.println("No of re order " +no);
	  
    
	 
	 
	   
	  

	  
	  
	  
	  
      
	 
  }
  
}
