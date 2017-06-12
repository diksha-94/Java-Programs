import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) throws Exception{
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++)
		{
		    String str = br.readLine();
		    int k = Integer.parseInt(br.readLine());
		    int[] array = new int[26]; 
		    for(int j=0;j<26;j++)
		    {
		        array[j] = 0;
		    }
		    for(int j=0;j<str.length();j++)
		    {
		        array[(int)str.charAt(j)-97]+=1;
		    }
		    /*for(int j=0;j<26;j++)
		    {
		        System.out.print(array[j]+"\t");
		    }*/
		    Double negInf = Double.NEGATIVE_INFINITY;
		    int index=-1;
		    while(k>0)
		    {
		        int max = negInf.intValue();
		        index=-1;
		        for(int j=0;j<26;j++)
		        {
		            if(array[j]>max)
		            {
		                max = array[j];
		                index = j;
		            }
		        }
				if(max!=0){
					array[index]-=1;
				}
				else if(max==0)
				{
					break;
				}
		        k--;
		    }
		    Double result = 0.0;
		    for(int j=0;j<26;j++)
		    {
		        if(array[j]!=0)
		        {
		            result+=Math.pow(array[j],2);
		        }
		    }
			System.out.println(result.intValue());
		}
	}
}