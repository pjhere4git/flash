package listenerssDemo;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listennnnnn implements ITestListener {

	@Override
	public void onFinish(ITestContext arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void onStart(ITestContext arg0) {
		
		
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
		
	}

	@Override
	public void onTestFailure(ITestResult Resu) {
		
		System.out.println("The name of the testcase is failed"+Resu.getName());
		
	}

	@Override
	public void onTestSkipped(ITestResult Resu) {
		
		System.out.println("The name of the testcase is Skipped"+Resu.getName());
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		System.out.println("Test case is started");
		
	}

	@Override
	public void onTestSuccess(ITestResult Resu) {
		
		System.out.println("The name of the testcase is failed"+Resu.getName());	
	}

	

}
