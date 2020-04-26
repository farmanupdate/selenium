package JavaSession;

public interface Showable extends Printable{
	
	default void defaultmethod()
	{
		System.out.println("This is default method");
	}
	
	static void staticmethod()
	{
		System.out.println("This is static method");
	}
	
	public abstract int show(int n);

}
