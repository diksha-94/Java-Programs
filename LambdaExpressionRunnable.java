public class LambdaExpressionRunnable
{
	public static void main(String[] args)
	{
		String name="abc";
		Runnable r1=()->System.out.println("Inside r1");
		
		String name1="abc1";
		Runnable r2=()->System.out.println("Inside r2");
		r1.run();
	}
}