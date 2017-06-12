import java.util.*;
public class RearrangeArray {
	public static void main(String[] args){
		ArrayList<Integer> a=new ArrayList<Integer>();
		a.add(4);
		a.add(0);
		a.add(2);
		a.add(1); 
		a.add(3);
		ArrayList<Integer> b=new ArrayList<Integer>();
		b.add(4);
		b.add(0);
		b.add(2);
		b.add(1); 
		b.add(3);
	    for(int i=0;i<a.size();i++)
	    {
			System.out.println(i+"---"+a.get(i));
	        b.set(i,a.get(a.get(i)));
	        
	    }
	    System.out.println(b);
	}
}
