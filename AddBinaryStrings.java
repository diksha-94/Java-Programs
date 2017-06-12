public class AddBinaryStrings {
	public static void main(String[] args)
	{
		System.out.println(addBinary("1010110111001101101000","1000011011000000111100110"));
	}
	public static String addBinary(String a, String b) {
	    int i = a.length()-1;
	    int j = b.length()-1;
	    int carry = 0;
	    String str = "";
	    char ch1;
	    char ch2;
	    while(i>=0 && j>=0)
	    {
	        ch1 = a.charAt(i);
	        ch2 = b.charAt(j);
			System.out.println(ch1+"-----"+ch2+"-----"+carry);
	        switch(""+ch1+ch2+carry) {
	            case "111":
	                str+="1";
	                carry=1;
					break;
	           case "110":
	                str+="0";
	                carry=1;
					break;
	           case "010":
	                str+="1";
	                carry=0;
					break;
	           case "011":
	                str+="0";
	                carry=1;
					break;
	           case "100":
	                str+="1";
	                carry=0;
					break;
	           case "101":
	                str+="0";
	                carry=1;
					break;
				case "001":
	                str+="1";
	                carry=0;
					break;
				case "000":
					str+="0";
					carry=0;
	        }
			System.out.println(str);
	        i--;
	        j--;
	    }
	    while(i>=0)
	    {
	        ch1 = a.charAt(i);
			System.out.println(""+ch1+carry);
	        switch(""+ch1+carry){
	            case "10":
	                str+=1;
	                carry=0;
					break;
	           case "11":
	                str+=0;
	                carry=1;
					break;
	           case "01":
	                str+=1;
	                carry=0;
					break;
	           case "00":
	                str+=0;
	                carry=0;
	        }
			System.out.println(str);
	        i--;
	    }
	    while(j>=0)
	    {
	        ch2 = b.charAt(j);
			System.out.println(""+ch2+carry);
	        switch(""+ch2+carry){
	            case "10":
	                str+=1;
	                carry=0;
					break;
	           case "11":
	                str+=0;
	                carry=1;
					break;
	           case "01":
	                str+=1;
	                carry=0;
					break;
	           case "00":
	                str+=0;
	                carry=0;
	        }
			System.out.println(str);
	        j--;
	    }
		if(carry == 1)
		{
			str+=carry;
		}
		//System.out.println("str: "+str);
	    String output = "";
	    for(int k=str.length()-1;k>=0;k--)
	    {
	        output+=str.charAt(k);
	    }
	    return output;
	}
}
