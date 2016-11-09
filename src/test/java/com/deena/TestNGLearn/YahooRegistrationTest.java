package com.deena.TestNGLearn;

import org.testng.annotations.Test;

public class YahooRegistrationTest {
	
	@Test( testName="Yahoo Reg. Test",dataProviderClass=YahooNewsRegTestDataProvider.class,dataProvider="regData", enabled=false)
	public void registration_test(String username, String password, String email, String city){
		System.out.println("Username is: " + username);
		System.out.println(username + " password is: " + password);
		System.out.println(username + " email is: " + email);
		System.out.println(username + " city is: " + city);
	}
	
	@Test(testName="Yahoo Reg. Test1",dataProviderClass=YahooTestDataProvider.class,dataProvider="commonData", enabled=false)
	public void registration_test1(String username, String password){
		System.out.println("Username is: " + username);
		System.out.println(username + " password is: " + password);
	}
	
	@Test(testName="Yahoo Reg. Test2",dataProviderClass=YahooTestDataProvider.class,dataProvider="commonData", enabled=false)
	public void registration_test2(String username, String password, String email){
		System.out.println("Username is: " + username);
		System.out.println(username + " password is: " + password);
		System.out.println(username + " email is: " + email);
	}
	
	@Test(testName="Yahoo Reg. Test3",dataProviderClass=YahooTestDataProvider.class,dataProvider="commonData",enabled=false,invocationCount=2)
	public void registration_test3(String username, String password, String email, String city){
		System.out.println("Username is: " + username);
		System.out.println(username + " password is: " + password);
		System.out.println(username + " email is: " + email);
		System.out.println(username + " city is: " + city);
	}
	
	@Test(dataProviderClass=YahooNewsRegTestDataProvider.class,dataProvider="myregCommonData", invocationCount=1)
	public void reg_test4(String un, String pw, String email, String city){
		System.out.println("Username is: " + un);
		System.out.println(un + " password is: " + pw);
		System.out.println(un + " email is: " + email);
		System.out.println(un + " city is: " + city);
	}
	

}
