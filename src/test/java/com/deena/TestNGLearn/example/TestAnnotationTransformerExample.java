package com.deena.TestNGLearn.example;

import org.testng.annotations.Test;

public class TestAnnotationTransformerExample {
	
	@Test
	public void test1(String username, String password, String email, String city){
		System.out.println("Username is: " + username);
		System.out.println(username + " password is: " + password);
		System.out.println(username + " email is: " + email);
		System.out.println(username + " city is: " + city);
	}
	
	@Test
	public void test2(String username, String password, String email, String city){
		System.out.println("This is test2 for: " + username + " - " + password);
		System.out.println(username + " email is: " + email);
		System.out.println(username + " city is: " + city);
	}
	
	@Test
	public void test3(){
		System.out.println("This is test3");
	}

}
