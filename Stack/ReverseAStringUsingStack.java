public class ReverseAStringUsingStack
{
	static int top=-1;
	public static void main(String[] args)
	{
		String str = "Hello World !!";
		char[] stack = new char[str.length()];
		for(int i=0;i<str.length();i++)
		{
			push(str.charAt(i), stack);
		}
		while(top>-1)
		{
			System.out.print(pop(stack));
		}
		
	}
	public static void push(char item, char[] stack)
	{
		/*if(top == size-1)
		{
			System.out.println("Stack overflow");
			return;
		}*/
		stack[++top] = item;
	}
	public static char pop(char[] stack)
	{
		/*if(top == -1)
		{
			System.out.println("Stack underflow");
			return 0;
		}*/
		return stack[top--];
	}
}
