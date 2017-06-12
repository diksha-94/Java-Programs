public class SelectionSort
{
	public static void main(String[] args)
	{
		int[] arr={64,25,12,22,11,0,-90};
		selectionSort(arr);
	}
	public static void selectionSort(int[] arr)
	{
		int len=arr.length;
		int index=-1;
		Double posInf = Double.POSITIVE_INFINITY;
		int min = posInf.intValue();
		for(int i=0;i<len-1;i++)
		{
			min=posInf.intValue();
			for(int j=i;j<len;j++)
			{
				if(arr[j]<min)
				{
					min=arr[j];
					index=j;
				}
			}
			int temp=arr[index];
			arr[index]=arr[i];
			arr[i]=temp;
		}
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
}