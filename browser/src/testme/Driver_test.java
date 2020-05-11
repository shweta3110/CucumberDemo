package testme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Driver_test {

	public static void main(String[] args) throws Exception{
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://lkmdemoaut.accenture.com/TestMeApp/fetchcat.htm");
		Thread.sleep(100);
		d.findElement(By.linkText("SignUp")).click();
		d.findElement(By.id("userName")).sendKeys("Shweta3");
		d.findElement(By.id("firstName")).sendKeys("Shweta");
		d.findElement(By.id("lastName")).sendKeys("P");
		d.findElement(By.id("password")).sendKeys("pass123");
		d.findElement(By.id("pass_confirmation")).sendKeys("pass123");
		d.findElement(By.cssSelector("input[value='Female']")).click();
		d.findElement(By.id("emailAddress")).sendKeys("shweta@abc.com");
		d.findElement(By.id("mobileNumber")).sendKeys("23423567822");
		d.findElement(By.id("dob")).sendKeys("28/02/2020");
		d.findElement(By.name("address")).sendKeys("Abc colony, Kolhapur");
		d.findElement(By.name("securityQuestion")).click();
		d.findElement(By.name("answer")).sendKeys("qwerty");
		d.findElement(By.name("Submit")).click();
		
	}

}
