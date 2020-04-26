package SeleniumJava;


import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Class1 {
  
	@BeforeTest
	public void BTest1()
	{
		System.out.println("This is Before Test1");
	}
		
	@BeforeClass
	public void BClass1()
	{
		System.out.println("This is before first class");
	}
	
	@AfterClass
	public void AClass1()
	{
		System.out.println("This is after first class");
	}
	
	@Test
    public void Test1() 
    {
	   System.out.println("This is first class - Test1");
    }
	
	@AfterTest
	public void ATest1()
	{
		System.out.println("This is After Test1");
	}
}
