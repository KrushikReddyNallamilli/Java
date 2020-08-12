class Box{
	double length;
	double breadth;
	double height;
	Box(double  l,double b,double h)
	{
	  System.out.println("****creating cuboid****");
	  length=l;
	  breadth=b;
	  height=h;
	}
	Box(double s)
	{
	  System.out.println("****creating  cube****");
	  length=breadth=height=s;
	}
	Box()
	{
	  System.out.println("****creating unit cube****");
	  length=breadth=height=1.0;
	}
	public double volume(){
	  return (length*breadth*height);
	}
}
class ConstOverloadDemo
{
  public static void main(String[] args)
  {
	Box mybox=new Box(10.0,20.0,15.0);
	Box unitcube = new Box();
	Box mycube=new Box(10.0);
	
	double vol;
	vol=mybox.volume();
	System.out.println("\n Volume of my box:"+vol);

	vol=unitcube.volume();
	System.out.println("\n volume pf unitcube:"+vol);

	vol=mycube.volume();
	System.out.println("\n volume of mycube:"+vol);
  }
}
