public class ImplementStrstr
{
	public static void main(String args[])
	{
		String s="GeeksFoGeeks";
		String x="For";
		int j=0;
		int index=-1;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==x.charAt(j))
			{
				if(j==x.length()-1)
				{
					index=i-j;
					break;
				}
				else
				{
					j++;
					continue;
				}
			}
			else
			{
				j=0;
			}
		}
		System.out.println(index);
	}
}