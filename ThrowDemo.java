import java.util.*;
class ThrowDemo
{
	public static void main(String args[])
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a positive number:");
		int n1= sc.nextInt();
		try
		{
			if(n1<0)
			{
				throw new ArithmeticException("The number is negative");
			}
			else
			{
				System.out.println("Square root of "+n1 +" is : "+Math.sqrt(n1));
			
			}
                }
		catch(ArithmeticException ex)
		{
			System.out.println("Square root of "+n1 +" is : "+Math.sqrt(Math.abs(n1))+" i");
		}
		
	}
}
