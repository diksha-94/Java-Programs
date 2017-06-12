public class BinarySearchIterative
{
	public static void main(String[] args)
	{
		int[] array = {1,2,12,23,34,45,56,67,78};
		int x=78;
		System.out.println(binarySearch(array, x));
	}
	public static int binarySearch(int[] array, int x)
	{
		int l=0;
		int r=array.length-1;
		while(l<=r)
		{
			int mid=l+(r-l)/2;
			if(x==array[mid])
			{
				return mid;
			}
			else if(x<array[mid])
			{
				r=mid-1;
			}
			else if(x>array[mid])
			{
				l=mid+1;
			}
		}
		return -1;
		
	}
}