package Test;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1{
	
	@AfterTest
	public void LastExecution()
	{
		System.out.println("I Will Execute on Last");
	}
	
	@Test
	public void Demo()
	{
		System.out.println("Hello");
	}
	
	@AfterSuite
	public void AfterSuite()
	{
		System.out.println("I Am The  No 1 Last");
	}
	
	@Test
	public void SecondTest()
	{
		System.out.println("Bye");
	}

}
