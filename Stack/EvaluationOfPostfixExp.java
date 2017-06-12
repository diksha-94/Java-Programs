//Evaluation of Postfix expression using stack

import java.io.*;
public class EvaluationOfPostfixExp
{
	public static int top=-1;
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter postfix expression: ");
		String str = br.readLine();
		int len = str.length();
		int[] stack = new int[len];
		String output="";
		for(int i=0;i<len;i++)
		{
			char ch = str.charAt(i);
			Boolean isOperator = isOperator(ch);
			if(isOperator)
			{
				System.out.println("is operator: "+ch);
				int num1=pop(stack);
				System.out.println("num1: "+num1);
				int num2=pop(stack);
				System.out.println("num2: "+num2);
				switch(ch)
				{
					case '+':
						stack=push((num2+num1), stack);
						break;
					case '-':
						stack=push((num2-num1), stack);
						break;
					case '*':
						stack=push((num2*num1), stack);
						break;
					case '/':
						stack=push((num2/num1), stack);
						break;
					case '^':
						stack=push((num2^num1), stack);
						break;
				}
				
			}
			else if(!isOperator)
			{
				System.out.println("is not operator: "+ch);
				stack = push(Character.getNumericValue(ch), stack);
			}
		}
		System.out.println(pop(stack));
		
	}
	public static int[] push(int op, int[] stack)
	{
		System.out.println("Pushing: "+op);
		stack[++top] = op;
		return stack;
	}
	public static int pop(int[] stack)
	{
		return stack[top--];
	}
	
	public static Boolean isOperator(char op)
	{
		switch(op)
		{
			case '^':
			case '*':
			case '/':
			case '+':
			case '-':
				return true;
		}
		return false;
	}
}