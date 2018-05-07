package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class VerfiyImage {
/**
 * image verification thru javascript.
 * 
 */
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\lib\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\\lib\\IEDriverServer32.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\lib\\chromedriver.exe");

		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://www.seleniumhq.org/");
		
		WebElement ImageFile = driver.findElement(By.xpath("//*[@id='sidebar']/img"));
        
        Boolean ImagePresent = (Boolean) ((JavascriptExecutor)driver).executeScript("return arguments[0].complete && typeof arguments[0].naturalWidth != \"undefined\" && arguments[0].naturalWidth > 0", ImageFile);
        if (!ImagePresent)
        {
             System.out.println("Image not displayed.");
        }
        else
        {
            System.out.println("Image displayed.");
        }

	}

}
