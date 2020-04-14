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
//public class CucumberCaseStudy3 {
//	WebDriver d;
//	String exp;
//	String act;
//	@Given("Alex is in homepage of testmeapp")
//	public void alex_is_in_homepage_of_testmeapp() throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//			System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
//			d=new ChromeDriver();
//			d.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
//			d.findElement(By.linkText("SignIn")).click();
//			d.findElement(By.name("userName")).sendKeys("AlexLee1");
//			d.findElement(By.name("password")).sendKeys("Password123");
//			d.findElement(By.name("Login")).click();
//			Thread.sleep(1000);
//	   
//	}
//
//	@When("Alex searches the required product on search bar")
//	public void alex_searches_the_required_product_on_search_bar()throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		  d.findElement(By.name("products")).sendKeys("Head");
//		    Thread.sleep(500);
//		    d.findElement(By.cssSelector("input[type='submit']")).click();
//		    Thread.sleep(500);
//		    
//	}
//
//	@Then("Alex sees the required product page with option of add to cart")
//	public void alex_sees_the_required_product_page_with_option_of_add_to_cart()throws Throwable {
//	    // Write code here that turns the phrase above into concrete actions
//		exp="Head";
//		act=d.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[1]/center[1]/h4")).getText();
//		Assert.assertTrue(act.contains(exp));
//		System.out.println("Test is passed");
//	    
//	}
//
//}
