public class InsertionSort
{
	public static void main(String[] args)
	{
		int[] arr={64,25,12,22,11,0,-90};
		insertionSort(arr);
	}
	public static void insertionSort(int[] arr)
	{
		int len=arr.length;
		for(int i=1;i<len;i++)
		{
			int j=i-1;
			int x=arr[i];
			while(j>=0 && arr[j]>x)
			{
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=x;
		}
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
}