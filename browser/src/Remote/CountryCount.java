package Remote;

import java.util.List;

//import java.util.ArrayList;
//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CountryCount {
	WebDriver d;
	int flag;
	String want;
	
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
      d=new ChromeDriver();
      d.get("http://demo.guru99.com/test/newtours/register.php");
      //d.switchTo().alert().dismiss();
      //Select Drop=new Select);
      Select select=new Select(d.findElement(By.name("country")));
     List<WebElement>CountofCountries=select.getOptions();
      System.out.println(CountofCountries.size());
      String req="INDIA";
      for(int i=0;i<CountofCountries.size();i++)
      {
    	  if((CountofCountries.get(i).getText()).contains(req))
    			  {
    		  flag=1;
    		  want=CountofCountries.get(i).getText();
    		  break;
    			  }
    	
    		  
      }
      if(flag==1)
      {
    	  //Assert.assertTrue(want.equals(req));
    	 System.out.println(want);
    	  Assert.assertTrue(want.contains(req));
    	  System.out.println("Pass");
    	  
    	  
      }
      
      
      
     //Select select=new Select(d.findElement(By.name("country")));
      //List<WebElement>CountryCount=select.getOptions();
     //List<WebElement>Countries=select.getOptions();
     // System.out.p


     // System.out.println(count);
      
      
      
     
      
      
      
     
     
      
  }
}
