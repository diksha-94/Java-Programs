import java.util.*;
import java.lang.*;
import java.io.*;

class SquareOrNot{
	public static void main (String[] args) throws Exception{
		//code
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int t = Integer.parseInt(br.readLine());
		for(int i=0;i<t;i++)
		{
		    String[] strArray = (br.readLine()).split(" ");
		    int len = strArray.length;
		    int[] arrayX = new int[len/2];
		    int[] arrayY = new int[len/2];
		    int k=0;
		    int m=0;
		    for(int j=0;j<len;j++)
		    {
		        if(j%2==0)
		        {
		            arrayX[k] = Integer.parseInt(strArray[j]);
		            k++;
		        }
		        else if(j%2!=0)
		        {
		            arrayY[m] = Integer.parseInt(strArray[j]);
		            m++;
		        }
		    }
		    Set<Integer> set = new HashSet<Integer>();
		    for(int y=0;y<len/2;y++)
		    {
		        for(int z=i+1;z<len/2;z++)
		        {
		            int diff = arrayX[z] - arrayX[y];
		            if(diff<0){
		                diff=-(diff);
		            }
		            set.add(diff);
		            diff = arrayY[z] - arrayY[y];
		            if(diff<0){
		                diff=-(diff);
		            }
		            set.add(diff);
		        }
		    }
			for(Integer item : set)
			{
				System.out.print(item+"\t");
			}
		    if(set.size()==2)
		    {
		        System.out.println("1");
		    }
		    else
		    {
		        System.out.println("0");
		    }
		}
	}
}