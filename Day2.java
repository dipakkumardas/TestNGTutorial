package Test;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 
{	
	@Test
	public void ploan()
	{
		System.out.println("Good");
	}
	@BeforeTest
	public void prereqriste()
	{
		System.out.println("I Will Execute First");
	}
	
}
