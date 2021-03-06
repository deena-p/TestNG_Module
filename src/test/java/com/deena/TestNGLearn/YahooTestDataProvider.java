package com.deena.TestNGLearn;

import java.lang.reflect.Method;

import org.testng.annotations.DataProvider;

public class YahooTestDataProvider {
	
	@DataProvider(name="regData")
	public static Object[][] registration_data(){
		Object[][] data = new Object[4][4];
		
		data[0][0] = "Sachin";
		data[0][1] = "password1";
		data[0][2] = "sachin@test.com";
		data[0][3] = "Mumbai";
		
		data[1][0] = "Saurav";
		data[1][1] = "password2";
		data[1][2] = "saurav@test.com";
		data[1][3] = "Kolkata";
		
		data[2][0] = "Dhoni";
		data[2][1] = "password3";
		data[2][2] = "dhoni@test.com";
		data[2][3] = "Chennai";
		
		data[3][0] = "Rahul";
		data[3][1] = "password4";
		data[3][2] = "rahul@test.com";
		data[3][3] = "Banglore";
		
		return data;
	}

	@DataProvider(name="commonData")
	public static Object[][] common_data(Method m){
		Object[][] data = null;
		
		if (m.getName().equals("registration_test1")){
			data = new Object[2][2];
			data[0][0] = "Sachin";
			data[0][1] = "password1";
						
			data[1][0] = "Saurav";
			data[1][1] = "password2";
		}else if (m.getName().equals("registration_test2")){
			data = new Object[2][3];
			data[0][0] = "Sachin";
			data[0][1] = "password1";
			data[0][2] = "sachin@test.com";
			
			data[1][0] = "Saurav";
			data[1][1] = "password2";
			data[1][2] = "saurav@test.com";
		}else{
			data = new Object[4][4];
			data[0][0] = "Sachin";
			data[0][1] = "password1";
			data[0][2] = "sachin@test.com";
			data[0][3] = "Mumbai";
			
			data[1][0] = "Saurav";
			data[1][1] = "password2";
			data[1][2] = "saurav@test.com";
			data[1][3] = "Kolkata";
			
			data[2][0] = "Dhoni";
			data[2][1] = "password3";
			data[2][2] = "dhoni@test.com";
			data[2][3] = "Chennai";
			
			data[3][0] = "Rahul";
			data[3][1] = "password4";
			data[3][2] = "rahul@test.com";
			data[3][3] = "Banglore";
		}
		
		
		
		return data;
	}
}
