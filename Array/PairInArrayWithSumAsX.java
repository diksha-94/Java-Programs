import java.io.*;
public class PairInArrayWithSumAsX
{
	public static void main(String[] args) throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		String[] strArray = (br.readLine()).split(" ");
		int[] array = new int[n];
		for(int i=0;i<n;i++)
		{
			array[i] = Integer.parseInt(strArray[i]);
		}
		int x = Integer.parseInt(br.readLine());
		Boolean flag = false;
		for(int i=0;i<(n-1);i++)
		{
			for(int j=i+1;j<n;j++)
			{
				int sum=array[i]+array[j];
				if(sum == x)
				{
					flag=true;
					break;
				}
			}
		}
		if(flag == true)
		{
			System.out.println("Yes, exists!!");
		}
		else
		{
			System.out.println("Doesn't exist");
		}
		
	}
}