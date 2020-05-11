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

public class RL_DemoDataProvider {
	WebDriver d;  
    String exp;
    String Act;
    int c;

  @Test(dataProvider = "dp")
	  public void f(String un, String pwd, int count) throws Exception {
		    d.findElement(By.id("Email")).sendKeys(un);
		    d.findElement(By.id("Password")).sendKeys(pwd);
		    d.findElement(By.cssSelector("input[value='Log in']")).click();
		    Thread.sleep(2000);
		    c=count;
		    exp=un;
		    //Act=d.findElement(By.cssSelector("a[class='account']")).getText();
		    Act=d.findElement(By.cssSelector("a.account")).getText();
		    

  }
  @BeforeMethod
  public void beforeMethod() {
	  d.findElement(By.linkText("Log in")).click();
  

  }

  @AfterMethod
  public void afterMethod() throws Exception {
	    Assert.assertEquals(Act, exp);
	    System.out.println("Test for " + exp + " is passed");
	    System.out.println("Test number " + c + " is passed");
	    d.findElement(By.linkText("Log out")).click();
	    Thread.sleep(2000);

  }


  @DataProvider
  
    	  public Object[][] dp() {
    		    return new Object[][] {
    		      new Object[] { "TestUser_Ph@mail.test", "Test_Password", 1 },
    		      new Object[] { "TestUser_Ph@mail.test", "Test_Password", 2 },
    		      new Object[] { "TestUser_Ph@mail.test", "Test_Password", 3 },
    		      new Object[] { "TestUser_Ph@mail.test", "Test_Password", 4 },
    		      new Object[] { "TestUser_Ph@mail.test", "Test_Password", 5 },
    };
  }
  @BeforeTest
  public void beforeTest() {
      System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
      d=new ChromeDriver();
      d.get("http://demowebshop.tricentis.com/");

  }

  @AfterTest
  public void afterTest() {
	  d.close();
  }

}
