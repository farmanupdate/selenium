package JavaSession;

public class InterfaceDemo implements Showable {
	
	@Override
	public void print()
	{
		System.out.println("Printing");
	}
	
	@Override
	public int show(int n)
	{
		System.out.println("Showing");
		return n;
	}
	 public static void main(String[]args)
	 {
		 InterfaceDemo d = new InterfaceDemo();
		 d.print();
		 d.defaultmethod();
		 Showable.staticmethod();
		 int n = d.show(55);
		 System.out.println("n = " +n);
		 
	 }

}
