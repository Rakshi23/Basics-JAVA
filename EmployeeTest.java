class EmployeeTest
{
	public static void main(String[] args)
	{
		Employee e1 = new Employee(); //Object Declaration
		Employee e2 = new Employee();
		
		e1.input();//method call
		//float s = e1.CalculateSal();
		e1.calculateSal();
		e1.display();
		//System.out.println("The total salary displayed from Main:"+s);
		
		e2.input();
		//float s1 = e2.calculateSal();
		e2.calculateSal();
		e2.display();
		//System.out.println("The total salary displayed from Main:"+s1);

	}
}