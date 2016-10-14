package com.deena.TestNGLearn.Listners;

import org.testng.IExecutionListener;

public class MyCustomListner2 implements IExecutionListener {

	public void onExecutionStart() {
		System.out.println("TestNG started execution....");

	}

	public void onExecutionFinish() {
		System.out.println("Testng finished execution.....");

	}

}
