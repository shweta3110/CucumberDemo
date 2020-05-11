package RemoteLearningBatch;

import java.io.FileInputStream;

import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeywordDrivenDemo {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fi=new FileInputStream("C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\eclipse-jee-oxygen-3a-win32-x86_64\\browser\\src\\RemoteLearningBatch\\keyDriven.properties");
		Properties p=new Properties();
		p.load(fi);
		WebDriver driver=new ChromeDriver();
		driver.get(p.getProperty("url"));
		driver.findElement(By.id(p.getProperty("unTxtBox"))).sendKeys(p.getProperty("Myun"));
		driver.findElement(By.id(p.getProperty("pwdTxtBox"))).sendKeys(p.getProperty("Mypwd"));
		driver.findElement(By.cssSelector(p.getProperty("loginBtn"))).click();
		
				

	}

}
