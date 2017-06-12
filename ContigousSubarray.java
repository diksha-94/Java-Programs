import java.util.*;
public class ContigousSubarray
{
	static int[] originalArray={-101,-200,-300,-400,-500};
	static int[] tempArray={-101,-200,-300,-400,-500};
	static List<List<Integer>> resultArray1=new ArrayList<List<Integer>>();
	
	public static void main(String args[])
	{
		combination(originalArray, 0, originalArray.length);
		printAllComb1();
	}
	public static void printAllComb1()
	{
		Double maxD=Double.POSITIVE_INFINITY*-1;
		int max=maxD.intValue();
		//System.out.println(max);
		int sum=0;
		for(List<Integer> list : resultArray1)
		{
			sum=0;
			for(int elem : list)
			{
				sum+=elem;
				System.out.print(elem);
			}
			if(sum>max)
			{
				max=sum;
			}
			
			System.out.println();
		}
		System.out.println("Max: "+max);
	}
	public static void combination(int a[], int k, int n)
	{
		if(k==n-1)
		{
			a[k]=0;
			addComb(a,n);
			a[k]=1;
			addComb(a,n);
			return;
		}
		a[k]=0;
		combination(a,k+1,n);
		a[k]=1;
		combination(a,k+1,n);
		
	}
	public static void addComb(int a[], int n)
	{
		int flag0=0;
		int flag1=0;
		int flag=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==0)
			{
				flag=1;
			}
			else if(a[i]==1)
			{
				flag=0;
				break;
			}
		}
		if(flag==1)
		{
			return;
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]==1)
			{
				if(flag0==0)
				{
					flag1=1;
				}
				else if(flag0==1)
				{
					return;
				}
			}
			if(a[i]==0)
			{
				if(flag1==1)
				{
					flag0=1;
				}
				else if(flag1==0)
				{
					flag0=0;
				}
			}
		}
		List<Integer> dummy=new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			if(a[i]==1)
			{
				dummy.add(tempArray[i]);
			}
		}
		resultArray1.add(dummy);
		
	}
}