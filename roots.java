import java.lang.*;
import java.util.Scanner;
class RootsDemo
{
	public static void main(String args[])
		{
			double a,b,c;
			double r1,r2;
			Scanner sc=new Scanner(System.in);
			System.out.print("Enter a value of a:");
			a=sc.nextDouble();
			System.out.print("Enter a value of b:");
			b=sc.nextDouble();
			System.out.print("Enter a value of c:");
			c=sc.nextDouble();
			double d=b*b-4*a*c;
			if(d>0)
			{
			  System.out.println("real and different");
			  r1=(-b+Math.sqrt(d)/(2*a));
			  r2=(-b-Math.sqrt(d))/(2*a);
			  System.out.print("r1:"+r1);
			  System.out.print("r2:"+r2);
			}
			else if(d==0)
			{
			  System.out.println("real and equal");
			  r1=b/2*a;
			  r2=b/2*a;
			  System.out.print("r1:"+r1);
			  System.out.print("r2:"+r2);
			}
			else
			{
			  System.out.print("The roots are imaginary");
			}
		}
}