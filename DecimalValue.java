public class DecimalValue
{
	public static void main(String args[])
	{
		Double d=0.11;
		int n=d.intValue();
		if(n>0)
		{
			System.out.println(d);
		}
		else
		{
			//Double newD=d-n;
			System.out.println((int)(d*100));
		}
	}
}