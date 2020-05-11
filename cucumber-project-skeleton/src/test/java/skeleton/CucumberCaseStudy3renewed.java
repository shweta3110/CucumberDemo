package skeleton;

//import java.util.ArrayList;
import java.util.Set;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
//import org.testng.Assert;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CucumberCaseStudy3renewed {
	WebDriver d;
	String act, exp;
	String menu,cart,name;
	@Given("TestMeApp is logged in by Jenny")
	public void testmeapp_is_logged_in_by_Jenny() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
		d=new ChromeDriver();
		d.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
		d.findElement(By.linkText("SignIn")).click();
		d.findElement(By.name("userName")).sendKeys("Lalitha");
		d.findElement(By.name("password")).sendKeys("Password123");
		d.findElement(By.name("Login")).click();
		Thread.sleep(1000);
   
	}

	@When("Product is entered in the search box")
	public void product_is_entered_in_the_search_box() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 d.findElement(By.name("products")).sendKeys("Head");
		    Thread.sleep(500);
		    d.findElement(By.cssSelector("input[type='submit']")).click();
		    Thread.sleep(500);
		    
	}

	@Then("she can view the product")
	public void she_can_view_the_product() {
	    // Write code here that turns the phrase above into concrete actions
	    //throw new cucumber.api.PendingException();
		//exp="Head";
		//act=d.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div/div/div[1]/center[1]/h4")).getText();
		//Assert.assertTrue(act.contains(exp));
		System.out.println("Test is passed");
	    
	}

	@When("Jenny clicks on the About us option")
	public void jenny_clicks_on_the_About_us_option() throws Throwable{
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		//d.findElement(By.xpath("/html/body/header/div[2]/div/div/ul/li[3]/a/span")).click();
		//d.findElement(By.xpath("/html/body/header/div[2]/div/div/ul/li[3]/ul/li/a/span")).click();
		//d.findElement(By.xpath("/html/body/header/div[2]/div/div/ul/li[3]/ul/li/ul/li[1]/a/span")).click();
		Actions actions = new Actions(d);
		actions.moveToElement(d.findElement(By.linkText("AboutUs"))).perform();
		actions.moveToElement(d.findElement(By.xpath("//span[contains(text(),'Our')]"))).perform();
		actions.moveToElement(d.findElement(By.xpath("//span[contains(text(),'Chennai')]"))).click().build().perform();

		//WebElement about=d.findElement(By.linkText("AboutUs"));
		//Actions a=new Actions(d);
		//a.moveToElement(about).click().build().perform();
		//a.moveToElement(d.findElement(By.xpath("//span[contains(text(),'Our Offices')]"))).click().build().perform();
		//a.moveToElement(d.findElement(By.xpath("//span[contains(text(),'Chennai')]"))).click().build().perform();
		//d.findElement(By.linkText("Our Offices")).click();
		//d.findElement(By.linkText("Chennai")).click();
		Thread.sleep(500);
		
	}

	@Then("info is visible")
	public void info_is_visible() {
	    // Write code here that turns the phrase above into concrete actions
	   // throw new cucumber.api.PendingException();
		
		//String page=d.getWindowHandle();
		//System.out.println("Pages is "+page);
		//String page=d.getWindowHandle();
		//System.out.println("Page is"+page);
		String page=d.getWindowHandle();
		System.out.println(page);
		Set<String> allWindow=d.getWindowHandles();
		for(String handle:allWindow)
		{
			d.switchTo().window(handle);
		}
		 d.switchTo().frame(d.findElement(By.name("main_page")));
	      String add=d.findElement(By.cssSelector("div[class='contact-info']")).getText();
	      String name="Chennai";
	      Assert.assertTrue(add.contains(name));
	    		  
		//String url=d.getCurrentUrl();
		//System.out.println(url);
		//Assert.assertTrue(url.contains("chn"));

		
				
		//Set<String> allWindow=d.getWindowHandles();
		//System.out.println("Total windows:"+allWindow);
		//ArrayList<String> tabs=new ArrayList<String>(allWindow);
		//d.switchTo().window(tabs.get(1));
		//String currentUrl = d.getCurrentUrl();
		//System.out.println(currentUrl);
		//Assert.assertTrue(currentUrl.contains("chn"));
		//d.switchTo().frame("main_page");
		//act = d.findElement(By.xpath("//*[@id=\"demo3\"]")).getText();
		//System.out.println("Hello, We are in Chennai Address..........");
		
		
		
	         System.out.println("Test is passed");
	  		 
	//System.out.println("Test is passed");
		d.close();
	}

	
	@When("Jenny searches for Headphone")
	public void jenny_searches_for_Headphone() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		 d.findElement(By.name("products")).sendKeys("Headphone");
		  Thread.sleep(2000);
		  d.findElement(By.cssSelector("input[type='submit']")).click();
		
		  Thread.sleep(2000); 
	}
	

}
