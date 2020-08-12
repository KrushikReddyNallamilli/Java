import java.util.*;
class ExceptionDemo4
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.print("Enter the first number:");
			int n1=sc.nextInt();
			System.out.print("Enter the second number:");
			int n2=sc.nextInt();
			int n3=n1/n2;
			System.out.print("n1/n2="+n3);
			System.out.println("End of try block....");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Entered into catch block....");
			System.out.println("n1/n2="+Double.POSITIVE_INFINITY);
		}
		finally
		{
			System.out.println("The block must be executed before                                                                                           stopping the execution....");
			System.out.println("This block contains cleanup code...");
		}	
		System.out.print("End of the main().....");
	}
}