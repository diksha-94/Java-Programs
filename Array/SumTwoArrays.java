import java.io.*;
import java.util.*;
public class SumTwoArrays
{
	public static void main(String[] args) throws Exception
	{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] array1 = new int[n];
		String[] strArray1 = (br.readLine()).split(" ");
		
		int m = Integer.parseInt(br.readLine());
		int[] array2 = new int[m];
		String[] strArray2 = (br.readLine()).split(" ");
		int num = (n>m)?n:m;
		List<Integer> outputList = new ArrayList<Integer>();
		for(int i=0;i<num;i++)
		{
			if(i<n)
			{
				array1[i] = Integer.parseInt(strArray1[i]);
			}
			if(i<m)
			{
				array2[i] = Integer.parseInt(strArray2[i]);
			}
			int sum=0;
			//System.out.println(i+"    "+m+"     "+n);
			if(i<n && i<m)
			{
				//System.out.println("Inside 1");
				sum = array1[i]+array2[i];
			}
			else if(i>=m)
			{
				//System.out.println("Inside 2");
				sum = array1[i];
			}
			else if(i>=n)
			{
				//System.out.println("Inside 3");
				sum = array2[i];
			}
			if(sum/10 > 0)
			{
				String str = ""+sum;
				for(int j=0;j<str.length();j++)
				{
					outputList.add(Character.getNumericValue(str.charAt(j)));
				}
			}
			else
			{
				outputList.add(sum);
			}
		}
		
		for(Integer item : outputList)
		{
			System.out.print(item+"\t");
		}
		
	}
}