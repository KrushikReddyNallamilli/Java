import java.util.Scanner;
class ArrayTest
{
	public static void main(String args[])
	{
		//Declaring the array
		int arr[];
		//creating scanner class object
		Scanner sc=new Scanner(System.in);
		//reading the size of the array
		System.out.print("Enter the number of elements");
		int n=sc.nextInt();
		//allocating memory as per the size to array
		arr=new int[n];
		//reading values into elements
		 for(int i=0;i<arr.length;i++)
		{
			System.out.print("arr["+i+"]:");
			arr[i]=sc.nextInt();
		}
		//printing elements in array
		System.out.println("Elements in array:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("\t"+arr[i]);
		}
		System.out.println();
	}
}