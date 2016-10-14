package com.deena.TestNGLearn;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

//@Test(testName="yahoo_test")
public class YahooTest{

	SoftAssert softAssert = new SoftAssert();

	@Test(testName="test1_test")
	public void test1() {
		System.out.println("This is test1");
	}

	@Test(testName="test2_test")
	public void test2() {
		System.out.println("This is test2");
	}

	@Test(testName="test3_test")
	public void test3() {
		System.out.println("This is test3========================================");
		//throw new SkipException("This is for testing purpoose");

	}

	@Test(testName="test4_test")
	public void test4() {
		System.out.println("This is test4-----------------------------------------");
		softAssert.assertEquals("test4", "test3");
		try{
			Assert.assertEquals("test4", "test4");
		}catch(Throwable t){
			t.printStackTrace();
		}
		System.out.println("Test4 ends*********************************************");
		softAssert.assertAll();
	}

	@Test(enabled = false)
	public void test5() {
		softAssert.assertEquals("test4", "test3");
		System.out.println("This is test5");
		softAssert.assertAll();
	}

	@BeforeMethod
	public void beforeMethod() {
		System.out.println("This is before method");
	}

	@AfterMethod
	public void afterMethod() {
		System.out.println("This is after method");
	}

	@BeforeClass
	public void beforeClass() {
		System.out.println("This is before yahootest class");
	}

	@AfterClass
	public void afterClass() {
		System.out.println("This is after yahootest class");
	}

	@BeforeTest
	public void beforeTest() {
		System.out.println("This is before each test");
	}

	@AfterTest
	public void afterTest() {
		System.out.println("This is after each test");
	}

	@BeforeSuite
	public void beforeSuite() {
		System.out.println("This is before suite");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("This is after suite");
	}

}
