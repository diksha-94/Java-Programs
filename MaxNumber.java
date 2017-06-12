import java.util.*;
import java.lang.*;
import java.io.*;

class MaxNumber {
	public static void main (String[] args) {
		//code
		int max=-1;
		int num;
		int negNum;
		try{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for(int k=0;k<t;k++)
        {
            int n=Integer.parseInt(br.readLine());
            String[] arrayStr=(br.readLine()).split(" ");
			int array[]=new int[n];
			for(int m=0;m<n;m++)
			{
				array[m]=Integer.parseInt(arrayStr[m]);
			}
            for(int i=0;i<n;i++)
            {
                for(int j=i;j<n;j++)
                {
                    num=(array[i]-i)-(array[j]-j);
                    if(num>max)
                    {
                        max=num;
                    }
                    negNum=-(num);
                    if(negNum>max)
                    {
                        max=negNum;
                    }
                }
            }
            System.out.println(max);
        }
        }
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
        
        
	}
}