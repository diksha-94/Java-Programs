import java.util.*;
public class SpiralMatrix {
	public static void main(String[] args){
		System.out.println(generateMatrix(3));
	}
    public static ArrayList<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
	    
	public static ArrayList<ArrayList<Integer>> generateMatrix(int a) {
	    ArrayList<Integer> dummy = new ArrayList<Integer>();
		ArrayList<Integer> dummy1 = new ArrayList<Integer>();
		ArrayList<Integer> dummy2 = new ArrayList<Integer>();
	    for(int i=0;i<a;i++){
	        dummy.add(0);
			dummy1.add(0);
			dummy2.add(0);
	    }
	    result.add(dummy);
		result.add(dummy1);
		result.add(dummy2);
	    int firstRowI=0,firstRowJ=0,lastRowI=a,lastRowJ=a;
	    int firstColumnI=a,firstColumnJ=-1,lastColumnI=-1,lastColumnJ=a;
	    count++;
	    firstRow(firstRowI, firstRowJ, lastRowI, lastRowJ, firstColumnI, firstColumnJ, lastColumnI, lastColumnJ, a);
	    return result;
	}
	
	static int count=0;
	public static Set<String> set = new HashSet<String>();
	public static void firstRow(int firstRowI, int firstRowJ, int lastRowI, int lastRowJ, int firstColumnI, int firstColumnJ, int lastColumnI, int lastColumnJ, int n) {
	    while(firstRowI<n && firstRowJ<n && firstRowI>=0 && firstRowJ>=0 && !set.contains(firstRowI+","+firstRowJ)){
	        System.out.println(firstRowI+"------"+firstRowJ+"firstRow: "+result.get(firstRowI));
			result.get(firstRowI).set(firstRowJ,count);
			System.out.println("FIrstRow: "+result);
	        set.add(firstRowI+","+firstRowJ);
	        count++;
	        firstRowJ++;
	    }
		System.out.println("FIrstRow: "+result);
	    lastColumnI++;
	    lastColumnJ--;
	    if(set.size()!=(n*n))
	        lastColumn(firstRowI, firstRowJ, lastRowI, lastRowJ, firstColumnI, firstColumnJ, lastColumnI, lastColumnJ, n);
	}
	public static void lastRow(int firstRowI, int firstRowJ, int lastRowI, int lastRowJ, int firstColumnI, int firstColumnJ, int lastColumnI, int lastColumnJ, int n) {
	     while(lastRowI>=0 && lastRowJ>=0 && lastRowI<n && lastRowJ<n && !set.contains(lastRowI+","+lastRowJ)){
	        (result.get(lastRowI)).set(lastRowJ,count);
	        set.add(lastRowI+","+lastRowJ);
	        count++;
	        lastRowJ--;
	    }
		System.out.println("LastRow: "+result);
	    firstColumnI--;
	    firstColumnJ++;
	    if(set.size()!=(n*n))
	        firstColumn(firstRowI, firstRowJ, lastRowI, lastRowJ, firstColumnI, firstColumnJ, lastColumnI, lastColumnJ, n);
	}
	public static void firstColumn(int firstRowI, int firstRowJ, int lastRowI, int lastRowJ, int firstColumnI, int firstColumnJ, int lastColumnI, int lastColumnJ, int n) {
	     while(firstColumnI>=0 && firstColumnJ<n && firstColumnI<n && firstColumnJ>=0 && !set.contains(firstColumnI+","+firstColumnJ)){
	        (result.get(firstColumnI)).set(firstColumnJ,count);
	        set.add(firstColumnI+","+firstColumnJ);
	        count++;
	        firstColumnI--;
	    }
		System.out.println("FirstColumn: "+result);
	    firstRowI++;
	    firstRowJ++;
	    if(set.size()!=(n*n))
	        firstRow(firstRowI, firstRowJ, lastRowI, lastRowJ, firstColumnI, firstColumnJ, lastColumnI, lastColumnJ, n);
	}
	public static void lastColumn(int firstRowI, int firstRowJ, int lastRowI, int lastRowJ, int firstColumnI, int firstColumnJ, int lastColumnI, int lastColumnJ, int n) {
	     while(lastColumnI<n && lastColumnJ<n && lastColumnI>=0 && lastColumnJ>=0 && !set.contains(lastColumnI+","+lastColumnJ)){
	        (result.get(lastColumnI)).set(lastColumnJ,count);
	        set.add(lastColumnI+","+lastColumnJ);
	        count++;
	        lastColumnI++;
	    }
		System.out.println("LastColumn: "+result);
	    lastRowI--;
	    lastRowI--;
	    if(set.size()!=(n*n))
	        lastRow(firstRowI, firstRowJ, lastRowI, lastRowJ, firstColumnI, firstColumnJ, lastColumnI, lastColumnJ, n);
	}
}
