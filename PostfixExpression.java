import java.util.*;
public class PostfixExpression {
	public static void main(String[] args){
		ArrayList<String> list = new ArrayList<String>();
		list.add("4");
		list.add("13");
		list.add("5+2");
		list.add("/");
		list.add("+");
		System.out.println(evalRPN(list));
	}
    public static int top = -1;
	public static int evalRPN(ArrayList<String> a) {
	    int len = a.size();
	    int[] stack = new int[len];
	    int top = -1;
	    int first = -1;
	    int second = -1;
	    for(int i=0;i<len;i++){
			System.out.println("Inside loop");
	        String ch = a.get(i);
			Boolean flag = false;
			for(int j = 0;j<ch.length();j++){
				System.out.println("Inside inside loop");
				
				if(isDigit(ch.charAt(j))){
					System.out.println("Inside true");
					flag = true;
				}
				if(!isDigit(ch.charAt(j)) && flag == true){
					System.out.println("Inside false");
					ch = ch.substring(0,j);
					break;
				}
			}
	        switch(ch){
	            case "+":
				System.out.println("Inside +: "+ch);
	                second = pop(stack);
	                first = pop(stack);
	                push(stack, first+second, len);
					break;
	            case "-":
				System.out.println("Inside -: "+ch);
	                second = pop(stack);
	                first = pop(stack);
	                push(stack, first-second, len);
					break;
	            case "*":
				System.out.println("Inside *: "+ch);
	                second = pop(stack);
	                first = pop(stack);
	                push(stack, first*second, len);
					break;
	            case "/":
				System.out.println("Inside /: "+ch);
	                second = pop(stack);
	                first = pop(stack);
	                push(stack, first/second, len);
					break;
	               
	            default:
				System.out.println("Inside default: "+ch);
	                push(stack, Integer.parseInt(ch), len);
	        }
	    }
	    return pop(stack);
	}
	public static void push(int[] stack, int num, int len){
	    if(top == len-1){
	        System.exit(0);
	    }
        stack[++top] = num;
        
	}
	public static int pop(int[] stack){
	    if(top==-1){
	        System.exit(0);
	    }
	    return stack[top--]; 
	}
	public static Boolean isDigit(char ch){
		System.out.println("Inside isDigit: "+ch);
		if((int)ch>=48 && (int)ch<=57){
			return true;
		}
		else{
			return false;
		}
	}
}
