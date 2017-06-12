/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;
public class SumAsZero {
   public static void main(String args[] ) throws Exception {

	//Write code here
	/* Read input from STDIN. Print your output to STDOUT*/

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String[] line = (br.readLine()).split(" ");
    int[] array = new int[n];
    List<List<Integer>> list = new ArrayList<List<Integer>>();
    for(int i=0;i<n;i++)
    {
        array[i] = Integer.parseInt(line[i]);
    }
    for(int i=0;i<n;i++)
    {
        for(int j=i+1;j<n;j++)
        {
            for(int k=j+1;k<n;k++)
            {
                List<Integer> temp = new ArrayList<Integer>();
                temp.add(array[i]);
                temp.add(array[j]);
                temp.add(array[k]);
                
                list.add(temp);
            }
        }
    }
    int sum=0;
    Boolean flag=false;
    for(List<Integer> item : list)
    {
        sum=0;
        for(Integer i : item)
        {
            sum+=i;
        }
        if(sum == 0)
        {
            flag=true;
            break;
        }
    }
    if(flag == true)
    {
        System.out.print("True");
    }
    else
    {
        System.out.print("False");
    }


   }
}
