package basics;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class AnnotationExample {

	@BeforeSuite
	public void beforeSuite()
	{
		System.out.println("Ececuting Before Suite");
	}
	
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Ececuting Before Test");
	}
	
	@BeforeClass
	public void beforeClass()
	{
		System.out.println("Ececuting Before Class");
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		System.out.println("Ececuting Before Method");
	}
	
	@Test
	public void testcase1()
	{
		System.out.println("Ececuting TestCase 1");
	}
	
	@Test
	public void testcase2()
	{
		System.out.println("Ececuting TestCase 2");
	}
	@AfterMethod
	public void afterMethod()
	{
		System.out.println("Ececuting After Method");
	}
	
	@AfterClass
	public void afterClass()
	{
		System.out.println("Ececuting After Class");
	}
	
	@AfterTest
	public void afterTest()
	{
		System.out.println("Ececuting After Test");
	}
	
	@AfterSuite
	public void afterSuite()
	{
		System.out.println("Ececuting After Suite");
	}
	
	
		
}
