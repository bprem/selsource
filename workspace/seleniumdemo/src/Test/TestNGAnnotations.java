package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestNGAnnotations {

	
	
	@Test(priority=1)//Test Ng always runs method using maning conventions , to avoid this we can use priority, so that it will run according to that priority.
	public void methd1()
	{
		System.out.println("This is my first @test");
	}
	
	@BeforeTest
	public void methd2()
	{
		System.out.println("his is my before test");
	}
	
	@AfterTest
	public void methd3()
	{
		System.out.println("Yhis is my AFter test");
	}
	
	@BeforeClass
	public void methd4()
	{
		System.out.println("this is my before class");
	}
	
	@AfterClass
	public void methd5()
	{
	System.out.println("this os my after class");	
	}
	
	@Test(enabled=false)//if we dont want this @test use this (enabled=false)
	public void methd6()
	{
		System.out.println("This is my second @test");
	}
	
	@BeforeSuite
	public void methd7()
	{
		System.out.println("This my Beforesuite");
	}
	@AfterSuite
	public void methd8()
	{
	System.out.println("This is my After suite");	
	}
	@BeforeMethod
	public void methd9()
	{
		System.out.println("This is my before method");
	}
	
	@AfterMethod
	public void methd10()
	{
		System.out.println("Thsi mis my after method");
	}
	@Test(priority=2)
	public void Methd10()
	
	{
		System.out.println("Thsi is my priority @test");
	}
}
