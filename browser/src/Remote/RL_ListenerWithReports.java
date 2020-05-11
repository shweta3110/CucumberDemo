package Remote;
import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.text.SimpleDateFormat;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.mongodb.MapReduceCommand.OutputType;
import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class RL_ListenerWithReports implements ITestListener {
	 protected static WebDriver driver;
	    protected static ExtentReports reports;
	    protected static ExtentTest test;
	    protected static File srcFile; 
	    //protected hence need to extend in other class
	    //Download and add Jar files com.relevantcodes.extentreports
	    
	@Override
	public void onFinish(ITestContext result) {
		driver.close();
		reports.endTest(test);
		reports.flush();
		// TODO Auto-generated method stub
		
	}

	@Override
	 public void onTestStart(ITestResult result) {
        System.out.println("-------------------------");
        System.out.println("Test " +result.getTestClass() + result.getName() + " has started");
        
        test=reports.startTest(result.getMethod().getMethodName());
        
        test.log(LogStatus.INFO, result.getMethod().getMethodName()+" Test has started");
    }
		// TODO Auto-generated method stub
		
	
	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		  System.out.println("-------------------------");
	        System.out.println("Test " +result.getTestClass() + result.getName() + " has Failed");
	        
	        System.out.println("Error message is  " + result.getThrowable());    
	        
	        test.log(LogStatus.FAIL, result.getMethod().getMethodName()+" Test is Failed because of error " + result.getThrowable());    
	        
	        srcFile = ((TakesScreenshot)driver).getScreenshotAs(org.openqa.selenium.OutputType.FILE);
	        //FileUtils.copyFile(srcFile, new File("C:\\temp\\Demo_" +AddTime()+"_screenshot1.png"));
	        
	        try {
	            
	FileUtils.copyFile(srcFile, new File("C:/demo/test_" + result.getClass().getName()
	                    + AddTime()+"_screenshot.jpeg"));
	            
	        } catch (IOException e) {
	            // TODO Auto-generated catch block
	            e.printStackTrace();
	        }
	        
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		 System.out.println("-------------------------");
	        System.out.println("Test "+result.getTestClass()  + result.getTestName() + " was skipped");
	        System.out.println("Error message is  " + result.getThrowable());
	        test.log(LogStatus.SKIP, result.getMethod().getMethodName()+" Test is Skipped because of error" + result.getThrowable());
		// TODO Auto-generated method stub
		
	}



	@Override
	public void onTestSuccess(ITestResult result)  {
        System.out.println("-------------------------");
        System.out.println("Test "+result.getTestClass()  + result.getName() + " is sucessful ");
        
        test.log(LogStatus.PASS, result.getMethod().getMethodName()+" Test is passed");
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext result) {
		System.out.println("-------------------------");
        System.out.println("on start");
        
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sakshi\\Desktop\\GFT Selinium training\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        
        reports=new ExtentReports("src/test-output/" 
        + AddTime()+ "reports.html");
        
        // TODO Auto-generated method stub
        //new SimpleDateFormat("yyyy-MM-dd hh-mm-ss-ms").format(new Date(
		// TODO Auto-generated method stub
		
	}
	 public static String AddTime(){ 
	        return new SimpleDateFormat("yyyy_MM_dd__hh_mm_ss").format(new Date(0));
	        
	        }    

}
