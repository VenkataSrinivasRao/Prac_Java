package tests;

import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(TG_ITestListener.class)
public class TG_ITestLisener_Test {

	
	
	 	@Test
	    public void testRealReportOne(){
	        
	 		Assert.assertTrue(true);
	    }
	    

	    @Test
	    public void testRealReportTwo(){

	        Assert.assertTrue(false);

	    }


	    @Test(dependsOnMethods="testRealReportTwo")

	    public void testRealReportThree(){

	    }
	    
}
