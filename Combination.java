public class Combination
{
	
	static char[] originalArray={'a','b','c','d'};
	static char[] tempArray={'a','b','c','d'};
	static Double num=Math.pow(2,tempArray.length);
	static int n=num.intValue();
	static char[][] resultArray=new char[n][];
	static int index=0;
	public static void main(String args[])
	{
		combination(originalArray, 0, originalArray.length);
		printAllComb();
	}
	public static void printAllComb()
	{
		for(int i=0;i<n;i++)
		{
			//if(resultArray[i].length==2)
			{
				for(int j=0;j<resultArray[i].length;j++)
				{
					System.out.print(resultArray[i][j]);
				}
				System.out.println();
			}
			
		}
		
	}
	public static void combination(char a[], int k, int n)
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
	public static void addComb(char a[], int n)
	{
		int j=0;
		int sum=0;
		for(int i=0;i<n;i++)
		{
			if(a[i]==1)
			{
				sum++;
				//System.out.print(tempArray[i]);
			}
		}
		resultArray[index]=new char[sum];
		for(int i=0;i<n;i++)
		{
			if(a[i]==1)
			{
				resultArray[index][j]=tempArray[i];
				j++;
				//System.out.print(tempArray[i]);
			}
		}
		
		index++;
		//System.out.println();
	}
}