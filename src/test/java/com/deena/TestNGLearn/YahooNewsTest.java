package com.deena.TestNGLearn;

import org.testng.Assert;
import org.testng.annotations.Test;

public class YahooNewsTest {
	
	
  @Test(priority=1)
  public void News_Test1() {
	  System.out.println("This is yahoo news test1");
	  Assert.assertEquals("test1", "test1");
  }
  
  @Test(priority=2)
  public void News_Test2() {
	  System.out.println("This is yahoo news test2");
	  Assert.assertEquals("test2", "test2");
  }
  
  @Test(priority=3,dependsOnMethods={"News_Test1","News_Test2"})
  public void News_Test3() {
	  System.out.println("This is yahoo news test3");
	  Assert.assertTrue(1<4, "Failed because of some issue");
  }
  
}
