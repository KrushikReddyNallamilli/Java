import java.util.*;
class Exceptiondemo4
{
       public static void main(String[] args)
       {
              Scanner sc=new Scanner(System.in);
              try{
                  System.out.print("enter first number:");
                  int n1=sc.nextInt();
                  System.out.print("enter seccond number:");
                  int n2=sc.nextInt();
                  int n3=n1/n2;
                 System.out.println("n1/n2="+n3);
                 System.out.println("end of try block.......");
              }
              catch(ArithmeticException ae)
              {
                    System.out.println("ArithmeticException is raised....");
                     System.out.println("n1/n2="+Double.POSITIVE_INFINITY);
              }
              finally
             {
                    System.out.println("The finally block must be executed before stopping the execution.....");
                    System.out.println("This block contains clean up code.....") ;
             }
               System.out.println("End of the main().....");
       } 
}