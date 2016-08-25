package com.deena.TestNGLearn.Listners;

import org.testng.IInvokedMethod;
import org.testng.IInvokedMethodListener;
import org.testng.ITestResult;
import org.testng.TestListenerAdapter;

public class MyCustomListner extends TestListenerAdapter implements IInvokedMethodListener{

	@Override
	public void onTestFailure(ITestResult tr) {
		super.onTestFailure(tr);
		System.out.println("Listner report: Test failed. Name: " + tr.getName() + ". TestName: " + tr.getTestName());
	}
	
	@Override
	public void onTestStart(ITestResult result) {
		super.onTestStart(result);
		System.out.println("Listner report: Test started. Name: " + result.getName() + ". TestName: " + result.getTestName());
	}
	
	@Override
	public void onTestSkipped(ITestResult tr) {
		super.onTestSkipped(tr);
		System.out.println("Listner report: Test skipped. Name: " + tr.getName() + ". TestName: " + tr.getTestName());
	}
	
	@Override
	public void onTestSuccess(ITestResult tr) {
		super.onTestSuccess(tr);
		System.out.println("Listner report: Test succeed. Name: " + tr.getName() + ". TestName: " + tr.getTestName());
	}

	public void beforeInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}

	public void afterInvocation(IInvokedMethod method, ITestResult testResult) {
		// TODO Auto-generated method stub
		
	}
}
