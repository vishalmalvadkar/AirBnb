package org;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SuitTest {
	@BeforeSuite	
	public void beforeSuite( ) 
	{
		
		System.out.println("before suit");
	}
	
	@BeforeTest
	@Parameters("testdata")
	public void beforeTest(String data) {
		System.out.println(data);
		System.out.println("before test");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("before method");
	}
	
	@Test
	public void test() {
		System.out.println("test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("after method");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("after class");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("after test");
	}
	
	@AfterSuite
	public void afterSuit() {
		System.out.println("after suit");
	}
	
	

}
