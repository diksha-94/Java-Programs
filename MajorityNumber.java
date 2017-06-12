/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class MajorityNumber {
   public static void main(String args[] ) throws Exception {

	//Write code here
	Scanner scan=new Scanner(System.in);
	int n=scan.nextInt();
	int array[]=new int[n];
	int max=-1;
	for(int i=0;i<n;i++)
	{
	    array[i]=scan.nextInt();
	    if(array[i]>max)
	        max=array[i];
	}
	int count[]=new int[max+1];
	for(int i=0;i<=max;i++)
	{
	    count[i]=0;
	}
	for(int i=0;i<n;i++)
	{
	    count[array[i]]+=1;
	}
	int maxCount=0;
	int val=0;
	for(int i=0;i<max;i++)
	{
	    if(count[i]>maxCount){
	        maxCount=count[i];
	        val=i;
	        }
	}
	System.out.println(val);

   }
}
