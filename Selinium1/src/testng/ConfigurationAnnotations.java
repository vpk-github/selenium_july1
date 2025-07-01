package testng;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ConfigurationAnnotations {

	
	@BeforeSuite
	public void beforeSuit()
	{
		Reporter.log("Before Suit executed",true);		
	}
	
	@BeforeTest
	public void beforeTest()
	{
		Reporter.log("before test executed",true);
	}
	
	@BeforeClass
	public void beforeClass()
	{
		Reporter.log("before class executed",true);
	}
	
	@BeforeMethod
	public void beforeMethod()
	{
		Reporter.log("before method", true);
	}
	
	@Test
	public void demo()
	{
		Reporter.log("demo executed",true);
	}
	
	@Test
	public void sample()
	{
		Reporter.log("sample executed",true);
	}
	
	@AfterMethod
	public void afterMethod()
	{
		Reporter.log("after method", true);
	}
	
	@AfterTest
	public void afterTest()
	{
		Reporter.log("after test executed",true);
	}
	
	@AfterClass
	public void afterClass()
	{
		Reporter.log("after class executed",true);
	}
	
	@AfterSuite
	public void afterSuit()
	{
		Reporter.log("After Suite executed", true);
	}
	
}
