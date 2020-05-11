package Remote;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class RL_DemoDaa {
	WebDriver driver;
	String act,exp;
	
	
  @Test(dataProvider = "dp")
  public void f(String uname, String pass) throws Exception {
	  driver.findElement(By.name("userName")).sendKeys(uname);
	  driver.findElement(By.name("password")).sendKeys(pass);
	  driver.findElement(By.cssSelector("input[type='submit']")).click();
	  Thread.sleep(2000);
	  //act=driver.findElement(By.className("ul.nav.navbar")).getText();
	  act=driver.findElement(By.cssSelector("ul.nav")).getText();
	  exp=uname;
  }
  @BeforeMethod
  public void beforeMethod() {
	  //System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
      //driver=new ChromeDriver();
     // driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	  driver.findElement(By.linkText("SignIn")).click();
	  
  }

  @AfterMethod
  public void afterMethod() throws Exception {
	  //exp=uname;
	  Assert.assertTrue(act.contains(exp));
	  System.out.println("passed");
	 driver.findElement(By.linkText("SignOut")).click();
	 Thread.sleep(2000);
  }


  @DataProvider
  public Object[][] dp() {
    return new Object[][] {
      new Object[] { "Lalitha", "Password123" },
      new Object[] { "Lalitha", "Password123" },
     
      
    };
  }
  @BeforeTest
  public void beforeTest() {
	  System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
      driver=new ChromeDriver();
      driver.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	 //driver.findElement(By.linkText("SignIn")).click();
	  
  }

  @AfterTest
  public void afterTest() {
	  driver.close();
	  
  }

}
