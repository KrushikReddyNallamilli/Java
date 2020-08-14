interface Shape{
	double PI=3.1415;
	void area();
	void volume();
}
interface Units
{
	String AREA_UNITS="sq.cm.";
	String VOLUME_UNITS="c.c";
}
class Sphere implements Shape,Units
{
	double radius;
	Sphere(double r)
	{
		radius=r;
	}
	public void area()
	{
		System.out.println("Surface area of sphere:"+(4*PI*radius*radius)+AREA_UNITS);
	}
	public void volume()
	{
		System.out.println("volume of sphere:"+((4.0/3)*PI*Math.pow(radius,3))+VOLUME_UNITS);
	}
}
class InterfaceTest
{
	public static void main(String args[])
	{
		Shape s1=new Sphere(12.5);
		s1.area();
		s1.volume();
	}
}