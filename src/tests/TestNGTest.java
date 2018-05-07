package tests;

import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import java.lang.reflect.Method;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.google.gson.annotations.Since;

import net.jcip.annotations.ThreadSafe;


/**
 * Created by E003640 on 22-12-2016.
 */

public class TestNGTest {

	WebDriver driver ;
	
	@BeforeClass(enabled = true)
	public void browserLaunch(){
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
//		driver.get("https://www.google.co.in");
		driver.get("http://accountsdemo.herokuapp.com");

	}
	
	@Test(enabled = false, groups={"two"})
    public void register() throws InterruptedException{
		 driver.findElement(By.linkText("Sign up")).click();
		 Thread.sleep(5000);
		 System.out.println(driver.findElement(By.id("user_first_name")).isEnabled());
		 driver.findElement(By.id("user_first_name")).sendKeys("firstName");
		
        System.out.println("This is testDisplay2"+Thread.currentThread().getStackTrace()[1].getMethodName());
//        assertFalse(false);
    }

    @Test(enabled = false,groups="one")
public void testDisplay(Method tr){
    	/*System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\lib\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://www.google.co.in");*/
    	
//        System.out.println("ITestResult  \"tr.getClass().toString()\": --> "+tr.getClass().toString());
//        System.out.println("ITestResult  \"tr.getTestName().toString()\": --> "+tr.getTestName().toString());

//        System.out.println("ITestResult \"tr.getMethod().toString()\" : --> "+tr.getName().toString());
    	  System.out.println("Method \"tr.getDeclaringClass().getSimpleName()\" : --> "+tr.getDeclaringClass().getSimpleName() +";   Method \"tr.getName()\" : --> "+ tr.getName());

        System.out.println("Using Thread : --> "+Thread.currentThread().getStackTrace()[1].getMethodName());
        assertTrue(true);
    }

    @AfterMethod(enabled = true)
    public void afterMethod(ITestResult result, Method tr) {
    	System.out.println("hello i'm in after method");
    	 System.out.println("result.getClass().getSimpleName()"+result.getClass().getSimpleName());
      System.out.println("result.getMethod().getMethodName() method name:-->" + result.getMethod().getMethodName());
      
	  System.out.println("Method \"tr.getDeclaringClass().getSimpleName()\" : --> "+tr.getDeclaringClass().getSimpleName() +";   Method \"tr.getName()\" : --> "+ tr.getName());

    }
    
    @Test(enabled = true, groups={"two"})
    public void testDisplay2(){
        System.out.println("This is testDisplay2"+Thread.currentThread().getStackTrace()[1].getMethodName());
        assertFalse(false);
    }
}

