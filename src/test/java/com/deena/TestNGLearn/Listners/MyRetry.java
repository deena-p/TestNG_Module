package com.deena.TestNGLearn.Listners;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetry implements IRetryAnalyzer {

	private int retryCount = 0;
	private int retryMaxCount = 1;
	
	public boolean retry(ITestResult result) {
		if (retryCount<retryMaxCount){
			String resultName = result.getName();
			String resultStatus = getResultStatusName(result.getStatus());
			
			System.out.println(resultName + " status is : " + resultStatus + "and retrying count is " + retryCount+1);
			retryCount++;
			
		}
		
		return false;
	}

	private String getResultStatusName(int status) {
		
		if (status == 1){
			return "SUCCESS";
			
		}else if (status == 2){
			return "FAILURE";
		}else {
			return "SKIP";
		}
		
	}

}
