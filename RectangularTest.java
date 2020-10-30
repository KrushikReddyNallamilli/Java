class Rectangle
{
	double length;
	double breadth;
	public void area()
	{
	  System.out.println("area:"+(length*breadth));
	}
}
class RectangleTest
{
	public static void main(String agrs[])
	{
	  System.out.println("Working with first rectangle:");
	  Rectangle r=new Rectangle();
	  r.length=10.0;
	  r.breadth=20.0;
	  System.out.println("length:"+r.length);
	  System.out.println("breadth:"+r.breadth);
	  r.area();

	  System.out.println("Working with second rectangle:");
	  Rectangle p=new Rectangle();
	  p.length=15.0;
	  p.breadth=25.0;
	  System.out.println("length:"+p.length);
	  System.out.println("breadth:"+p.breadth);
	  p.area();
	}
}
