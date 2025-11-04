package TestNGTests;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener {

    // Called when a test starts
    @Override
    public void onTestStart(ITestResult result) {
        System.out.println("🚀 Test Started: " + result.getName());
    }

    // Called when a test succeeds
    @Override
    public void onTestSuccess(ITestResult result) {
       // System.out.println("I successfully executed Listeners pass code"  );
    }

    // Called when a test fails
    //screenshot code 
    @Override
    public void onTestFailure(ITestResult result) {
        System.out.println("I failed executed Listeners pass code"+ result.getName());
    }

    // Called when a test is skipped
    @Override
    public void onTestSkipped(ITestResult result) {
        System.out.println("⚠️ Test Skipped: " + result.getName());
    }

    // Called when a test fails but within success percentage
    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        System.out.println("⚠️ Test Failed but within success %: " + result.getName());
    }

    // Called before any test method is invoked
    @Override
    public void onStart(ITestContext context) {
        System.out.println("🏁 Test Suite Started: " + context.getName());
    }

    // Called after all test methods have run
    @Override
    public void onFinish(ITestContext context) {
        System.out.println("🏁 Test Suite Finished: " + context.getName());
    }
}
