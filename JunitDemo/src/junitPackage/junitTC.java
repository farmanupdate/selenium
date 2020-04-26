package junitPackage;



import org.junit.Assert;
import org.junit.Test;


public class junitTC {

	@Test
	public void test() 
	{
		junitnormalclass a = new junitnormalclass();
		
		int Result = a.add(4, 5);
		Assert.assertEquals(9,Result);	
	}

}
