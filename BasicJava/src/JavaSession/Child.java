package JavaSession;

public class Child extends Parent
{

	public Child()
	{
		System.out.println("Child Class default constructor");
	}
	
	public Child(int no)
	{
		super(45,"Farman");
		System.out.println("Child Class parameterized constructor");
	
	}
	
	public static void main(String[]args)
	{
		Child c = new Child(10);
		
	}
	
}
