import java.util.*;
public class BallCount
{
	public static void main(String[] args)
	{
		int[] array = {1,2,3,4,5};
		int f=5;
		int k=3;
		System.out.println(ball_count(array,f,k));
	}
	public static int ball_count(int[] input1,int input2,int input3)
    {
	    //Write code here
		int[] temp = new int[input1.length];
		for(int i=0;i<temp.length;i++)
		{
			temp[i] = input1[i];
		}
		combination(input1, 0, input1.length, temp, input3);
		printAllComb();
		List<Integer> list = new ArrayList<Integer>();
		int sum=0;
		for(List<Integer> list1 : resultArray)
		{
			sum=0;
			for(Integer i : list1)
			{
				//System.out.print(i+"\t");
				sum+=i;
			}
			if(sum%input2 == 0)
				list.add(sum);
		}
		Double posInf = Double.POSITIVE_INFINITY;
		int min = posInf.intValue();
		for(Integer i : list)
		{
			if(i<min)
			{
				min=i;
			}
		}
		return min;
    }

	static List<List<Integer>> resultArray=new ArrayList<List<Integer>>();
	static int index=0;
	public static void printAllComb()
	{
		for(List<Integer> list : resultArray)
		{
			for(Integer i : list)
			{
				System.out.print(i+"\t");
			}
			System.out.println();
		}
		
	}
	public static void combination(int a[], int k, int n, int[] temp, int val)
	{
		if(k==n-1)
		{
			a[k]=0;
			addComb(a,n, temp, val);
			a[k]=1;
			addComb(a,n,temp, val);
			return;
		}
		a[k]=0;
		combination(a,k+1,n,temp, val);
		a[k]=1;
		combination(a,k+1,n,temp, val);
		
	}
	public static void addComb(int a[], int n, int[] temp, int val)
	{
		for(int i=0;i<temp.length;i++)
		{
			System.out.println(temp[i]);
		}
		int j=0;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==1)
			{
				sum++;
			}
		}
		List<Integer> dummy = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			if(a[i]==1)
			{
				dummy.add(temp[i]);
				
				j++;
			}
		}
		if(sum==val){
			resultArray.add(dummy);
		}
		index++;
	}
}