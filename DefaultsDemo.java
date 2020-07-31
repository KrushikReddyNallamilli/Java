import java.lang.*;
import java.util.Scanner;
class DefaultsDemo
{ 
   byte b1;
   short s1;
   int i1;
   long l1;
   
   char ch;
   float f1;
   double d1;

   boolean is_correct;
   String name;
   
   
   void DefaultValues()
   {
      System.out.println("byte:"+b1);
      System.out.println("short:"+s1);
      System.out.println("int:"+i1);
      System.out.println("long:"+l1);
      System.out.println("char:"+ch);
      System.out.println("float:"+f1);
      System.out.println("double:"+d1);
      System.out.println("boolean:"+is_correct);
      System.out.println("String:"+name);
   }
   public static void main(String args[])
   {
         DefaultsDemo obj1=new DefaultsDemo();
         obj1.DefaultValues();       
   }
}