import java.io.*;
public class CandidateCode 
{ 

	public static void main(String args[])
	{
		System.out.println(cadbury(1,2,3,4));
	}
    public static int cadbury(int input1,int input2,int input3,int input4)
    {
        //Write code here
        int M=input1;
	    int N=input2;
	    int P=input3;
	    int Q=input4;
	    int i=0;
	    int j=0;
	    int count=0;
	    for(int a=M;a<=N;a++)
	    {
	        for(int b=P;b<=Q;b++)
	        {
	            i=a;
	            j=b;
				System.out.println("i: "+i+" j: "+j);
				while(i>0 && j>0)
				{
	            if(i==j)
	            {
	                count++;
                    i=0;
					j=0;
	            }
	            else if(i>j)
	            {
	                count++;
	                i=i-j;
	            }
	            else if(j>i)
	            {
	                count++;
	                j=j-i;
	            }
				}
	        }
	    }
	    return count;
    }
}