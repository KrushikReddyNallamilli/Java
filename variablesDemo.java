import java.lang.*;
import java.util.Scanner;
class variablesDemo
{ 
   byte b1=35;
   short s1=568;
   int i1=23456;
   long l1=123456789;
   
   char ch='M';
   float f1=1.244f;
   double d1=2345.25456;

   boolean is_correct=true;
   String name="Ravi";
   
   
   void printValues()
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
         variablesDemo obj1=new variablesDemo();
         obj1.printValues();       

   }


}