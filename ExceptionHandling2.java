public class ExceptionHandling2
{
	public static void main(String[] args) throws Exception
	{
		reverse("");
		/*try
		{
			reverse("");
		}
		catch(Exception e)
		{
			System.out.println("Input string is empty");
		}
		finally
		{
			System.out.println("Pogram execution finished");
		}*/
	}
	public static void reverse(String str) throws Exception
	{
		
		printString(str);
	}
	public static void printString(String str) throws Exception
	{
		if(str.length()==0)
		{
			throw (new Exception());
		}
		else if(str.length()>0)
		{
			for(int i=str.length()-1;i>=0;i--)
			{
				System.out.print(str.charAt(i));
			}
		}
	}
}