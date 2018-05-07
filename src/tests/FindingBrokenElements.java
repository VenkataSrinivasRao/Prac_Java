package tests;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class FindingBrokenElements {
	
	public static WebDriver wd;

	public static void main(String[] args) {
		
		WebDriver wd=new FirefoxDriver();
        wd.manage().window().maximize();
        wd.get("http://www.google.co.in/");
        
        List<WebElement> anchors = wd.findElements(By.tagName("a")); // get all anchors in page
        System.out.println("Found" +anchors.size()+ "anchors on the page");
        for(int i= 0;i<anchors.size();i++)
        {
        	WebElement wbel = anchors.get(i);
        	String urlname = wbel.getAttribute("href"); // get value of href for every anchor
        	verifyLinkBroken(urlname); // validate the connection for every anchor by calling the function
        	
        }

        System.out.println("Test completed closing the browser");
        wd.quit();

	}

	private static void verifyLinkBroken(String urlname) { // Function will open connection for url and try to connect
		try{
			URL url = new URL(urlname);
			HttpURLConnection httpURLConnect = (HttpURLConnection)url.openConnection();
			httpURLConnect.setConnectTimeout(4000);
			httpURLConnect.connect();
			if(httpURLConnect.getResponseCode()==200) // reponse code = 200(ok) success
			{
				System.out.println(urlname+"->"+httpURLConnect.getResponseMessage());
			}
			if(httpURLConnect.getResponseCode()==HttpURLConnection.HTTP_NOT_FOUND) // error 404 
			{
				System.out.println(urlname+"->"+httpURLConnect.getResponseMessage()+":"+HttpURLConnection.HTTP_NOT_FOUND);
			}
		}catch(Exception e){
			
		}
		
	}
	
}

