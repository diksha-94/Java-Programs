class ATOI
{
    static void atoi(String str)
    {
	// Your code here
	    try
	    {
	        int num=Integer.parseInt(str);
	        System.out.println(num);
	    }
	    catch(Exception e)
	    {
	        System.out.println("-1");
	    }
    }
	public static void main(String args[])
	{
		atoi("123a");
	}
}