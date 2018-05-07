package tests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class TG_ITestListener implements ITestListener {

	@Override

    public void onStart(ITestContext arg0) {

         System.out.println("Start Of Execution(TEST)->"+arg0.getName());
         Reporter.log("Start Of Execution(TEST)->"+arg0.getName(),true);

    }

    @Override

    public void onTestStart(ITestResult arg0) {

//        System.out.println("Test Started->"+arg0.getName());
        Reporter.log("Test Started->"+arg0.getName(),true);

    }

    @Override

    public void onTestSuccess(ITestResult arg0) {

//        System.out.println("Test Pass->"+arg0.getName());
        Reporter.log("Test Pass->"+arg0.getName(),true);

    }

    @Override

    public void onTestFailure(ITestResult arg0) {

//        System.out.println("Test Failed->"+arg0.getName());
        Reporter.log("Test Failed->"+arg0.getName(),true);
        String URL = "https://www.google.co.in/?gfe_rd=cr&ei=jE2tWLmIM_TI8Aed-aEg&gws_rd=ssl";
        Reporter.log("<a href=" + URL+ ">click to open screenshot</a>");

    }

    @Override

    public void onTestSkipped(ITestResult arg0) {

//        System.out.println("Test Skipped->"+arg0.getName());
        Reporter.log("Test Skipped->"+arg0.getName(),true);

    }

    @Override

    public void onFinish(ITestContext arg0) {

//    	System.out.println("END Of Execution(TEST)->"+arg0.getName());
    	Reporter.log("END Of Execution(TEST)->"+arg0.getName(),true);

    }

    @Override

    public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {

        // TODO Auto-generated method stub

        

    }
	
	

}
