import java.util.*;
public class Contest1
{
	public static void main(String[] args)
	{
		int input1= 2;
		int input2= 1;
		int input3= 6;
		int input4= 5;
		/*if(input3<input1 || input4<input2){
			int temp=input1;
			input1=input3;
			input3=temp;
			
			temp=input2;
			input2=input4;
			input4=temp;
			
		}*/
		System.out.println(getStepCount(input1, input2, input3, input4));
	}
	public static Set<String> set = new HashSet<String>();
	public static int count = 0;
	public static Boolean end = false;
	public static int getStepCount(int input1, int input2, int input3, int input4){
		if(input1<1 || input2<1 || input3<1 || input4<1 || input1>8 || input2>8 || input3>8 || input4>8){
			return 0;
		}
		System.out.println(input1+"----"+input2+"-----"+input3+"-----"+input4);
		if(input1 == input3 && input2 == input4){
			end=true;
			return count;
		}
		count++;
		set.add(input1+","+input2);
		//right,upper
		if(input1+2<=8 && input2+1<=8 && (input3>input1 || input3==input1) && input4>=input2 && !set.contains((input1+2)+","+(input2+1)) && !end){
			System.out.println("Inside 1");
			getStepCount(input1+2, input2+1, input3, input4);
		}
		//right,lower
		if(input1+2<=8 && input2-1>=1 && input3>input1 && input4<input2  && !set.contains((input1+2)+","+(input2-1)) && !end){
			System.out.println("Inside 2");
			getStepCount(input1+2, input2-1, input3, input4);
		}
		
		
		//lower, right
		if(input2-2>=1 && input1+1<=8 && input3>=input1 && input4<input2  && !set.contains((input1+1)+","+(input2-2)) && !end){
			System.out.println("Inside 3");
			getStepCount(input1+1, input2-2, input3, input4);
		} 
		//lower,left
		if(input2-2>=1 && input1-1<=8  && input3<input1 && input4<input2 && !set.contains((input1-1)+","+(input2-2)) && !end){
			System.out.println("Inside 4");
			getStepCount(input1-1, input2-2, input3, input4);
		}
		//upper,right
		if(input2+2<=8 && input1+1<=8  && input3>=input1 && input4>=input2 && !set.contains((input1+1)+","+(input2+2)) && !end){
			System.out.println("Inside 5");
			getStepCount(input1+1, input2+2, input3, input4);
		}
		//upper,left
		if(input2+2<=8 && input1-1<=8 && input3<input1 && input4>input2  && !set.contains((input1-1)+","+(input2+2)) && !end){
			System.out.println("Inside 6");
			getStepCount(input1-1, input2+2, input3, input4);
		}
		
		//left,upper
		if(input1-2>=1 && input2+1<=8  && input3<input1 && input4>=input2 && !set.contains((input1-2)+","+(input2+1)) && !end){
			System.out.println("Inside 7");
			getStepCount(input1-2, input2+1, input3, input4);
		}
		//left,lower
		if(input1-2>=1 && input2-1>=1  && input3<input1 && input4<input2 && !set.contains((input1-2)+","+(input2-1)) && !end){
			System.out.println("Inside 8");
			getStepCount(input1-2, input2-1, input3, input4);
		}
		
		/*
		//right,upper
		if(input1+2<=8 && input2+1<=8 && !set.contains((input1+2)+","+(input2+1)) && !end){
			System.out.println("Inside 1");
			getStepCount(input1+2, input2+1, input3, input4);
		}
		//right,lower
		if(input1+2<=8 && input2-1>=1 && !set.contains((input1+2)+","+(input2-1)) && !end){
			System.out.println("Inside 2");
			getStepCount(input1+2, input2-1, input3, input4);
		}
		
		//lower, right
		if(input2-2>=1 && input1+1<=8 && !set.contains((input1+1)+","+(input2-2)) && !end){
			System.out.println("Inside 3");
			getStepCount(input1+1, input2-2, input3, input4);
		}
		//lower,left
		if(input2-2>=1 && input1-1<=8 && !set.contains((input1-1)+","+(input2-2)) && !end){
			System.out.println("Inside 4");
			getStepCount(input1-1, input2-2, input3, input4);
		}
		//upper,right
		if(input2+2<=8 && input1+1<=8 && !set.contains((input1+1)+","+(input2+2)) && !end){
			System.out.println("Inside 5");
			getStepCount(input1+1, input2+2, input3, input4);
		}
		//upper,left
		if(input2+2<=8 && input1-1<=8  && !set.contains((input1-1)+","+(input2+2)) && !end){
			System.out.println("Inside 6");
			getStepCount(input1-1, input2+2, input3, input4);
		}
		//left,upper
		if(input1-2>=1 && input2+1<=8 && !set.contains((input1-2)+","+(input2+1)) && !end){
			System.out.println("Inside 7");
			getStepCount(input1-2, input2+1, input3, input4);
		}
		//left,lower
		if(input1-2>=1 && input2-1>=1 && !set.contains((input1-2)+","+(input2-1)) && !end){
			System.out.println("Inside 8");
			getStepCount(input1-2, input2-1, input3, input4);
		}*/
		return count;
	} 
}