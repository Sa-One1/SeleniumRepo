package listeners;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ExtentReportListener implements ITestListener, IInvokedMethodListener {

    private ExtentReports extent;
    private ExtentTest test;

    @Override
    public void onStart(ITestContext context) {
        // Initialize ExtentSparkReporter
    	ExtentSparkReporter extentSparkReporter = new ExtentSparkReporter("target/ExtentReports/extentReport.html");
        extent = new ExtentReports();
        extent.attachReporter(extentSparkReporter);
    }

    @Override
    public void onFinish(ITestContext context) {
        // Write the test results to the report
        extent.flush();
    }

    @Override
    public void onTestStart(ITestResult result) {
        // Create a test in the report
        test = extent.createTest(result.getMethod().getMethodName());
    }

    @Override
    public void onTestSuccess(ITestResult result) {
        // Mark the test as passed
        test.pass("Test Passed");
    }

    @Override
    public void onTestFailure(ITestResult result) {
        // Mark the test as failed and capture the exception
        test.fail(result.getThrowable());
    }

    @Override
    public void onTestSkipped(ITestResult result) {
        // Mark the test as skipped
        test.skip("Test Skipped");
    }

    @Override
    public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
        // This is invoked when a test fails but the failure is within the success percentage
    }

    @Override
    public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
        // You can add any logic before method execution if needed
    }

    @Override
    public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
        // You can add any logic after method execution if needed
    }
}

