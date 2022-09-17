package Tests;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class listener implements ITestListener {

    ExtentReports extent = new ExtentReports();
    ExtentTest test;

    @Override
    public void onTestStart(ITestResult result){
        //init extent reports... on whatever way You do it...
        test = extent.createTest(result.getMethod().getMethodName());

    }

    @Override
    public void onTestSuccess(ITestResult result) {
        test.log(Status.PASS,"Successful");
    }


    @Override
    public void onTestFailure(ITestResult result) {
        test.fail(result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
    }








    @Override
    public void onFinish(ITestContext context){
    }

}
