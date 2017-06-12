import java.util.*;
public class NonRepeatingDigits
{
	public static void main(String[] args)
	{
		System.out.println(playingWithDigits(3456));
	}

	public static int count = 0;
    public static int playingWithDigits(int input1)
    {
	    //Write code here
	    for(int i=1;i<=input1;i++)
	    {
	        havingRepeatingDigit(i);
	    }
	    return count;
    }
    public static void havingRepeatingDigit(int num)
    {
        Boolean repeat = false;
        int n = num;
        Set<Integer> set = new HashSet<Integer>();
        int rem;
        while(num>0)
        {
            rem = num%10;
            if(set.contains(rem))
            {
                repeat = true;
                break;
            }
            set.add(rem);
            num=num/10;
        }
        if(repeat == false){
            System.out.println("Non repeating: "+n);
            count++;
            
        }
        else
        {
            System.out.println("Repeating: "+n);
        }
    }
}