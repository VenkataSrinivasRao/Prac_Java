package tests;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utility {

	public static String captureScreenshot(WebDriver driver,String screenshotName)
		{
	 
		String path = null;
		try 
			{
				TakesScreenshot ts=(TakesScreenshot)driver;
				 
				File source=ts.getScreenshotAs(OutputType.FILE);
				
				path = "C:\\Report\\"+screenshotName+".png";
				File f = new File(path);
				 
				FileUtils.copyFile(source,f);
				 
				System.out.println("Screenshot taken");
			} 
		catch (Exception e)
			{
	 
				System.out.println("Exception while taking screenshot "+e.getMessage());
			}
		return path;
		
		}
	
}
