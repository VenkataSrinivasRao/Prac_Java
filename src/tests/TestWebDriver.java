package tests;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class TestWebDriver {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\lib\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\\lib\\IEDriverServer32.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\lib\\chromedriver.exe");

		
		
//		System.out.println(System.getProperty("user.dir")+"\\src\\lib\\geckodriver.exe");
		
		/*DesiredCapabilities capabilities=DesiredCapabilities.firefox();
		capabilities.setCapability("marionette", true);
		capabilities.setCapability("gecko", true);
		WebDriver driver = new FirefoxDriver(capabilities);
		*/
		
		ProfilesIni prof = new ProfilesIni();
		FirefoxProfile p = prof.getProfile("sri");
		
		WebDriver driver = new FirefoxDriver(p);
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new InternetExplorerDriver();
		
	/*	
		driver.get("https://www.google.co.in");
//		driver.findElement(By.id("lst-ib")).sendKeys(Keys.chord("Sai Ram"));
		driver.findElement(By.id("lst-ib")).sendKeys("Sai Ram");

		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);
		
		Thread.sleep(5000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.id("lst-ib")).sendKeys("Sri Ram");
		
		driver.findElement(By.id("lst-ib")).sendKeys(Keys.ENTER);*/
		
		
		/*driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.policyx.com/life-insurance/landing/term-plan-india-landing-v32.php?utm_medium=referral&utm_term=life&utm_campaign=1092&utm_content=10133&utm_source=302_Native&src_id=302&sub_id=Native&campaign_id=1092#");
		driver.findElement(By.id("DOB")).click();
		
		WebElement month = driver.findElement(By.xpath("//select[@class='ui-datepicker-month']"));
		WebElement year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		WebElement day = driver.findElement(By.xpath("//a[text()='16']"));
		
		Select m = new Select(month);
		m.selectByVisibleText("May");
		
		year = driver.findElement(By.xpath("//select[@class='ui-datepicker-year']"));
		Select y = new Select(year);
		y.selectByVisibleText("1990");
		
		day = driver.findElement(By.xpath("//a[text()='16']"));
		day.click();
		
		Select tobaco = new Select(driver.findElement(By.xpath("//select[@id='tobacco']")));
		tobaco.selectByVisibleText("No");
		
		Select income = new Select(driver.findElement(By.xpath("//select[@id='annual_income']")));
		income.selectByVisibleText("7-10 Lacs");
		
		Select gender = new Select(driver.findElement(By.xpath("//select[@id='Show']")));
		gender.selectByVisibleText("Male");
		
//		driver.findElement(By.xpath("//button[@id='term_form_submit']")).click();  
		driver.findElement(By.xpath("//*[@id='Name']")).sendKeys("srinivas");
		driver.findElement(By.xpath("//*[@id='PhoneNumber']")).sendKeys("8889993564");
		
		driver.findElement(By.xpath("//*[@id='Email']")).sendKeys("srinivas12314.mami@gmail.com");
		
		Select city = new Select(driver.findElement(By.xpath("//*[@id='City']")));
		city.selectByVisibleText("Hyderabad");
		
		driver.findElement(By.xpath("//button[@id='term_form_submit']")).click();  
		*/
	}

}
