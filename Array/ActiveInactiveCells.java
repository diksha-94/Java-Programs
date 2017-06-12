import java.io.*;
public class ActiveInactiveCells
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] array = new int[n];
		
		String[] strArray = (br.readLine()).split(" ");
		for(int i=0;i<n;i++)
		{
			array[i] = Integer.parseInt(strArray[i]);
		}
		int k = Integer.parseInt(br.readLine());
		int[] outputArray = recursilyProcessArray(array, k);
		int sum0=0,sum1=0;
		for(int i=0;i<outputArray.length;i++)
		{
			if(outputArray[i]==0)
			{
				sum0++;
			}
			if(outputArray[i]==1)
			{
				sum1++;
			}
		}
		System.out.println("Active cells: "+sum1+"\tInactive cells: "+sum0);
	}
	public static int[] recursilyProcessArray(int[] array, int k)
	{
		int n = array.length;
		if(k>0)
		{
			int[] tempArray = new int[n+2];
			int i;
			for(i=0;i<n;i++)
			{
				tempArray[i+1] = array[i];
			}
			tempArray[i+1]=0;
			tempArray[0]=0;
			
			for(int j=1;j<=n;j++)
			{
				array[j-1] = tempArray[j-1]^tempArray[j+1];
			}
			return recursilyProcessArray(array, k-1);
		}
		else
		{
			return array;
		}
	}
}