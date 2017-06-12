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

class StringQueries {
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
        
		String str = br.readLine();
		String[] query;
		int start,end;
		String subStr;
		for(int i=0;i<Q;i++)
		{
			query = (br.readLine()).split(" ");
			start = Integer.parseInt(query[0]);
			end = Integer.parseInt(query[1]);
			if(end>str.length()-1)
			{
				return;
			}
			int k=0;
			Set<Character> charSet = new HashSet<Character>();
			for(int j=start;j<=end;j++)
			{
				//subStr.charAt(k) = str.charAt(j);
				charSet.add(str.charAt(j));
				k++;
			}
			int value = (end-start+1)-(charSet.size());
			System.out.println(value);
			
		}

        
    }
}
