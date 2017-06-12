public class Dog
{
	String name;
	Dog(String s)
	{
		name=s;
	}
	public static void main(String args[])
	{
		//String d1="Boi";
		String d2=new String("Boi");
		//System.out.println((d1==d2)+" ");
		String d3="Boi";
		//d2=d1;
		//System.out.println((d1==d2)+" ");
		
		System.out.println((d2==d3)+" ");
		
	}
}