import java.util.Scanner;

class Employee
{
	int emp_Id;
	String emp_Name,dept;
	float basic,hra,tax,totalSal;
	Scanner s;
	
	void input()
	{
		s = new Scanner(System.in);
		System.out.println("Enter Employee _Id, Name, Department & Basic Salary");
		emp_Id = s.nextInt();
		emp_Name = s.next();
		dept = s.next();
		basic  = s.nextFloat();
	}
	
	void calculateSal()
	{
		hra = basic*.10f;
		tax = basic*.05f;
		totalSal = (basic+hra)-tax;
		//return totalSal;
	}
	
	void display()
	{
		System.out.println("The Employee Details :");
		System.out.println("Employee Id :"+emp_Id);
		System.out.println("Employee Name :"+emp_Name);
		System.out.println("Department :"+dept);
		System.out.println("Total Salary :"+totalSal);	
	}
}