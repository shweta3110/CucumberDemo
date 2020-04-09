package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RL_FirstScript {
	WebDriver d;

	@Given("online testme is open")
	public void online_testme_is_open() throws Throwable {
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
	    d=new ChromeDriver();
	    d.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	    Thread.sleep(2000);
	    
	}

	@When("Lalitha gives valid username password") 
	public void lalitha_gives_valid_username_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	 d.findElement(By.linkText("SignIn")).click();
	 d.findElement(By.id("userName")).sendKeys("Lalitha");
	 d.findElement(By.id("password")).sendKeys("Password123");
	 d.findElement(By.name("Login")).click();
	 Thread.sleep(2000);
	}
	@Then("he is able to see the homepage")
	public void he_is_able_to_see_the_homepage() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String LoginName=d.findElement(By.cssSelector("ul.nav")).getText();
	    Assert.assertTrue(LoginName.contains("Lalitha"));
	    System.out.println("Test is passed");
	   
	}

}
