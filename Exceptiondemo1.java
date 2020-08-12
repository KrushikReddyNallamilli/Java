import java.util.Scanner;
class Exceptiondemo1
{
       public static void main(String[] args)
       {
              Scanner sc=new Scanner(System.in);
              System.out.print("enter first number:");
              int n1=sc.nextInt();
              System.out.print("enter seccond number:");
              int n2=sc.nextInt();
              int n3=n1/n2;
              System.out.println("n1/n2="+n3);
               System.out.println("end of main().........");
       } 
}