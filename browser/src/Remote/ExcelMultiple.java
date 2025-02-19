package Remote;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;

public class ExcelMultiple {
	WebDriver driver;
	FileInputStream FRead;
	FileOutputStream FWrite;
	XSSFWorkbook wb;
	XSSFSheet sh;
	String d1,d2;
	String login;
	String pwd;
	String wbmsg;
	String xlmsg;
	String pass="Test is Passed";
	String fail="Test is Failed---xxxx---";
	int rowval;
	int rowcount;
  @Test
	  public void ReadWrite() throws InterruptedException, Exception {
	        
		     for(rowval=1;rowval<rowcount;rowval++)
		     {
		      login=sh.getRow(rowval).getCell(0).getStringCellValue();
		      pwd=sh.getRow(rowval).getCell(1).getStringCellValue();
		      xlmsg=sh.getRow(rowval).getCell(2).getStringCellValue();
		         
		      driver.get("http://demowebshop.tricentis.com");
		      Thread.sleep(2000);
		        driver.findElement(By.linkText("Log in")).click();
		        Thread.sleep(500);
		        driver.findElement(By.id("Email")).sendKeys(login);
		        driver.findElement(By.id("Password")).sendKeys(pwd);
		        driver.findElement(By.cssSelector("input[value='Log in']")).click();
		        Thread.sleep(1000);
		        wbmsg = driver.findElement(By.cssSelector("a.account")).getText();
		        System.out.println(wbmsg);
		         driver.findElement(By.linkText("Log out")).click();
		          Thread.sleep(1000); 
		          
		      System.out.println(" ");
		      System.out.println(" ");
		      
		      System.out.println("Login id used is " + login);
		      System.out.println("Password used is " + pwd);
		      System.out.println("The user name is " + wbmsg);
		    
		        FWrite=new FileOutputStream("C:\\Manohar@C\\wip\\TestWkSpc\\ReadWriteExcel.xlsx");
		      sh.getRow(rowval).createCell(3).setCellValue(wbmsg);
		          if(wbmsg.equals(xlmsg))
		          {
		             System.out.println(pass);
		             sh.getRow(rowval).createCell(4).setCellValue(pass);
		          }
		          else
		          {
		            System.out.println(fail);
		            sh.getRow(rowval).createCell(4).setCellValue(fail);
		          }
		          wb.write(FWrite);
		                      
		     }
		     
		  }


  @BeforeTest
	  public void beforeTest() throws Exception, Exception {
		    System.setProperty("webdriver.chrome.driver", "C:\\chromedriver.exe");
		    driver = new ChromeDriver();
		    
		    /*File*/ FRead=new FileInputStream("C:\\Manohar@C\\wip\\TestWkSpc\\ReadWriteExcel.xlsx");
		    
		    /*XSSFWorkbook*/ wb=new XSSFWorkbook(FRead);
		    
		    /*XSSFSheet*/ sh= wb.getSheetAt(0); 
		    //XSSFSheet sh= wb.getSheet("Login");
		    
		    /*String*/ d1=sh.getRow(0).getCell(0).getStringCellValue();
		    /*String*/ d2=sh.getRow(0).getCell(1).getStringCellValue();
		    rowcount=sh.getPhysicalNumberOfRows();
		    System.out.println(rowcount);
		}
  

  @AfterTest
	  public void afterTest() throws Exception {
	      Thread.sleep(2000);
	      driver.close();
	      wb.close();
  }

}
