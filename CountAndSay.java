public class CountAndSay {
	public static void main(String[] args) {
		int a=2;
	    String initial = "1";
	    while(a>1)
	    {
	        initial = findSequence(initial);
			System.out.println("initial: "+initial);
	        a--;
	    }
	    System.out.println("Result: "+initial);
	}
	public static String findSequence(String current)
	{
	    char ch = current.charAt(0);
	    int count=1;
	    String str="";
	    for(int i=1;i<current.length();i++)
	    {
	        if(ch==current.charAt(i)){
	            count++;
	        }
	        else
	        {
	            str+=count;
	            str+=ch;
	            ch = current.charAt(i);
	            count=1;
	        }
	    }
	    str+=count;
	    str+=ch;
	    return str;
	}
}
