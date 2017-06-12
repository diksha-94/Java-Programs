/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.math.*;
/*
//import for Scanner and other utility  classes
import java.util.*;
*/

class CoolNumber {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
        */
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        /*
        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();

        for (int i = 0; i < N; i++) {
            System.out.println("hello world");
        }
        */

        BigInteger l;
        BigInteger r;
        BigInteger sum=BigInteger.valueOf(0);
		List<BigInteger> result = new ArrayList<BigInteger>();
        for(int i=0;i<N;i++)
        {
            sum=BigInteger.valueOf(0);
            String[] values = (br.readLine()).split(" ");
            l=new BigInteger(values[0]);
            r=new BigInteger(values[1]);
            for(BigInteger j=l;j.compareTo(r)<=0;j = j.add(BigInteger.valueOf(1)))
            {
                sum=sum.add(coolNumber(j));
				
            }
			result.add(sum);
			
            
        }
		for(BigInteger item : result)
		{
			System.out.println(item);
		}
        
    }
    public static BigInteger coolNumber(BigInteger num)
    {
        BigInteger rem = BigInteger.valueOf(0);
        BigInteger n=num;
        Boolean flag = false;
        while(num.compareTo(BigInteger.valueOf(0))==1)		//num>0
        {
            rem = num.remainder(BigInteger.valueOf(10));
            if((rem.compareTo(BigInteger.valueOf(2)) ==0) || (rem.compareTo(BigInteger.valueOf(5)) ==0))
            {
                flag = true;
            }
            else 
            {
                flag = false;
                break;
            }
            num = num.divide(BigInteger.valueOf(10));
        }
        if(flag == true)
        {
            return n;
        }
        else
        {
            return coolNumber(n.add(BigInteger.valueOf(1)));
        }
    }
}
