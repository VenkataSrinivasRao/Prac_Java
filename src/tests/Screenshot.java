package tests;

import java.awt.Point;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Screenshot {
	
	 public static void elementScreenShot(WebDriver driver, WebElement element, String fileName) throws IOException {
	        //call the screenshot function so it takes the screenshot as image
	        File screen = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);

	        //get location of the element
	        org.openqa.selenium.Point point = element.getLocation();

	        //get the height of the element
	        int width = element.getSize().getWidth();

	        //get the width of the element
	        int height = element.getSize().getHeight();

	        //read the image
	        BufferedImage img = ImageIO.read(screen);

	        int elementX = point.getX();
	        int elementY = point.getY();

	        BufferedImage dest = img.getSubimage(elementX, elementY, width, height);
	        ImageIO.write(dest, "png", screen);

	        //save the image on specific path
	        FileUtils.copyFile(screen, new File(fileName));
	    }
}
