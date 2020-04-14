//package skeleton;
//
//import org.openqa.selenium.By;
//import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.support.ui.Select;
//import org.testng.Assert;
//
//import cucumber.api.java.en.Given;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;
//
//public class CucumberCaseStudy1 {
//	WebDriver d;
//	String exp,act;
//	
//	@Given("Jenny opens TestMe app")
//	public void jenny_opens_TestMe_app() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
//	      d= new ChromeDriver();
//	      d.get("https://lkmdemoaut.accenture.com/TestMeApp/");
//	      Thread.sleep(1000);
//		
//	    
//	}
//
//	@When("Jenny enters the correct info {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string} {string}")
//	public void alex_enters_the_correct_info(String uname, String fname, String lname, String pass, String cpass, String gender, String email, String mobile, String dob, String address, String sqestion, String answer) throws InterruptedException {
//	//public void jenny_enters_the_correct_info(String string, String string2, String string3, String string4, String string5, String string6, String string7, String string8, String string9, String string10, String string11, String string12) throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		d.findElement(By.linkText("SignUp")).click();
//		Thread.sleep(2000);
//		d.findElement(By.name("userName")).sendKeys(uname);
//		d.findElement(By.name("firstName")).sendKeys(fname);
//		d.findElement(By.name("lastName")).sendKeys(lname);
//		d.findElement(By.name("password")).sendKeys(pass);
//		d.findElement(By.name("confirmPassword")).sendKeys(cpass);
//		d.findElement(By.cssSelector("input[value='Male']")).click();
//		d.findElement(By.name("emailAddress")).sendKeys(email);
//		d.findElement(By.name("mobileNumber")).sendKeys(mobile);
//		d.findElement(By.name("dob")).sendKeys(dob);
//		d.findElement(By.name("address")).sendKeys(address);
//		Select dropdown = new Select(d.findElement(By.id("securityQuestion")));  
//		dropdown.selectByVisibleText(sqestion);
//		d.findElement(By.name("answer")).sendKeys(answer);
//		d.findElement(By.name("Submit")).click();
//		Thread.sleep(3000);
//	}
//
//	@Then("Jennyis registerd succesfully")
//	public void jennyis_registerd_succesfully() throws Throwable{
//	    // Write code here that turns the phrase above into concrete actions
//		exp="Login";
//		act=d.findElement(By.xpath("//*[@id=\"demo1\"]")).getText();
//	    Assert.assertEquals(act, exp);
//	    System.out.println("CaseStudy 1 is passed");
//	    Thread.sleep(2000);
//	    d.close();
//	   
//	}
//
//}
