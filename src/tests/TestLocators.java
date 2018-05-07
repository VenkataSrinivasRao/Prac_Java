package tests;

import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.firefox.internal.ProfilesIni;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.server.handler.ExecuteScript;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TestLocators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\lib\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\\lib\\IEDriverServer32.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\lib\\chromedriver.exe");
		
		ProfilesIni prof = new ProfilesIni();
		FirefoxProfile p = prof.getProfile("sri");
		
		WebDriver driver = new FirefoxDriver(p);
//		WebDriver driver = new ChromeDriver();
//		WebDriver driver = new InternetExplorerDriver();

		driver.manage().window().maximize();
		driver.get("http://www.cigniti.com/contact-us");
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		
		int winSize = driver.getWindowHandles().size();
		System.out.println("winSize before opening tab :--- > "+ winSize);
		
//		driver.findElement(By.id("edit-submitted-name")).sendKeys("Hello");
		
	/*	System.out.println(driver.findElement(By.id("edit-submitted-name")).getAttribute("name"));
		Thread.sleep(2000);
		driver.findElement(By.id("edit-submitted-name")).clear();
		Thread.sleep(2000);
		driver.findElement(By.id("edit-submitted-name")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("edit-submitted-name")).sendKeys("Hello");*/
		
//		driver.findElement(By.cssSelector("")).sendKeys("Hello");

//		driver.findElement(By.name("op")).click();
		
		
		/*Actions action = new Actions(driver);
//		action.contextClick().perform();
		action.contextClick(driver.findElement(By.id("edit-submitted-name"))).build().perform();
		
		Not Working */
	/*	System.out.println("opening new tab");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL + "t");
		driver.findElement(By.cssSelector("body")).sendKeys(Keys.chord(Keys.CONTROL,"a"));


		driver.get("http://www.cigniti.com");
		
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.MILLISECONDS);
		int anchTags = driver.findElements(By.tagName("a")).size();
		
		
		System.out.println("anchor tags size : --- > "+ anchTags) ;
		
		winSize = driver.getWindowHandles().size();
		
		System.out.println("winSize after opening tab :--- > "+ winSize);
		Set<String> winds =  driver.getWindowHandles();
		Iterator<String> iter = winds.iterator();
		driver.switchTo().window(iter.next());
		
		
		driver.findElement(By.id("edit-submitted-name")).sendKeys("Hello");
		*/
		System.out.println(driver.getClass().getSimpleName());
		
	Select s = new Select(driver.findElement(By.id("edit-submitted-name")));
	s.getFirstSelectedOption();
	WebDriverWait wait = new WebDriverWait(driver,20);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("")));
	/*
	 * some operations
	 */

	
	}

}
