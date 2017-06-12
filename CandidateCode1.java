/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class CandidateCode1 {
   public static void main(String args[] ) throws Exception {

	//Write code here
	BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	int n = Integer.parseInt(br.readLine());
	int count=65;
	Boolean flag=false;
	for(int i=0;i<n;i++)
	{
	    count=65+i;
		flag=false;
	    for(int j=n-1;j>i;j--)
	    {
	        System.out.print("  ");
	    }
	    for(int k=0;k<(2*i+1);k++)
	    {
	        if(k==2*i)
	        {
	            System.out.print((char)count);
	        }
	        else
	        {
	            System.out.print((char)count+" ");
	        }
			if(count==65 || flag==true)
			{
				count++;
				flag=true;
			}
			else{
				count--;
			}
	    }
		System.out.println();
	}
	

   }
}
