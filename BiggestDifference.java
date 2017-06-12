/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class BiggestDifference {
   public static void main(String args[] ) throws Exception {

	//Write code here
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] line = (br.readLine()).split(" ");
    int[] array = new int[n];
    for(int i=0;i<n;i++)
    {
        array[i] = Integer.parseInt(line[i]);
    }
    Double posInf = Double.POSITIVE_INFINITY;
    Double negInf = Double.POSITIVE_INFINITY*-1;
    int min = posInf.intValue();
    int max = negInf.intValue();
    for(int i=0;i<n;i++)
    {
        if(array[i]>max)
        {
            max=array[i];
        }
        if(array[i]<min)
        {
            min=array[i];
        }
    }
    System.out.print(max-min);
    

   }
}
