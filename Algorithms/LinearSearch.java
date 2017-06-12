public class LinearSearch
{
	public static void main(String[] args)
	{
		int[] array = {23,12,34,56,1,0,2,3};
		int x=3;
		System.out.println(linearSearch(array, x));
	}
	public static int linearSearch(int[] array, int x)
	{
		for(int i=0;i<array.length;i++)
		{
			if(array[i]==x)
			{
				return i;
			}
		}
		return -1;
	}
}