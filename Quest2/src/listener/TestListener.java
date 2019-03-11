package listener;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class TestListener implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test Started");
		
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test Pass");
		
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test Fail");
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test Skip");
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		System.out.println("Success Percentage");
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Start of the prog");
		
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Completion");
		
	}

}
