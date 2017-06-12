/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
public class CandidateCodeBinarySearch {
   public static void main(String args[] ) throws Exception {

	//Write code here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] arrayStr=(br.readLine()).split(" ");
		int array[]=new int[n];
		for(int m=0;m<n;m++)
		{
			array[m]=Integer.parseInt(arrayStr[m]);
		}
		int search = Integer.parseInt(br.readLine());
		for(int i=0;i<n;i++)
		{
		    for(int j=i+1;j<n;j++)
		    {
		        if(array[i]>array[j])
		        {
		            int temp=array[i];
		            array[i]=array[j];
		            array[j]=temp;
		        }
		    }
		}
		for(int i=0;i<n;i++)
		{
		    System.out.print(array[i]+"   ");
		}
		binarySearch(array,search);
		
   }
   public static void binarySearch(int[] array, int search)
   {
       int mid=(array.length)/2;
       if(search<array[mid])
       {
		   int tempArray[]=new int[mid];
           for(int i=0;i<mid;i++)
            {
				tempArray[i]=array[i];
                System.out.print(tempArray[i]+"  ");
            }
           binarySearch(tempArray,search);
       }
       else if(search>array[mid])
       {
		   int newSize=array.length-1-mid;
		   int tempArray[]=new int[newSize];
           for(int i=0;i<newSize;i++)
            {
				tempArray[i]=array[array.length-newSize+i];
                System.out.print(tempArray[i]+"  ");
            }
           binarySearch(tempArray,search);
       }
       else if(search==array[mid])
       {
           System.out.println(mid);
       }
   }
   
}
