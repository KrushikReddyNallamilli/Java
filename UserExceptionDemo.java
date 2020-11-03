import java.util.Scanner;

class NotEligibleException extends Exception 

{
	
	public String toString()

	{

		return"You are not eligibe for voting...";

	}

}

class UserExceptionDemo

{
	
public static void main(String[] args)
	
{
		
	Scanner sc= new Scanner(System.in);

		try
		
		{

			System.out.print("Enter your age:");

			int age=sc.nextInt();

			if(age<18)
			{

				throw new NotEligibleException();

			}
			else
			{

				System.out.println("Welcome! You are eligible for voting!");

			}

		}

		catch(NotEligibleException ne)

		{

			System.out.println(ne);

		}

	}

}