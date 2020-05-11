package Remote;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.AfterSuite;

public class FirstTestNGDemo {
	 @Test(priority=1)
	  public void google() {
		  System.out.println("from googleTest");
		    }
		   
		    @Test(priority=2)
		    public void Instagram() {
		  System.out.println("from InstagramTest");
		  Assert.assertEquals(1,2);
		    }
		   
		    @Test(priority=5)
		    public void Facebook() {
		  System.out.println("from FacebookTest");
		    }
		   
		    @Test(enabled=false)
		    public void whatsapp() {
		  System.out.println("from whatsappTest");
		    }
		    @Test(dependsOnMethods="Instagram")
		    public void twitter() {
		  System.out.println("from twitterTest");
		    }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println("beforeMethod");
  
	  
	  
  }
  

  @AfterMethod
  public void afterMethod() {
	  System.out.println("After Method");
  }

  @BeforeClass
  public void beforeClass() {
	  System.out.println("Before Class");
  }

  @AfterClass
  public void afterClass() {
	  System.out.println("After Class");
  }
  

  @BeforeTest
  public void beforeTest() {
	  System.out.println("Before Test");
  }

  @AfterTest
  public void afterTest() {
	  System.out.println("After Test");
	  
  }

  @BeforeSuite
  public void beforeSuite() {
	  System.out.println("Before Suite");
  }

  @AfterSuite
  public void afterSuite() {
	  System.out.println("AFter Suite");
  }

}
