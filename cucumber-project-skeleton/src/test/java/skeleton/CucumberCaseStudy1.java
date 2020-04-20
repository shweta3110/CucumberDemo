package skeleton;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//
public class CucumberCaseStudy1 {
	WebDriver d;
String exp,act;

@Given("Jenny opens the TestMe app url")
public void jenny_opens_the_TestMe_app_url() throws Throwable{
//	    // Write code here that turns the phrase above into concrete actions	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
	      d= new ChromeDriver();
	      d.get("https://lkmdemoaut.accenture.com/TestMeApp/");
	      Thread.sleep(1000);
		
	}
//
//	
@When("Jenny fills the required fields{string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
public void jenny_fills_the_required_fields(String uname, String fname, String lname, String pass, String cpass, String gender, String email, String mobile, String dob, String address, String sqestion, String answer) throws Throwable {
		d.findElement(By.linkText("SignUp")).click();
		Thread.sleep(2000);
		d.findElement(By.name("userName")).sendKeys(uname);
		d.findElement(By.name("firstName")).sendKeys(fname);
		d.findElement(By.name("lastName")).sendKeys(lname);
	d.findElement(By.name("password")).sendKeys(pass);
		d.findElement(By.name("confirmPassword")).sendKeys(cpass);
		d.findElement(By.cssSelector("input[value='Female']")).click();
		d.findElement(By.name("emailAddress")).sendKeys(email);
		d.findElement(By.name("mobileNumber")).sendKeys(mobile);
		d.findElement(By.name("dob")).sendKeys(dob);
		d.findElement(By.name("address")).sendKeys(address);
	Select dropdown = new Select(d.findElement(By.id("securityQuestion")));  
		dropdown.selectByVisibleText(sqestion);
	d.findElement(By.name("answer")).sendKeys(answer);
		d.findElement(By.name("Submit")).click();
	Thread.sleep(3000);
}


		@Then("Jenny is a registered user")
		public void jenny_is_a_registered_user() throws Throwable {
//    // Write code here that turns the phrase above into concrete action;
			exp="Login";
		act=d.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
	    Assert.assertEquals(act, exp);
	    System.out.println("CaseStudy 1 is passed");
	    Thread.sleep(2000);
   
	   
	}

}
