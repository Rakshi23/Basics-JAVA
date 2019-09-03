class ConstructorDemo
{
	ConstructorDemo()
	{
		System.out.println("In Constructor");
	}
	
	void Display()
	{
		System.out.println("Display Method");
	}
	
	public static void main(String[] args)
	{
		ConstructorDemo c1 = new ConstructorDemo();
		ConstructorDemo c2 = new ConstructorDemo();
		ConstructorDemo c3 = new ConstructorDemo();
		c1.Display();
	}
}