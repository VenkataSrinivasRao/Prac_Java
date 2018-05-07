package tests;

import java.io.File;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

public class Test_Extend_Report_VerifyTitle {

	
	ExtentReports report;
	ExtentTest logger; 
	WebDriver driver;

	
	@BeforeClass(enabled = true)
	public void browserLaunch(){
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\lib\\geckodriver.exe");
//		driver = new FirefoxDriver();
//		report.loadConfig(new File(System.getProperty("user.dir")+"\\src\\lib\\extent-config.xml"));
		
	}

	@Test
	public void verifyBlogTitle(){

		report=new ExtentReports("C:\\Report\\LearnAutomation.html",true);
	
		logger=report.startTest("Testing BlogTitle");
	
		driver=new FirefoxDriver();
	
		driver.manage().window().maximize();
	
		logger.log(LogStatus.INFO, "Browser started ");
	
		driver.get("http://www.learn-automation.com");
	
		logger.log(LogStatus.INFO, "Application is up and running");
	
		String title=driver.getTitle();
	
		Assert.assertTrue(title.contains("Seleniumsvs")); 
	
		logger.log(LogStatus.PASS, "Title verified"); 
	}


		@AfterMethod(enabled = true)
		public void tearDown(ITestResult result)
		{
			
			report.loadConfig(new File(System.getProperty("user.dir")+"\\src\\lib\\extent-config.xml"));
	
		if(result.getStatus()==ITestResult.FAILURE)
		{

		String screenshot_path=Utility.captureScreenshot(driver, result.getName());
		String image= logger.addScreenCapture(screenshot_path);
		logger.log(LogStatus.FAIL, "Title verification", image);

		}

		report.endTest(logger);
		report.flush();

		}
	
}