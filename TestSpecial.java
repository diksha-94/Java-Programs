class Special
{
	private StringBuilder s = new StringBuilder("bob");
	StringBuilder getName(){
		StringBuilder newS=s;
		
		return newS;
	}
	void printName(){
		System.out.println(s);
	}
}
public class TestSpecial
{
	public static void main(String args[])
	{
		Special sp = new Special();
		StringBuilder s2=sp.getName();
		s2.append("fred");
		sp.printName();
	}
}