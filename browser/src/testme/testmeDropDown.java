package testme;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class testmeDropDown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub	
//		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
		WebDriver d= new ChromeDriver();
		d.get("https://lkmdemoaut.accenture.com/TestMeApp/RegisterUser.htm");
		Thread.sleep(1000);
		
       
        d.findElement(By.cssSelector("img[src='images/calendar.png']")).click();
        Select month = new Select(d.findElement(By.cssSelector("select[class='ui-datepicker-month']")));
        month.selectByIndex(11);
        Thread.sleep(200);
        Select year = new Select(d.findElement(By.cssSelector("select[class='ui-datepicker-year']")));
        year.selectByValue("1997");
        Thread.sleep(200);
        d.findElement(By.linkText("4")).click();
//             d.close();
        d.findElement(By.cssSelector("img[src=\"images/calendar.png']")).click();
        Select month=new Select(d.findElement(By.cssSelector("select[class='ui-datepicker-month']")));
        
        
 

	}

}
