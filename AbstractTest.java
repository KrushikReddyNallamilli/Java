abstract class Shape{
	int dim1;
	int dim2;
	Shape(int a, int b){
		dim1=a;
		dim2=b;
	}
	abstract double area();
}
class ImpRectangle extends Shape{
	ImpRectangle(int a,int b){
		super(a,b);
	}
	public double area(){
		return(dim1*dim2);
	}
}
class ImpTriangle extends Shape{
	ImpTriangle(int a,int b){
		super(a,b);
	}
	public double area(){
		return(dim1*dim2)/2;
	}
}
class AbstractTest{
	public static void main(String[] args){
	Shape r= new ImpRectangle(20,25);
	Shape t= new ImpTriangle(20,25);

	System.out.println("Area of Rectangle:"+r.area());
	System.out.println("Area of Triangle:"+t.area());
	}
}