class Parent
{
	int x=100;
	int y;
	Parent(int a)
	{
		y=a;
	}
	void show()
	{
		System.out.println("y:"+y);
	}
}

class Child extends Parent
{
	int x=110;
	int z;
	Child(int p,int q)
	{
		super(p);
		z=q;
	}
	void show()
	{
		System.out.println("z:"+z);
	}
	void superX()
	{
		System.out.println("super.x:"+super.x);	
	}
	void superShow()
	{
		super.show();
	}
}
class SuperDemo
{
	public static void main(String args[])
	{
		Child c1=new Child(200,220);
		c1.show();
		c1.superShow();
		c1.superX();
		System.out.println("child.x:"+c1.x);
	}
}