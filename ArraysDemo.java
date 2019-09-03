import java.util.Scanner;
public class ArraysDemo{
	public static void main(String[] args)
	{
		int n,i;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter Array size: ");
		n = s.nextInt();
		int nums[] = new int[n];
		System.out.println("Enter Array Elements: ");
		for(i=0;i<n;i++)
		{
			nums[i] = s.nextInt();
			
		}
		System.out.println("Number of elements in an array is: "+nums.length);
		System.out.println("First element in an array is: "+nums[0]);
		System.out.println("Last element in an array is: "+nums[nums.length-1]);
		
		System.out.println("************************");
		System.out.println("The Array contents are:");
		for(int j:nums)
			System.out.println(j);
		
		/*for(i=0;i<n;i++)
		{
			System.out.println(nums[i]);
		}
		*/
	}
}
