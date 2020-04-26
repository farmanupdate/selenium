package JavaSession;

public class Basicjavasession_1 {
	
	//Instance variables
	private int EmpId;
	private String EmpName;
	private float Salary;
	
	public Basicjavasession_1() //Default constructor
	{
		System.out.println("Default constructor invoked");
		EmpId = 111;
		EmpName = "Farman";
		Salary = 450000.55f;
		
	}
	
	public Basicjavasession_1(int EmpId, String EmpName, float Salary) //Parameterized constructor
	
	{
		//removing the shadowing of the instance variable
		this.EmpId = EmpId;
		this.EmpName = EmpName;
		this.Salary = Salary;
		
	}
	
	public void display()
	{
		System.out.println("Employee Details = "+EmpId+", "+EmpName+", "+Salary);
	}
	
	public static void main(String[] args) {
		
		Basicjavasession_1 e = new Basicjavasession_1();
		e.display();
		
				
		
	}

}
