import java.util.Scanner;

class Person{
	private String name;
	private int age;
	private String constituency;
	Scanner s;
	
	Person() //Default Constructor
	{
		System.out.println("voter Eligiblity App");
		age = 0;
		name = "";
		constituency = "Bengaluru";
		s = new Scanner(System.in);
	}
	
	Person(String n,int a) //parameterized constructor
	{
		name = n;
		age = a;
	}
	
	Person(String n,int a,String c) //parameterized constructor
	{
		name = n;
		age = a;
		constituency = c;
	}
	
	public void input()
	{
		System.out.println("Enter Your Name:");
		name = s.next();
		System.out.println("Enter Your age:");
		age = s.nextInt();
		System.out.println("Enter Your constituency:");
		constituency = s.next();
	}
	
	public void print()
	{
		System.out.println("Name is: "+name);
		System.out.println("Age is: "+age);
		System.out.println("Constituency is: "+constituency);
		
	}
	
	public void eligible()
	{
		if(age>18)
			System.out.println("You are eligible to vote.Please do your duty");
	}
}

class PersonTest
{
	public static void main(String[] args)
	{
		Person objPerson = new Person();						//invokes default constructor
		Person objPerson1 = new Person("Raj",30);				//invokes parameterized constructor
		Person objPerson2 = new Person("Mike",50,"Delhi");		//invokes parameterized constructor
		
		objPerson.input();
		objPerson.eligible();
		objPerson.print();

		
		objPerson1.eligible();
		objPerson1.print();
		
		objPerson2.eligible();
		objPerson2.print();
	}
}