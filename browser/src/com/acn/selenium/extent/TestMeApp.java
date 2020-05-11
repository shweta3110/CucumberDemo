package com.acn.selenium.extent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;

public class TestMeApp {
	WebDriver d;

	@Test(priority = 1)
	public void testRegistration() throws Exception {
		d.findElement(By.linkText("SignUp")).click();
		d.findElement(By.name("userName")).sendKeys("An10t1iq8923");
		d.findElement(By.name("firstName")).sendKeys("Anne");
		d.findElement(By.name("lastName")).sendKeys("Frank");
		d.findElement(By.name("password")).sendKeys("Anne789");
		d.findElement(By.name("confirmPassword")).sendKeys("Anne789");
		d.findElement(By.cssSelector("input[value='Female']")).click();
		d.findElement(By.name("emailAddress")).sendKeys("anne@pqr.com");
		d.findElement(By.name("mobileNumber")).sendKeys("9876543219");
		d.findElement(By.name("dob")).sendKeys("22/03/2010");
		d.findElement(By.name("address")).sendKeys("777,qwerty,xyz");
		Select dropdown = new Select(d.findElement(By.id("securityQuestion")));
		dropdown.selectByVisibleText("What is your Birth Place?");
		d.findElement(By.name("answer")).sendKeys("asdf");
		d.findElement(By.name("Submit")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 2)
	public void testLogin() throws Exception {
		d.findElement(By.id("userName")).sendKeys("Lalitha");
		d.findElement(By.id("password")).sendKeys("Password123");
		Thread.sleep(2000);
		d.findElement(By.name("Login")).click();
		// d.findElement(By.cssSelector("input[name='Login']")).click();
		Thread.sleep(3000);
	}

	@Test(priority = 3)
	public void testCart() throws Exception {
		d.findElement(By.name("products")).sendKeys("Carry lappy");
		Thread.sleep(2000);
		d.findElement(By.cssSelector("input[type='submit']")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 4)
	public void testPayment() throws Exception {
		d.findElement(By.linkText("Add to cart")).click();
		d.findElement(By.xpath("//a[@href='displayCart.htm']")).click();
		d.findElement(By.linkText("Checkout")).click();
		d.findElement(By.xpath("//input[@value='Proceed to Pay']")).click();
		
		
		Thread.sleep(10000);

		// d.findElement(By.xpath("//label[text()='Andhra Bank']")).click();
		d.findElement(By.xpath("//label[contains(text(),'Andhra')]")).click();
		// d.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		Thread.sleep(1000);
		d.findElement(By.xpath("//a[@href='#' and @id='btn']")).click();
		Assert.assertEquals("Payment Gateway", d.getTitle());
		d.findElement(By.name("username")).sendKeys("123456");
		d.findElement(By.name("password")).sendKeys("Pass@456");
		d.findElement(By.xpath("//input[@type='submit' and @value='LOGIN']")).click();
		// d.findElement(By.xpath("//input[@type='submit' and
		// @value='LOGIN']")).click();
		Assert.assertEquals("Payment Gateway", d.getTitle());
		d.findElement(By.name("transpwd")).sendKeys("Trans@456");
		d.findElement(By.xpath("//input[@type='submit' and @value='PayNow']")).click();
		Assert.assertEquals("Order Details", d.getTitle());

		
	}

	@BeforeTest
	public void beforeTest() {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
		d = new ChromeDriver();
		d.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
	}

	@AfterTest
	public void afterTest() {
		d.close();
	}

}
