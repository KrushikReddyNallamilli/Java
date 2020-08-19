class ComplexNumber
{
	double rpart;
	double ipart;
	ComplexNumber(double r,double i)
	{
	  rpart=r;ipart=i;
	}
}
class MethodOverload
{
	public void add (int a ,int b)
	{
	  System.out.println("int+int:"+(a+b));
	}
	public void add (double a ,double b,double c)
	{
	  System.out.println("double+double+double:"+(a+b+c));
	}
	public void add (ComplexNumber c1,ComplexNumber c2)
	{
	  System.out.printf("Complex + Complex : %.4f %+.4f i\n",
(c1.rpart + c2.rpart), (c1.ipart + c2.ipart));
	}
}

class MethodOverLoadTest
{
	public static void main(String args[])
	{
	  MethodOverload ob = new MethodOverload();
	  ob.add(10,15);
	  ob.add(10.0, 15.0, 20.0);
	  ComplexNumber cno1 = new ComplexNumber(12,15);
	  ComplexNumber cno2 = new ComplexNumber(7,4);
	  ob.add(cno1,cno2);
	}
}