public class StackArrayImpl
{
	static int top=-1;
	static int size=5;
	static int[] stack = new int[size];
	public static void main(String[] args)
	{
		display();
		push(1);
		push(2);
		push(3);
		display();
		System.out.println(peek());
		pop();
		pop();
		pop();
		display();
		pop();
		display();
		push(1);
		push(2);
		push(3);
		push(4);
		push(5);
		display();
		push(6);
	}
	public static void push(int item)
	{
		if(top == size-1)
		{
			System.out.println("Stack overflow");
			return;
		}
		stack[++top] = item;
	}
	public static int pop()
	{
		if(top == -1)
		{
			System.out.println("Stack underflow");
			return 0;
		}
		return stack[top--];
	}
	public static int peek()
	{
		if(top == -1)
		{
			System.out.println("Stack underflow");
			return 0;
		}
		return stack[top];
	}
	public static void display()
	{
		if(top == -1)
		{
			System.out.println("Stack underflow");
			return;
		}
		for(int i=top;i>=0;i--)
		{
			System.out.print(stack[i]+"\t");
		}
		System.out.println();
	}
}