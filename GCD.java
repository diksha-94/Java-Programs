import java.util.*;
public class GCD
{
	public static void main(String args[])
	{
		int a=input1[0];
		int b=input1[1];
		int result[]=new int[2];
		result[0]=0;
		result[1]=0;
		int num,rem;
		int num1=a;
		int num2=b;
		int c,d=1,q;
		int flag=0;
		if(a<0 || a>1000 || b<0 || b>1000)
		{
			return result;
		}
		while(a!=0)
		{
			q=b/a;
			c=b;
			
			b=a;
			d=a;
			a=c-a*q;
		}
		if(d==num1)
		{
			result[0]=1;
			result[1]=0;
		}
		else if(d==num2)
		{
			result[0]=0;
			result[1]=1;
		}
		else{
		if(num1>num2)
		{
			num=num1;
			num1=num2;
			num2=num;
			flag=1;
		}
		a=num1;   
		b=num2;  
		
		    q=b/a;
			rem=b%a;
			if(rem>d)  
			{
				q++;
				rem=rem-a;
				result[1]=1;
			}
		    if(rem==0)
		    {
				result[1]=-1;
		        result[0]=q+1;
		    }
		    else if(rem<0)
		    {
				result[1]=-result[1];
		        result[0]=q;
				while((a*result[0]+b*result[1])!=d)
				{
					if((a*result[0]-b*(-result[1]))>0)
					{
						result[1]=result[1]-1;
					}
					else if((a*result[0]-b*(-result[1]))<0)
					{
						result[0]=result[0]+1;
					}
				}
				
		    }
		    else if(rem>0)  
		    {
				result[1]=1;  
		        result[0]=-q;  
		    }
			if(flag==1)
			{
				int z=result[0];
				result[0]=result[1];
				result[1]=z;
			}
		}
		return result;
	}
}