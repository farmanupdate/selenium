package JavaSession;

//Inheritance

public class B extends A //Sub Class
{
	
	int b = 11;
	
	public void getMsg()
	{
		System.out.println("IN getMsg() of class B");
		
	}
	
	public static void main(String[]args)
	{
		
		//A is dynamic datatype
		A b = new B();
		
		b.Get();
		System.out.println("no = "+b.no);
		((B) b).getMsg(); //Downcasting to call subclass
	}
	

}
