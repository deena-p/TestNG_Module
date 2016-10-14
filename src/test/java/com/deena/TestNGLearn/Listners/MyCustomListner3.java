package com.deena.TestNGLearn.Listners;

import org.testng.IExecutionListener;

public class MyCustomListner3 implements IExecutionListener {

	public void onExecutionStart() {
		System.out.println("Notification email: test starts");

	}

	public void onExecutionFinish() {
		System.out.println("Notification email: test ends");

	}

}
