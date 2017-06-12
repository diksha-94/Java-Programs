public class SortAndFormALargestNumber
{
	public static void main(String[] args)
	{
		int[] array = {5,3,30,34,9};
		int n=array.length;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<n;i++)
		{
			if(array[i]>max){
				max = array[i];
			}
		}
		System.out.println(max);
		for(int i=0;i<n;i++)
		{
			System.out.print(array[i]+"\t");
		}
	}
}