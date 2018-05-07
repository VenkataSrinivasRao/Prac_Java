package tests;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.Properties;

public class PropertyFileReading {

	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		File f = new File(System.getProperty("user.dir")+"\\names.properties");
		FileOutputStream fos = new FileOutputStream(f,true);
		
		System.out.println("name  :---> "+prop.get("name"));
		prop.setProperty("Hello1","HI");
		prop.store(fos, "adding to property file");
		fos.close();
		FileInputStream fis = new FileInputStream(f);
		System.out.println();
		prop.load(fis);
		
		Enumeration<?>e = prop.propertyNames();
		while(e.hasMoreElements()){
			String key = (String) e.nextElement();
			String value = prop.getProperty(key);
			
			System.out.println("Key -->: "+ key +"   "+"value --> : "+value);
		}
			
		fis.close();

	}

	
	
}
