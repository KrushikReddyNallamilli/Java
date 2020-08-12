import java.util.*;
class Exceptiondemo3
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
              catch(InputMismatchException ie)
              { 
                     System.out.println("InputMismatchException is raised....");
                     System.out.println("you should enter integer only");
               }
               System.out.println("End of the main().....");
       } 
}