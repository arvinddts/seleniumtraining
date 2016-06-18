package testng;

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

public class Testngdemo2
{
/*	@BeforeSuite(alwaysRun=true)
	public void suite()
	{
		System.out.println("I am in Before suite method");
	}
	
	@BeforeClass(alwaysRun=true)
	public void setup1()
	{
		System.out.println("I am in Before class method");
	}
	
	@BeforeTest(alwaysRun=true)
	public void Test1()
	{
		System.out.println("I am in Before Test Method");
	}
	
	@BeforeMethod(alwaysRun=true)
	public void method1()
	{
		System.out.println("I am in Before Method");
	}
	*/
	@Test (groups = {"group1"})
	public void Testmethod1()
	{
		System.out.println("I am in @Test Method1");
	}
	
	@Test (groups = {"group2"})
	public void Testmethod2()
	{
		System.out.println("I am in @Test Method2");
	}
	
	@Test (groups = {"group3"})
	public void Testmethod3()
	{
		System.out.println("I am in @Test Method3");
	//	Assert.fail();
	}
	
	@Test (groups = {"group1"})
	public void Testmethod4()
	{
		System.out.println("I am in @Test Method4");
	}
	
	@Test (groups = {"group2"})
	public void Testmethod5()
	{
		System.out.println("I am in @Test Method5");
	}
	
	@AfterMethod(alwaysRun=true)
	public void method2()
	{
		System.out.println("I am in After Method");
	}
	
	@Test (groups = {"test4"},dependsOnGroups = { "group.*" })
	public void Testmethod6()
	{
		System.out.println("I am in @Test Method6");
	}
	
	/*
	@AfterTest
	public void Test2()
	{
		System.out.println("I am in After Test Method");
	}
	
	@AfterClass
	public void setup2()
	{
		System.out.println("I am in After class method");
	}
	
	@AfterSuite
	public void suite2()
	{
		System.out.println("I am in After suite method");
	} */
}

