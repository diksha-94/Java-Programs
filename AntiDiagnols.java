import java.util.*;
public class AntiDiagnols {
	public static void main(String[] args)
	{
		ArrayList<ArrayList<Integer>> input = new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> dummy=new ArrayList<Integer>();
		dummy.add(1);
		dummy.add(2);
		dummy.add(3);
		input.add(dummy);
		dummy=new ArrayList<Integer>();
		dummy.add(4);
		dummy.add(5);
		dummy.add(6);
		
		input.add(dummy);
		dummy=new ArrayList<Integer>();
		dummy.add(7);
		dummy.add(8);
		dummy.add(9);
		input.add(dummy);
		System.out.println(diagonal(input));
	}
	public static ArrayList<ArrayList<Integer>> diagonal(ArrayList<ArrayList<Integer>> a) {
	    int rows = a.size();
	    int cols = (a.get(0)).size();
	    ArrayList<Integer> dummy = new ArrayList<Integer>();
	    ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	    for(int  i =0;i<rows;i++)
	    {
	        for(int j=0;j<cols;j++)
	        {
	            dummy = new ArrayList<Integer>();
	            int m=i;
	            int n=j;
	            if(i==0 || j==cols-1){
	                while(m>=0 && n>=0 && m<rows && n<cols)
	                {
						System.out.println("m: "+m+"----n: "+n);
	                    dummy.add((a.get(m)).get(n));
	                    m++;
	                    n--;
	                }
	                result.add(dummy);
	                
	            }
	        }
	    }
	    return result;
	}
}
