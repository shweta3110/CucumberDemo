package testme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
        d.get("https://lkmdemoaut.accenture.com/TestMeApp");
        d.findElement(By.linkText("SignIn")).click();
        d.findElement(By.name("userName")).sendKeys("Lalitha");;
        d.findElement(By.name("password")).sendKeys("Password123");
        d.findElement(By.cssSelector("input[type='submit']")).click();
        //Absolute XPATH
        //d.findElement(By.xpath("/html/body/header/div[2]/div/div/ul/li[3]/a/span")).click();
        //Thread.sleep(3000);
       
        //d.navigate().refresh();
       
        //Relative XPATH
        d.findElement(By.xpath("//a[@href='fetchorder.htm']")).click();
      //*[@id="menu3"]/li[4]/a
        //d.findElement(By.xpath().click();
        Thread.sleep(3000);
               
	}

}
