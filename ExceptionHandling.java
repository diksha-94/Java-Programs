public class ExceptionHandling
{
	public static void main(String args[])
	{
		int result=callMethod();
	}
	public static int callMethod()
	{
		try
		{
			int a=1;
			int b=1;
			int c=a/b;
			return c;
		}
		catch(Exception e)
		{
			System.out.println("Exception: "+e.getMessage());
		}
		finally
		{
			System.out.println("Inside finally block");
		}
		System.out.println("Outside Everything");
		return 0;
	}
}