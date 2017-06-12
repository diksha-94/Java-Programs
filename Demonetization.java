public class Demonetization
{
	public static void main(String[] args)
	{
		int input1=5;
		int[] array = {1,2,3,6,7,9,11,22,44,50};
		int result = demonetization(input1,array);
	}
	public static int demonetization(int input1, int[] array)
	{
		
	}
	public static void combination(int[] a, int k, int n, int[] temp,int size)
	{
		if(k==n-1)
		{
			a[k]=0;
			addComb(a,n, temp, size);
			a[k]=1;
			addComb(a,n,temp, size);
			return;
		}
		a[k]=0;
		combination(a,k+1,n,temp, size);
		a[k]=1;
		combination(a,k+1,n,temp, size);
	}
	public static void addComb(int a[], int n, int[] temp, int size)
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
		if(sum==size){
			resultArray.add(dummy);
		}
		index++;
	}
}














































	