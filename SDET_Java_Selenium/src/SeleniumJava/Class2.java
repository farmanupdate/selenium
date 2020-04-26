package SeleniumJava;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class2 {
  
	@BeforeTest
	public void BTest2()
	{
		System.out.println("This is Before Test2");
	}
	
	@BeforeClass
	public void BClass2()
	{
		System.out.println("This is before second class");
	}
	
	@AfterClass
	public void AClass2()
	{
		System.out.println("This is after second class");
	}
	
	@Test
    public void Test2() 
    {
	   System.out.println("This is Second class - Test2");
    }
	
	@Test
    public void Test3() 
    {
	   System.out.println("This is Second class - Test3");
    }
	
	@AfterTest
	public void ATest2()
	{
		System.out.println("This is After Test2");
	}
}
