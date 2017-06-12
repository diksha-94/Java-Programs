class Base
{
	public void eat()
	{
		System.out.println("Base class eat()");
	}
	public void walk()
	{
		System.out.println("Base class walk()");
	}
}
class Derived extends Base
{
	public void eat()
	{
		System.out.println("Derived class eat()");
	}
	public void run()
	{
		System.out.println("Derived class run()");
	}
}
public class BaseDerived
{
	public static void main(String[] args)
	{
		Base b1=new Base();
		Base b2=new Derived();
		//Derived d1=new Base();
		Derived d2=new Derived();
		b1.eat();
		b1.walk();
		//b1.run();
		b2.eat();
		b2.walk();
		//b2.run();
		d2.eat();
		d2.walk();
		d2.run();
	}
}