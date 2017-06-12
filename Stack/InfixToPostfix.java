//Infix to Postfix expression conversion using stack
/*
1. Scan the infix expression from left to right.
2. If the scanned character is an operand , output it.
3. If the scanned character is an operator
	i. If the precedence of the scanned character is higher than the operator on the top of stack or the 
	   stack is empty , push the operator on to the stack.
	ii. else, pop from the stack  and output it, until the scanned operator has less or equal precedence 
	    than the operator on stack. After that push the scanned operator on the stack.
4. If the scanned character is (, push onto the stack.
5. If the scanned character is ), pop from stack and output until ( is encountered.
6. Repeat steps 2 to 6, until the complete expression is scanned.
7. If stack is not empty , pop and output from stack until stack is not empty.
*/

import java.io.*;
public class InfixToPostfix
{
	public static int top=-1;
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter infix expression: ");
		String str = br.readLine();
		int len = str.length();
		char[] stack = new char[len];
		String output="";
		for(int i=0;i<len;i++)
		{
			char ch = str.charAt(i);
			Boolean isOperand = isOperand(ch);
			if(isOperand == true)
			{
				output+=ch;
			}
			else if(isOperand == false)
			{
				if(ch=='(')
				{
					stack = push(ch, stack);
				}
				else if(ch==')')
				{
					while(stack[top]!='(')
					{
						output+=pop(stack);
					}
					if(stack[top]=='(')
					{
						pop(stack);
					}
				}
				else{
					int prec=operatorPrecedence(ch);
					if(isEmpty())
					{
						stack = push(ch, stack);
						continue;
					}
					int beforePrec=operatorPrecedence(stack[top]);
					
					if(prec>beforePrec)
					{
						stack = push(ch, stack);
						continue;
					}
					else{
						while(prec<=beforePrec && !isEmpty())
						{
							output+=pop(stack);
							if(top>-1)
							{
								beforePrec=operatorPrecedence(stack[top]);
							}
							else{
								beforePrec=-1;
							}
						}
						if(prec>beforePrec)
						{
							stack = push(ch, stack);
						}
					}
				}
			}
			
		}
		if(!isEmpty())
			{
				while(top>-1)
				{
					output+=pop(stack);
				}
			}
		System.out.println(output);
	}
	public static char[] push(char op, char[] stack)
	{
		stack[++top] = op;
		return stack;
	}
	public static char pop(char[] stack)
	{
		return stack[top--];
	}
	public static Boolean isOperand(char op)
	{
		if((op>='a' && op<='z') || (op>='A' && op<='Z'))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static int operatorPrecedence(char op)
	{
		switch(op)
		{
			case '^':
				return 3;
			case '*':
			case '/':
				return 2;
			case '+':
			case '-':
				return 1;
		}
		return -1;
	}
	public static Boolean isEmpty()
	{
		if(top==-1)
		{
			return true;
		}
		else{
			return false;
		}
	}
}