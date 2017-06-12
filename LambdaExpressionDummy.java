interface Executable
{
	public void execute();
}
class Runner
{
	public void run(Executable e)
	{
		System.out.println("Executing run method...");
		e.execute();
	}
}
public class LambdaExpressionDummy
{
	public static void main(String[] args)
	{
		Runner runner = new Runner();
		runner.run(new Executable(){
			public void execute()
			{
				System.out.println("Inside execute method");
			}
		});
		System.out.println("-----Lambda Expression-----");
		runner.run(()->{System.out.println("Inside execute method");});
		
		System.out.println("-----Lambda Expression-----");
		runner.run(()->{
		System.out.println("Inside execute method");
		});
	}
}