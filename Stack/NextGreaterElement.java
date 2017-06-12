//Print next greater element of each element of array


//Time complexity is O(n^2)
import java.io.*;

public class NextGreaterElement
{
	public static void main(String[] args) throws Exception
	{
		int n=4;
		int[] array = {11,13,21,3};
		int item=-1;
		for(int i=0;i<n;i++)
		{
			item=array[i];
			for(int j=i+1;j<n;j++)
			{
				if(item<array[j])
				{
					array[i]=array[j];
					break;
				}
				else
				{
					array[i]=-1;
				}
			}
		}
		array[n-1]=-1;
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+"\t");
		}
	}
}