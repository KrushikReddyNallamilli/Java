class Rectangle
{
	double length;
	double breadth;
	public Rectangle(double l,double b)
	{
	  length=l;breadth=b;
	}
	public void area()
	{
	  System.out.println("area:"+(length*breadth));
	}
}
class RectangleDemo
{
	public static void main (String agrs[])
	{
	  System.out.println("Creating first rectangle:");
	  Rectangle r1=new Rectangle(19,14);
	  System.out.println("length:"+r1.length);
	  System.out.println("breadth:"+r1.breadth);
	  r1.area();

	  System.out.println("Creating second rectangle:");
	  Rectangle r2=new Rectangle(30.0,23.5);
	  System.out.println("length:"+r2.length);
	  System.out.println("breadth:"+r2.breadth);
	  r2.area();
	}
}
