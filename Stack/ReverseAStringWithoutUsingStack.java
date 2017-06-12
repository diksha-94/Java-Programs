public class ReverseAStringWithoutUsingStack
{
	
	public static void main(String[] args)
	{
		String str = "Hello World !!";
		int n = str.length();
		for(int i=0;i<n/2;i++)
		{
		 str = swap(i,n-i-1,str);
		}
		System.out.println(str);
		
	}
	public static String swap(int i, int j, String str)
	{
		char temp = str.charAt(i);
		str = str.substring(0,i)+str.charAt(j)+str.substring(i+1);
		str = str.substring(0,j)+temp+str.substring(j+1);
		//str.setCharAt(i, str.charAt(j));
		//str.setCharAt(j, temp);
		return str;
	}
	//myName.substring(0,4)+'x'+myName.substring(5);
}
