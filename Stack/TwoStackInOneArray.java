//Implement two stacks in one array

import java.io.*;
public class TwoStackInOneArray
{
	public static int n=10;
	public static int[] array = new int[n];
	public static int top1=-1;
	public static int top2=n;
	
	public static void main(String[] args)
	{
		push(1,1);
        push(2,2);
        push(2,2);
        push(1,1);
        push(2,2);
        //System.out.println("Popped element from" +
        //                   " stack1 is " + pop(1));
        push(2,2);
        //System.out.println("Popped element from" +
        //                 " stack2 is " + pop(2));
		push(2,2);
		push(2,2);
		push(2,2);
		push(2,2);
		System.out.println("Popped element from" +
                         " stack2 is " + pop(2));
		push(1,1);
		
	}
	public static void push(int item, int stack)
	{
		if(top2==top1+1)
		{
			System.out.println("Stack overflow");
			return;
		}
		if(stack==1)
		{
			array[++top1]=item;
			System.out.println("Pushed to stack1");
		}
		else if(stack==2)
		{
			array[--top2]=item;
			System.out.println("Pushed to stack2");
		}
	}
	public static int pop(int stack)
	{
		if((top1==-1 && stack==1) || (top1==n && stack==2))
		{
			System.out.println("Stack1 is underflow");
			return 0;
		}
		if(stack==1)
		{
			return array[top1--];
		}
		if(stack==2)
		{
			return array[top2++];
		}
		return 0;
	}
	public static int peek(int stack)
	{
		if((top1==-1 && stack==1) || (top1==n && stack==2))
		{
			System.out.println("Stack is underflow");
			return 0;
		}
		if(stack==1)
		{
			return array[top1];
		}
		if(stack==2)
		{
			return array[top2];
		}
		return 0;
	}
}
 