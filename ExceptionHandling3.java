public class ExceptionHandling3
{
	public static void main(String[] args)
	{
		try
		{
			int a=0;
		}
		catch(Exception e)
		{
			try{}
			catch(Exception ex)
			{}
			finally{}
		}
		finally{}
	}
}