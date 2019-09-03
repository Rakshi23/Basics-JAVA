import java.util.Scanner;

class Student
{
	int Rollno;
	String Std_Name,Branch;
	float Sub1,Sub2,Sub3,Sub4,Sub5;
	Scanner s;
	float Avg;
	
	void input()
	{
		s = new Scanner(System.in);
		System.out.println("Enter Rollno, Name, Branch");
			Rollno = s.nextInt();
			Std_Name = s.next();
			Branch = s.next();
		System.out.println("Enter Marks of Subject 1:");
			Sub1  = s.nextFloat();
		System.out.println("Enter Marks of Subject 2:");
			Sub2  = s.nextFloat();
		System.out.println("Enter Marks of Subject 3:");
			Sub3  = s.nextFloat();
		System.out.println("Enter Marks of Subject 4:");
			Sub4  = s.nextFloat();
		System.out.println("Enter Marks of Subject 5:");
			Sub5  = s.nextFloat();
	}
	
	void calculateAvg()
	{
		Avg = (Sub1+Sub2+Sub3+Sub4+Sub5)/5;	
		System.out.println("----------------------------------------------------------------------------------------------");	
			if(Avg>50&&Avg<60){			
				System.out.println("Result is Second Class");
				System.out.println("Aim for Better");
			}
							
			else if(Avg>60&&Avg<85){
				System.out.println("Result is First Class");
				System.out.println("Very Good!!!!!!!!!");
			}
							
			else if(Avg>85){
				System.out.println("Result is Distinction");
				System.out.println("Congratulations!!!!!!!!!");
			}
						
				
			else
				System.out.println("Result is Fail");		//return Avg;
	}
	
	void display()
	{
		System.out.println("The particular student Details are:");
		System.out.println("Rollno :"+Rollno);
		System.out.println("Student Name :"+Std_Name);
		System.out.println("Branch :"+Branch);
		System.out.println("Result :"+Avg);	
		System.out.println("********************************************************************************************************************************");
	}
}