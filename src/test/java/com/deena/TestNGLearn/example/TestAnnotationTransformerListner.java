package com.deena.TestNGLearn.example;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.DataProvider;
import org.testng.annotations.ITestAnnotation;

import com.deena.TestNGLearn.YahooTestDataProvider;

public class TestAnnotationTransformerListner implements IAnnotationTransformer {

	public void transform(ITestAnnotation annotation, Class testClass, Constructor testConstructor, Method testMethod) {
		
		if (testMethod.getName().equals("test1")){
			System.out.println("set data provider for " + testMethod.getName());
			annotation.setDataProviderClass(YahooTestDataProvider.class);
			annotation.setDataProvider("regData");
		}

	}

}
