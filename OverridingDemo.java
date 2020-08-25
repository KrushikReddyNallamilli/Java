class Animal{
void show()
	{
		System.out.println("I am a generic Animal.");
	}
}
class Dog extends Animal{
	void show()
	{
		System.out.println("I am a Dog.");
	}
}
class Cow extends Animal{
	void show()
	{
		System.out.println("I am a Cow.");
	}
}
class Snake extends Animal{
	void show()
	{
		System.out.println("I am a Snake.");
	}
}

class OverridingDemo
{
	public static void main(String args[])
	{
		Animal ref1;
		ref1=new Animal();
		ref1.show();
		ref1=new Dog();
		ref1.show();
		ref1=new Cow();
		ref1.show();
		ref1=new Snake();
		ref1.show();
	}
}