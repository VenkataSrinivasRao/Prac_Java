package tests;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestPolymer {

	WebDriver driver;
	WebDriverWait wait ;
	
	@BeforeTest
	public void setUp() {
		
		System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir")+"\\src\\lib\\geckodriver.exe");
		System.setProperty("webdriver.ie.driver", System.getProperty("user.dir")+"\\src\\lib\\IEDriverServer32.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\src\\lib\\chromedriver.exe");
		
//		System.out.println("Opening chrome browser");
		
//		driver = new FirefoxDriver();
		driver = new InternetExplorerDriver();
		
//		driver = new ChromeDriver();
	}

	
	
	
	public WebElement expandRootElement(WebElement element) {
		WebElement ele = (WebElement) ((JavascriptExecutor)driver).executeScript("return arguments[0].shadowRoot",element);
		return ele;
	}

	@Test(enabled=false)
	public void testGetText_FromShadowDOMElements() {
		
		driver.get("chrome://downloads/");
		
		System.out.println("Validate downloads page header text");
		WebElement root1 = driver.findElement(By.tagName("downloads-manager"));

                //Get shadow root element
		WebElement shadowRoot1 = expandRootElement(root1);

		WebElement root2 = shadowRoot1.findElement(By.cssSelector("downloads-toolbar"));
		WebElement shadowRoot2 = expandRootElement(root2);

		WebElement root3 = shadowRoot2.findElement(By.cssSelector("cr-toolbar"));
		WebElement shadowRoot3 = expandRootElement(root3);

		String actualHeading = shadowRoot3.findElement(By.cssSelector("div[id=leftContent]>h1")).getText();
		// Verify header title
		
		System.out.println("actualHeading:---> "+ actualHeading);
		Assert.assertEquals("Downloads1", actualHeading);

	}
	
	@Test(enabled=true)
	public void testClickMenuItem_And_ValidatePageHeader() throws InterruptedException {
		System.out.println("Open Online Shop");
		driver.get("https://shop.polymer-project.org/");
		
		wait = new WebDriverWait(driver, 5);
		By byMenu = By.linkText("Ladies Outerwear");
		wait.until(ExpectedConditions.visibilityOfElementLocated(byMenu));
		driver.findElement(byMenu).click();
		
		//Validate Page title
		By byHeading = By.cssSelector("header>h1");
		wait.until(ExpectedConditions.presenceOfElementLocated(byHeading));
		
		String getActualHeaderText = driver.findElement(byHeading).getText();
		Assert.assertEquals(getActualHeaderText, "Ladies Outerwear");
	}

}
