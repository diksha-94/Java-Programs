public class BinarySearchRecursive
{
	public static void main(String[] args)
	{
		int[] arr={1,2,3,4,5,6,7,8,9,10};
		int x=90;
		System.out.println(binarySearch(arr,x,0,arr.length-1));
	}
	public static int binarySearch(int[] arr, int x, int l, int r)
	{
		if(r>=l)
		{
			int mid=l+(r-l)/2;
			if(arr[mid]==x)
			{
				return mid;
			}
			else if(x<arr[mid])
			{
				return binarySearch(arr,x,l,mid-1);
			}
			else if(x>arr[mid])
			{
				return binarySearch(arr,x,mid+1,r);
			}
		}
		return -1;
	}
}

