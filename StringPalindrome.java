public class StringPalindrome {
	public static void main(String[] args) {
		String a=",,,";
	    a=a.toLowerCase();
		int len = a.length();
		
		int flag = 1;
	    int i=0,j=0;
	    //char iValue;
	    //char jValue;
	    for(i=0,j=len-1;i<=j;i++,j--)
	    {
			while( i<len && !alphaNumeric(a.charAt(i)))
			{
			    //iValue = a.charAt(i);
				i++;
			}
			while(j>=0 && !alphaNumeric(a.charAt(j)))
			{
			    //jValue = a.charAt(j);
				j--;
			}
			if(i==len || j==-1)
			{
			    flag=1;
			}
			else if((a.charAt(i)!=a.charAt(j)))
			{
			    flag = 0;
	            break;
			}
	    }
	    System.out.println(flag);
	}
	public static Boolean alphaNumeric(char a)
	{
		if((a>='a' && a<='z') || (a>='0' && a<='9'))
			return true;
		else 
			return false;
	}
}
