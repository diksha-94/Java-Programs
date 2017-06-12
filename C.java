class A
{
	int a=2;
	void b()
	{
		System.out.println("1"+a);
	}
}
class B extends A
{
	int a=3;
	void b()
	{
		System.out.println("2"+a);
	}
}
public class C
{
	public static void main(String[] args)
	{
		A c = new B();
		c.b();
		A d = new A();
		System.out.println(c.a+" "+d.a);
	}
}