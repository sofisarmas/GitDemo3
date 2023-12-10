package selenium;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersDemo implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test start");
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test success");
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test fail");
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test skip");
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test Finish");
	}

}
