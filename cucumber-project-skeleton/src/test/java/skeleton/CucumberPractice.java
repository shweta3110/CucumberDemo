package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberPractice {
	WebDriver d;
	String actual,expected;
	
	
	@Given("user has to register")
	public void user_has_to_register() throws Exception{
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
		Thread.sleep(500);
	    
	}

	@When("he will enter")
	public void he_will_enter() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		d.findElement(By.linkText("SignUp")).click();
		d.findElement(By.id("userName")).sendKeys("Sidnep1");
		d.findElement(By.id("firstName")).sendKeys("Sidney");
		d.findElement(By.id("lastName")).sendKeys("Shell");
		d.findElement(By.id("password")).sendKeys("password123");
		d.findElement(By.name("confirmPassword")).sendKeys("password123");
		d.findElement(By.cssSelector("input[value='Male']")).click();
		d.findElement(By.name("emailAddress")).sendKeys("sid@abc.com");
		d.findElement(By.name("mobileNumber")).sendKeys("7788990066");
		d.findElement(By.name("dob")).sendKeys("31/10/1997");
		d.findElement(By.name("address")).sendKeys("qwerty.poluy");
		Select drop=new Select(d.findElement(By.id("securityQuestion")));
		//drop.deselectByVisibleText("What is your favorite color");
		drop.selectByVisibleText("What is your favour color?");
		d.findElement(By.name("answer")).sendKeys("Pink");
		d.findElement(By.name("Submit")).click();
	
	}

	@Then("he will login")
	public void he_will_login() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		actual=d.findElement(By.className("row-form-group")).getText();
		expected= "User Registered Succesfully!!! Please login";
		Assert.assertTrue(expected.contains(actual));
		System.out.println("Pass");
		d.close();
		
	}

	@Given("registration pg is open")
	public void registration_pg_is_open() throws Exception {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
	    System.setProperty("webdriver.chrome.driver","C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
		Thread.sleep(500);
	}

	@When("puts all data")
	public void puts_all_data() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();d.findElement(By.linkText("SignUp")).click();
		d.findElement(By.id("userName")).sendKeys("Sidnepyt1");
		d.findElement(By.id("firstName")).sendKeys("Sidney");
		d.findElement(By.id("lastName")).sendKeys("Shell");
		d.findElement(By.id("password")).sendKeys("password123");
		d.findElement(By.name("confirmPassword")).sendKeys("password123");
		d.findElement(By.cssSelector("input[value='Male']")).click();
		d.findElement(By.name("emailAddress")).sendKeys("sid@abc.com");
		d.findElement(By.name("mobileNumber")).sendKeys("7788990066");
		d.findElement(By.name("dob")).sendKeys("31/10/1997");
		d.findElement(By.name("address")).sendKeys("qwerty.poluy");
		Select drop=new Select(d.findElement(By.id("securityQuestion")));
		//drop.deselectByVisibleText("What is your favorite color");
		drop.selectByVisibleText("What is your favour color?");
		d.findElement(By.name("answer")).sendKeys("Pink");
		d.findElement(By.name("Submit")).click();
	
	}

	@Then("he can proceed")
	public void he_can_proceed() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		actual=d.findElement(By.className("row-form-group")).getText();
		expected= "User Registered Succesfully!!! Please login";
		Assert.assertTrue(expected.contains(actual));
		System.out.println("Pass");
		d.close();
	}

}
