//package skeleton;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.Assert;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class RL_Tricentis {
//	WebDriver d;
//
//	
//	@Given("demowebshop website appears")
//	public void demowebshop_website_appears() throws Throwable{
//		
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
//	d=new ChromeDriver();
//	 d.get("http://demowebshop.tricentis.com/");
//	 Thread.sleep(2000);
//	}
//
//	@When("Anne enters username and password")
//	public void anne_enters_username_and_password()throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		d.findElement(By.linkText("Log in")).click();
//		d.findElement(By.id("Email")).sendKeys("Annef@amail.com");
//	   d.findElement(By.id("Password")).sendKeys("qwertyui");
//	   d.findElement(By.linkText("Log in")).click();
//	   Thread.sleep(2000);
//	}
//
//	@Then("homepage is visible to her")
//	public void homepage_is_visible_to_her()throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		
//		
//		d.close();
//		Thread.sleep(2000);
//	  
//	}
//
//
//}
