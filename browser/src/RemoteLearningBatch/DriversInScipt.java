package RemoteLearningBatch;

import org.openqa.selenium.WebDriver;

public class DriversInScipt {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver;
		WebDriver driver1;
		WebDriver  driver2;

		 driver=ChooseDriver.Use("c");
		 driver.get("http://demowebshop.tricentis.com/login");
		 Thread.sleep(500);
		  driver1=ChooseDriver.Use("f");
				  driver1.get("http://demowebshop.tricentis.com/login");
		  driver2=ChooseDriver.Use("x");
			 driver2.get("http://demowebshop.tricentis.com/login");
			
		 
		

	}

}
