/*
	Stack Implementation using Array
	push()
	pop()
	peek()
	printStackElements()
	there is pointer called top that will always point to the top of the stack
	Insertion and deletion both happens on the same end that is top
*/

public class StackImplementationUsingArray
{
	public static void main(String args[])
	{
		
		Stack stack=new Stack(5);
		stack.printStackElements();		//underflow
		stack.push(1);
		stack.printStackElements();		//1
		stack.push(2);
		stack.printStackElements();		//2	1
		stack.push(3);
		stack.printStackElements();		//3	2	1
		stack.push(4);
		stack.printStackElements();		//4	3	2	1
		stack.push(5);
		stack.printStackElements();		//5	4	3	2	1
		stack.push(6);					//overflow
		stack.printStackElements();		//5	4	3	2	1
		stack.pop();
		stack.printStackElements();		//4	3	2	1
		stack.pop();
		stack.printStackElements();		//3	2	1
		stack.pop();
		stack.printStackElements();		//2	1
		stack.pop();
		stack.printStackElements();		//1
		stack.pop();					
		stack.printStackElements();		//underflow
		stack.pop();					//underflow
	}
}
class Stack{
	private int top;
	private int dataItem;
	private int[] st;
	private int capacity;
	
	public Stack(int capacity)
	{
		top=-1;
		this.capacity=capacity;
		st=new int[capacity];
	}
	public void setDataItem(int dataItem)
	{
		this.dataItem=dataItem;
	}
	public int getDataItem()
	{
		return dataItem;
	}
	public void push(int dataItem)				//pushing a new item onto stack(on top position)
	{
		if(top==capacity-1)
		{
			System.out.println("Stack overflow.");
			return;
		}
		st[++top]=dataItem;
		System.out.println(dataItem+" pushed successfully.");
	}
	public void pop()							//getting the topmost item from stack and removing it from the stack
	{
		if(top==-1)
		{
			System.out.println("Stack underflow(No elements in stack).");
			return;
		}
		top--;
		//return st[top--];
	}
	public int peek()							//just getting the topmost item from stack
	{
		if(top==-1)
		{
			System.out.println("Stack underflow(No elements in stack).");
			return 0;
		}
		return st[top];
		//return st[top--];
	}
	public void printStackElements()
	{
		if(top==-1)
		{
			System.out.println("Stack underflow(No elements in stack).");
			return;
		}
		for(int i=top;i>=0;i--)
		{
			System.out.print(st[i]+"\t\t");
		}
		System.out.println();
	}
}