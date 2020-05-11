package mod_23;

import java.util.List;

//import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriver_d {

	public static void main(String[] args)throws Exception{
		// TODO Auto-generated method stub
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		driver.manage().window().maximize();
		List <WebElement> Links=driver.findElements(By.tagName("a"));
		 System.out.println(Links.size());
		   for (int i=0;i<Links.size();i++)
	        {
	            System.out.println(Links.get(i).getText());
	            Thread.sleep(200);
	            
	        }
		   driver.close();
		

	}

}
