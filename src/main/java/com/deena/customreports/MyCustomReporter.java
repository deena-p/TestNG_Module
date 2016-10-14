package com.deena.customreports;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.testng.IReporter;
import org.testng.ISuite;
import org.testng.ISuiteResult;
import org.testng.xml.XmlSuite;

public class MyCustomReporter implements IReporter{

	public void generateReport(List<XmlSuite> xmlSuites, List<ISuite> suites, String outputDirectory) {
		System.out.println("I am in My Custom reporter");
		
		for (ISuite suite: suites){
			System.out.println("Suite name is: " + suite.getName());
			Map<String, ISuiteResult> suiteResults = suite.getResults();
			
			Set<String> suiteResultsKey = suiteResults.keySet();
			
			Iterator<String> suiteResultIterator = suiteResultsKey.iterator();
			
			while(suiteResultIterator.hasNext()){
				System.out.println(suiteResultIterator.next());
			}
		}
	}

}
