package com.aditya.demo;
public class Circle
{
       double radius;
       public Circle(double r)
       {
             radius=r;   
       }
       public void area()
       {
              System.out.println("Area:"+(3.1415*radius*radius));
       }
       public static void main(String[] args)
       {
            Circle c1=new Circle(12.5);
            c1.area();
       }
}