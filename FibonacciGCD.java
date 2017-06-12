/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
//imports for BufferedReader
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
/*
//import for Scanner and other utility  classes
import java.util.*;
*/

public class FibonacciGCD {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
        */
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = (br.readLine()).split(" ");
        int N = Integer.parseInt(line[0]);
        int Q = Integer.parseInt(line[1]);
        
        String[] str = (br.readLine()).split(" ");
        int[] array = new int[N];
        for (int i = 0; i < N; i++) {
            array[i] = Integer.parseInt(str[i]);
        }
        
        int l=0;
        int r=0;
        for(int i = 0;i<Q;i++)
        {
            String[] query = (br.readLine()).split(" ");
            l = Integer.parseInt(query[0]);
            r = Integer.parseInt(query[1]); //from l-1 to r-1
			ArrayList<Integer> list = new ArrayList<Integer>();
            for(int j=l-1;j<=r-1;j++)
            {
                
                list.add(findTerm(array[j]));
            }
            
            System.out.println(Integer.parseInt(findGcd(list)%(Math.pow(10,9)+7)));
        }
    }
    public static int findTerm(int n){
		if(n==1 || n==2){
			return 1;
		}
		return findTerm(n-1)+findTerm(n-2);
	}
	public static int findGcd(ArrayList<Integer> list){
		System.out.println(list);
	    if(list.size() == 1){
	        return list.get(0);
	    }
	    int a = list.get(0);
        int b = list.get(1);
		
        list.remove(1);
        list.remove(0);
	    if(a==0)
	    {
	        list.add(a);
	        return findGcd(list);
	    }
	    if(b==0)
	    {
	        list.add(b);
	        return findGcd(list);
	    }
	    if(b<a)
	    {
	        int temp=a;
	        a=b;
	        b=temp;
	    }
	    int m=a,n=b;
	    while(b>a)
	    {
	        if((b-a)>a)
	        {
	            b=b-a;
	        }
	        else
	        {
	            a=b-a;
	            b=m;
	            m=a;
	        }
	    }
		System.out.println("GCD is: "+b);
	    list.add(b);
	    return findGcd(list);
		
	}
}
