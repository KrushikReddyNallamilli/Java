import java.util.Scanner;
class RacersDemo
{
	public static void main(String args[])
	{
		int arr[5];
		Scanner sc=new Scanner(System.in);
		int size=5;
		 for(int i=0;i<+arr.length;i++)
		{
			System.out.print("speed of["+i+"]racer:");
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements in array:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print("\t"+arr[i]);
		}
		System.out.println();
	}
}
