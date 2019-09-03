class Employee1
{
	int id;
	String name;
	
	Employee1()
	{
		System.out.println("Employee Constructor");
	}
}
class Developer extends Employee1
{
		String Skills;
		
		Developer()
		{
			super();
			System.out.println("Developer Constructor");
		}
		public static void main(String[] args)
		{
			Employee1 e1 = new Employee1();
			Developer d1 = new Developer(); //Developer constructor
		}
}

