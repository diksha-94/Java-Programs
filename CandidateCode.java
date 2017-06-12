/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	//Write code here
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	int count=1;
	Boolean flag=false;
	int countK=0;
	for(int i=0;i<n;i++)
	{
	    flag=false;
	    count=i+65;
	    for(int j=i;j<n-1;j++)
	    {
	        System.out.print("  ");
	    }
	    for(int k=0;k<(2*i+1);k++)
	    {
	        if(k==countK)
	        {
	            count=65;
	            flag=true;
				
	            System.out.print((char)count+" ");
	            count++;
	        }
	        else if(k==(2*i))
	        {
				
	            System.out.print((char)count);
	            //count--;
	        }
	        else if(flag==true)
	        {
				
	            System.out.print((char)count+" ");
	            count++;
	        }
	        else if(flag==false)
	        {
				
	            System.out.print((char)count+" ");
	            count--;
	        }
	        
	    }
		countK++;
	    System.out.println();
	}

   }
}
