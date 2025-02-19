package skeleton;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
//import junit.framework.Assert;

public class CucumberCaseStudy2 {
	WebDriver d;
	String LoginName;
	

@Given("Jenny goes to TestMe")
public void jenny_goes_to_TestMe()  throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
	      d= new ChromeDriver();
      d.get("https://lkmdemoaut.accenture.com/TestMeApp/");
      Thread.sleep(1000);
}


@When("Jenny gives valid {string} {string}")
public void jenny_gives_valid(String username, String password) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		d.findElement(By.linkText("SignIn")).click();
		Thread.sleep(2000);
		
		d.findElement(By.id("userName")).sendKeys(username);
		d.findElement(By.id("password")).sendKeys(password);
		d.findElement(By.name("Login")).click();
		
		Thread.sleep(2000);
}

@Then("Jenny is able to view the page")
public void jenny_is_able_to_view_the_page() {
	    //Write code here that turns the phrase above into concrete actions
	LoginName= d.findElement(By.cssSelector("ul.nav")).getText();
		Assert.assertTrue(LoginName.contains("Lalitha"));
		System.out.println("Test is Passed");
		
	    
	}

}
