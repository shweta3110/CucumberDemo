package Remote;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Dropdownop {
	WebDriver d;
	int flag;
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
      d=new ChromeDriver();
      d.get("http://demo.guru99.com/test/newtours/register.php");
      Select select=new Select(d.findElement(By.name("country")));
      List<WebElement>allCountries=select.getOptions();
      int count=allCountries.size();
      String req="INDIA";
      for(int i=0;i<count;i++)
      {
    	  if(allCountries.get(i).getText().contains(req))
    	  {
    		  flag=1;
    		  break;  
    	  }
      }
      if(flag==1)
      {
    	  System.out.println("Pass");
      }
      
  }
  
}
