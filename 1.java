import java.util.Scanner;

public class Add{
	public static void main(String[] args){
		System.out.println("Input the first number to add");
		Scanner scan=new Scanner(System.in);
		int num1 = scan.nextInt();
		System.out.println("input the second number to add");
		Scanner scan = new Scanner(System.in);
		int num2 = scan.nextInt();
		int num3 = num1 + num2;
		System.out.println("The answer: "+num3);
	}
}