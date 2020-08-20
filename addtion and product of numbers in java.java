import java.lang.*;
import java.util.Scanner;
class Numberdemo2
{
	public static void main(String[] args)
	{
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter first number");
		int n1,n2;
		n1=sc.nextInt();
		System.out.print("Enter Second number");
		n2=sc.nextInt();
		int sum=n1+n2;
		int product=n1*n2;
		System.out.println("sum is :"+sum);
		System.out.println("Product is :"+product);
	}
}
