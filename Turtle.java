/* IMPORTANT: Multiple classes and nested static classes are supported */

/*
 * uncomment this if you want to read input.
 */
//imports for BufferedReader
import java.io.BufferedReader;
import java.io.InputStreamReader;
/*
//import for Scanner and other utility  classes
import java.util.*;
*/
import java.util.*;
public class Turtle {
    public static void main(String args[] ) throws Exception {
        /*
         * Read input from stdin and provide input before running
         * Use either of these methods for input
        */
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] line = (br.readLine()).split(" ");
        int N = Integer.parseInt(line[0]);
        int M = Integer.parseInt(line[1]);
        /*
        //Scanner
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        */
        int[][] array = new int[N][M];
        for (int i = 0; i < N; i++) {
            
            String[] dummy = (br.readLine()).split(" ");
            for(int j=0;j<M;j++){
                array[i][j] = Integer.parseInt(dummy[j]);
            }
        }
        for(int i = 0;i<N;i++){
            for(int j = 0;j<M;j++){
                System.out.print(array[i][j]);
                
            }
            System.out.println();
        }
        
		set.add("0,0");
        test(array,0,0,N,M);
		System.out.println(set1);
    }
	public static Boolean primeNumber(int num){
		Boolean flag = true;
		for(int i=2;i<=Math.sqrt(num);i++){
			if(num%i == 0){
				flag = false;
				break;
			}
		}
		return flag;
	}
	public static Set<String> set = new HashSet<String>();
	public static Set<Set<String>> set1 = new HashSet<Set<String>>();
	public static void test(int[][] array, int i, int j, int n, int m){
		if(i==n-1 && j==m-1){
			System.out.println("Inside 4");
			set1.add(set);
			set = new HashSet<String>();
			return;
		}
		if(i+1<n-1 && j<m-1 && primeNumber(array[i+1][j]) && !set.contains((i+1)+","+j)){
			System.out.println("Inside 1: "+(i+1)+"----"+j+"----"+array[i+1][j]);
			set.add(i+","+j);
			test(array, i+1, j, n, m);
		}
		if(i<n-1 && j+1<m-1 && primeNumber(array[i][j+1]) && !set.contains(i+","+(j+1))){
			System.out.println("Inside 2 "+i+"----"+(j+1)+"-----"+array[i][j+1]);
			set.add(i+","+j);
			test(array, i, j+1, n, m);
		}
		if(i+1<n-1 && j+1<m-1 && primeNumber(array[i+1][j+1]) && !set.contains((i+1)+","+(j+1))){
			System.out.println("Inside 3 "+(i+1)+"----"+(j+1)+"----"+array[i+1][j+1]);
			set.add(i+","+j);
			test(array, i+1, j+1, n, m);
		}
		//return set1;
	}
}
