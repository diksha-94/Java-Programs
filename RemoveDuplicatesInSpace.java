import java.util.*;
public class RemoveDuplicatesInSpace {
	public static void main(String[] args)
	{
		ArrayList<Integer> a = new ArrayList<Integer>();
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(1);
		a.add(2);
		a.add(2);
		a.add(3);
		a.add(3);
		a.add(4);
		System.out.println(removeDuplicates(a));
		System.out.println(a);
	}
	public static int removeDuplicates(ArrayList<Integer> a) {
	    int num = a.get(0);
	    int count = 0;
	    int removed = 0;
		int len = a.size();
		int i = 0;
	    for(i = 1;i<len;i++){
			if(a.get(i-removed)==num){
			   count++;
	        }
	        else{
				System.out.println(count);
	            for(int j=0;j<count;j++){
			        a.remove(i-1-removed);
	                removed++;
	            }
			    num = a.get(i-removed);
			    count = 0;
	        }
	    }
		if(count>0){
			for(int j=0;j<count;j++){
			        a.remove(i-1-removed);
	                removed++;
	            }
		}
		
	    return len-removed;
	}
}
