//Check balanced parentheses in expression

import java.io.*;
public class BalancedParenthesesCheck
{
	public static int top=-1;
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String exp = br.readLine();
		int len = exp.length();
		char[] stack = new char[len];
		Boolean flag = true;
		for(int i=0;i<len;i++)
		{
			char ch = exp.charAt(i);
			switch(ch)
			{
				case '(':
				case '{':
				case '[':
					stack = push(ch, stack);
					break;
				case ')':
				case '}':
				case ']':
					char existingCh = pop(stack);
					flag = compare(ch, existingCh);
			}
			if(flag == false)
			{
				break;
			}
		}
		if(flag == false)
		{
			System.out.println("Not balanced");
		}
		else{
			System.out.println("balanced");
		}
	}
	public static char[] push(char item, char[] stack)
	{
		stack[++top]=item;
		return stack;
	}
	public static char pop(char[] stack)
	{
		if(top==-1)
		{
			return 'a';
		}
		return stack[top--];
	}
	public static Boolean isEmpty(char[] stack)
	{
		if(top==-1)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static Boolean compare(char item, char exist)
	{
	if((item == ')' && exist == '(') || (item == '}' && exist == '{') || (item == ']' && exist == '['))
		{
			return true;
		}
		else{
			return false;
		}
	}
}