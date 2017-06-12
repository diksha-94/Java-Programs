public class BubbleSort
{
	public static void main(String[] args)
	{
		int[] arr={64,25,12,22,11,0,-90};
		bubbleSort(arr);
	}
	public static void bubbleSort(int[] arr)
	{
		int len=arr.length;
		
		for(int i=0;i<len-1;i++)
		{
			for(int j=0;j<len-i-1;j++)
			{
				if(arr[j]>arr[j+1])
				{
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
			}
			
		}
		for(int i=0;i<len;i++)
		{
			System.out.print(arr[i]+"\t");
		}
	}
}