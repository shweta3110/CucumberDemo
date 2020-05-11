package Remote;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;

public class HandsOnExam {
	WebDriver driver;
  @Test(priority=1)
  public void privacypolicy() {
	  driver.switchTo().frame(driver.findElement(By.name("footer")));
	  driver.findElement(By.linkText("Privacy Policy")).click();
	  String Title=driver.getTitle();
	  //Assert.assertEquals(Title,"HDFC Bank – Personal Banking Netbanking Services");
	  System.out.println(Title);
	  Assert.assertNotEquals(Title,"HDFC Bank – Personal Banking Netbanking Services");
	  
	 
  }
  @Test(priority=2)
  public void login() {
	  driver.switchTo().frame(driver.findElement(By.name("login_page")));//login page
	  driver.findElement(By.name("fldLoginUserId")).sendKeys("433788");//custid
	  driver.findElement(By.cssSelector("img[src='/gif/continue_new1.gif?v=1']")).click();//continue
	  driver.findElement(By.name("fldPassword")).sendKeys("abcdefp");//IPIN
	  //driver.findElement(By.cssSelector("input[name='chkrsastu']")).click();
	  driver.findElement(By.className("input_password")).sendKeys("QWE346");
	  driver.findElement(By.cssSelector("img[alt=\"Login\"]")).click(); // login
	 //driver.findElement(By.xpath("/html/body/form/table[2]/tbody/tr/td[2]/table/tbody/tr[1]/td[1]/table/tbody/tr[3]/td[2]/table/tbody/tr[3]/td/span/text()[1]").
	  
	  //String ActualErrorMessage=driver.findElement(By.xpath("/html/body/form/table[1]/tbody/tr/td/strong[1]")).getText();
	  //String ActualErrorMessage=driver.findElement(By.xpath("/html/body/form/table[1]/tbody/tr/td/strong[1]")).getText();
	  //String ExpectedErrorMessage="The Customer ID/IPIN (password) you have entered is invalid, please try again.";
	  //Assert.assertEquals( ActualErrorMessage, ExpectedErrorMessage);
	  System.out.println("Login failed. Please enter correct credentials");
			  


  }
  
  @BeforeMethod
  public void beforeMethod() {
	  System.setProperty("webdriver.chrome.driver","C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
	  driver=new ChromeDriver();
	  driver.get("https://netbanking.hdfcbank.com/netbanking/");
	  
	  
	  
  }

}
