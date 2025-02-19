package Remote;

import org.testng.annotations.Test;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;


public class CaseStudyExtent {
  @Test
  public void f() {
		 
		  public class Listner implements ITestListener {

		  	protected static WebDriver driver; 
		  	protected static ExtentReports reports; 
		  	protected static ExtentTest test; 
		  	protected static File srcFile; 


		  	@Override
		  	public void onFinish(ITestContext context) 
		  	{
		  		driver.close(); 
		  		reports.endTest(test); 
		  		reports.flush(); 
		  	}
		  	
		  	public static String AddTime()
		  	{ 
		  		return new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date());
		  		
		  	}

		  	@Override
		  	public void onStart(ITestContext context) 
		  	{
		  		System.out.println("-------------------------"); 
		  		System.out.println("on start"); 
		  		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Admin\\Desktop\\GFT se Training\\chromedriver.exe");
		  	    driver=new ChromeDriver();
		  		reports=new ExtentReports("C:\\Users\\Admin\\Desktop\\GFT se Training\\Extend Report of listeners\\ss\\new_" + AddTime()+ "_Reports.html"); 
		  	}

		  	@Override
		  	public void onTestFailedButWithinSuccessPercentage(ITestResult result) 
		  	{
		  		
		  		
		  	}

		  	@Override
		  	public void onTestFailure(ITestResult result) 
		  	{
		  		System.out.println("-------------------------"); 
		  		System.out.println("Test " +result.getTestClass() + result.getName() + " has Failed"); 
		  		System.out.println("Error message is " + result.getThrowable()); 
		  		test.log(LogStatus.FAIL, result.getMethod().getMethodName()+" Test is Failed because of error " + result.getThrowable()); 
		  		srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE); 
		  		try 
		  		{
		  			FileUtils.copyFile(srcFile, new File("C:\\Users\\Admin\\Desktop\\GFT se Training\\Extend Report of listeners\\ss\\new_" +AddTime()+"_Screenshot1.png"));
		  		} 
		  		catch (IOException e1) 
		  		{
		  			e1.printStackTrace();
		  		}
		  		 
		  	}

		  	@Override
		  	public void onTestSkipped(ITestResult result) 
		  	{
		  		System.out.println("-------------------------"); 
		  		System.out.println("Test "+result.getTestClass() + result.getTestName() + " was skipped"); 
		  		System.out.println("Error message is " + result.getThrowable()); 
		  		test.log(LogStatus.SKIP, result.getMethod().getMethodName()+" Test is Skipped because of error" + result.getThrowable()); 	
		  	}

		  	@Override
		  	public void onTestStart(ITestResult result) 
		  	{
		  		System.out.println("-------------------------"); 
		  		System.out.println("Test " +result.getTestClass() + result.getName() + " has started"); 
		  		test=reports.startTest(result.getMethod().getMethodName()); 
		  		test.log(LogStatus.INFO, result.getMethod().getMethodName()+" Test has started");
		  		
		  	}

		  	@Override
		  	public void onTestSuccess(ITestResult result) 
		  	{
		  		System.out.println("-------------------------"); 
		  		System.out.println("Test "+result.getTestClass() + result.getName() + " is sucessful "); 
		  		test.log(LogStatus.PASS, result.getMethod().getMethodName()+" Test is passed"); 
		  	}

		  }
		  
	 
  }
}
