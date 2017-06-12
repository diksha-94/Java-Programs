public class EncodingString
 {
	public static String encode(String str)
	{
          //Your code here
          int count=1;
          String encodedStr="";
          for(int i=0;i<str.length();i++)
          {
              
              if(i!=str.length()-1 && str.charAt(i)==str.charAt(i+1))
              {
                  count++;
              }
              
              else if(i==str.length()-1)
              {
                  encodedStr+=str.charAt(i);
                  encodedStr+=count;
                  count=1;
              }
              else
              {
                  encodedStr+=str.charAt(i);
                  encodedStr+=count;
                  count=1;
              }
          }
          return encodedStr;
	}
	public static void main(String args[])
	{
		System.out.println(encode("wwwwaaadexxxxxx"));
	}
	
 }