package Test;

import org.testng.annotations.Test;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class Day3 {
	
	@BeforeClass
	public void BforeClass()
	{
		System.out.println("Before Executing any Method in this Class");
	}
	
	@AfterClass
	public void AfterClass()
	{
		System.out.println("After Class will execute all the Method in the class");
	}
	
	@Test
	public void WeblogininCarLoan()
	{
		System.out.println("WebLoginCarLoan");
	}
	@Test
	public void MobileLogininCarLoan()
	{
		System.out.println("MobileLoginCarLoan");
	}
	@Test
	public void APICarLoan()
	{
		System.out.println("API Login Car Loan");
	}
	@BeforeSuite
	public void BeforeSuite()
	{
		System.out.println("I am Number One");
	}
	
	@Test
	public void MobileSigninCarLoan()
	{
		System.out.println("MobileSignIn");
	}
	@BeforeMethod
	public void BeforeEvery()
	{
		System.out.println("I will Execute before Every Methods to day 3 class");
	}
	@AfterMethod
	public void AfterEvery()
	{
		System.out.println("I will Execute After Every Methods to day 3 class");
	}
	
	@Test
	public void MobileSignOutCarLoan()
	{
		System.out.println("MobileSignOut");
	}
}

