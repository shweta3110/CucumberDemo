package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;


public class RL_RunnerMuliple {
	WebDriver d;
	String act;
	String exp;
	
	@Given("demoWebshop site is opened by the test User")
	public void demowebshop_site_is_opened_by_the_test_User() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
		d=new ChromeDriver();
		 d.get("http://demowebshop.tricentis.com/");
		 d.findElement(By.linkText("Log in")).click();
		 Thread.sleep(2000);
	    
	}

	@When("Valid demo login password is provided by the test user")
	public void valid_demo_login_password_is_provided_by_the_test_user()throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.id("Email")).sendKeys("TestUser_Ph@mail.test");
	   d.findElement(By.id("Password")).sendKeys("Test_Password");
	   d.findElement(By.cssSelector("input[value='Log in']")).click();
	   Thread.sleep(2000);
	}

	@Then("next page should be displayed with valid login ID")
	public void next_page_should_be_displayed_with_valid_login_ID()throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		exp="TestUser_Ph@mail.test";
	    act=d.findElement(By.cssSelector("a.account")).getText();
	    Assert.assertEquals(act, exp);
	     System.out.println("Test is passed");
	     d.findElement(By.linkText("Log out")).click();

		
		d.close();
	    
	}

	@When("INValid demo login password is provided by the test user")
	public void invalid_demo_login_password_is_provided_by_the_test_user()throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.id("Email")).sendKeys("TestUser_Ph@mail.test");
		   d.findElement(By.id("Password")).sendKeys("Test");
		   d.findElement(By.cssSelector("input[value='Log in']")).click();
		   Thread.sleep(2000);
		
	   
	}

	@Then("error message should be displayed for INvalid login")
	public void error_message_should_be_displayed_for_INvalid_login()throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		exp= "The credentials provided are incorrect";
	 //act=d.findElement(By.xpath("/html/body/div[4]/div[1]/div[4]/div[2]/div/div[2]/div[1]/div[2]/div[2]/form/div[1]/div/ul/li")).getText();
		act=d.findElement(By.cssSelector("div[class='validation-summary-errors']")).getText();
		Assert.assertTrue(act.contains(exp));
		d.close();
		
	    
	}

	@When("No login password is provided by the test user")
	public void no_login_password_is_provided_by_the_test_user()throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.id("Email")).sendKeys("TestUser_Ph@mail.test");
		   d.findElement(By.id("Password")).sendKeys("");
		   d.findElement(By.cssSelector("input[value='Log in']")).click();
		   Thread.sleep(2000);
	    
	}

	@Then("error message should be displayed for blank login")
	public void error_message_should_be_displayed_for_blank_login()throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		exp="Login was unsuccessful. Please correct the errors and try again.";
	    act=d.findElement(By.cssSelector("div[class='validation-summary-errors']")).getText();
	    Assert.assertTrue(act.contains(exp));
	    //Assert.assertEquals(Act, exp);
	   
		d.close();
	}



}
