import java.util.Scanner;
class Exceptiondemo2
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
                    System.out.println("entered into catch block....");
                     System.out.println("n1/n2="+Double.POSITIVE_INFINITY);
              }
               System.out.println("End of the main().....");
       } 
}