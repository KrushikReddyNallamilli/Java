class Rectangle{
	int length;
	int width;
	Rectangle() {}
	public Rectangle(int l , int w){
		length=l;
		width=w;
	}
}
class Box extends Rectangle{
	int height;
	Box() {}
	public Box(int l,int w, int h){
		length=l;
		width=w;
		height=h;
	}
	public int volume(){
		return(length*width*height);
	}
}
class SolidBox extends Box{
	int density;
	public SolidBox(int l,int w, int h,int d){
		length=l;
		width=w;
		height=h;
		density=d;
	}
	public int weight(){
		return(super.volume()*density);
	}
}
class MultiLevelInheritTest
{
	public static void main(String[] args)
	{
		Rectangle r1=new Rectangle(5,8);
		System.out.println("Area of rectangle:"+(r1.length*r1.width));

		Box b1=new Box(7,8,9);
		System.out.println("volume of box:"+b1.volume());

		SolidBox m1= new SolidBox(10,15,25,3);
		System.out.println("volume of Solid Box:"+m1.volume());
		System.out.println("The weight of SolidBox:"+m1.weight()+"KiloGrams.");
	}
}