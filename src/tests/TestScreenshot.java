package tests;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

//import freemarker.template.SimpleDate;

public class TestScreenshot {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\lib\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://www.npmjs.com/package/protractor-cucumber-framework");
		WebElement ele = driver.findElement(By.xpath("//div[@id='npm-logo']"));
		
		driver.manage().window().maximize();
		
		/*driver.get("https://www.paytm.com");
		WebElement ele = driver.findElement(By.xpath("//*[@id='app']/div/div[2]/div[2]/a/i/span[5]"));*/
//		Getting Error  "java.awt.image.RasterFormatException: negative or zero width"
		
		
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMMdd HH mm ss");//screen Jan 2017 04 16 01 623 1483527241623

		Date d = new Date();
		System.out.println(d);
		System.out.println(sdf.format(d));
		
		System.out.println(d.getTime());
		
//		Calendar cal = Calendar.getInstance();
//		System.out.println(cal.getTime());
		;
		
		Screenshot.elementScreenShot(driver,ele , "C:\\FW\\screen "+sdf.format(d).replaceAll(" ","_")+".png");
		

	}

}
