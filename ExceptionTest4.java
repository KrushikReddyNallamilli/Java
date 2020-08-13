import java.util.Scanner;
class ExceptionTest4
{
      public static void main(String args[])
      {
               Scanner sc=new Scanner(System.in);
               try
               {
                      System.out.print("Enter first number:");
                      int n1=sc.nextInt();
                      System.out.print("Enter second number:");
                      int n2=sc.nextInt();
                      int n3=n1/n2;
                      System.out.println("n1/n2="+n3);
                      System.out.println("End of the try block....");
               }
               catch (ArithmeticException ae)
               {
                           System.out.println("Entered into catch block...");
                           System.out.println("n1/n2="+Double.POSITIVE_INFINITY);
               }
               finally
               {
                           System.out.println("This finally block is"+"must be executed before abnormal"+"termination of the program"+"when exception is not handled...");
                           System.out.println("Clean up code is"+"executed....");
               }                
                      System.out.println("End of the main()....");
      }
}