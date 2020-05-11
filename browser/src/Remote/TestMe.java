package Remote;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class TestMe {
	WebDriver d;
	String exp;
    String Act;
    @BeforeTest
    public void beforeTest() {
    	 System.setProperty("webdriver.chrome.driver","C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe" );
         //WebDriver d=new ChromeDriver();
         
           d=new ChromeDriver();
           d.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
    }
    @BeforeMethod
    public void beforeMethod() {
    	 d.findElement(By.linkText("SignIn")).click();
    }
    

    
  @Test
  public void LoginTest() throws Exception  {
	  d.findElement(By.id("userName")).sendKeys("Lalitha");
	    d.findElement(By.id("password")).sendKeys("Password123");
	    d.findElement(By.cssSelector("input[value='Login']")).click();
	    Thread.sleep(2000);
	    exp="Hi, Lalitha SignOut";
	     Act= d.findElement(By.cssSelector("ul.nav.navbar-nav")).getText();
	  
  }

  @AfterMethod
  public void afterMethod() {
	  Assert.assertEquals(Act, exp);
	     System.out.println("Test is passed");
	     d.findElement(By.linkText("SignOut")).click();
	  
  }

 

  @AfterTest
  public void afterTest() {
	  d.close();
  }

}
