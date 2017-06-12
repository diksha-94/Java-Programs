import java.util.*;
public class CollectionsTest{
	public static void main(String[] args){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		//list.get(0);
		list.add(0,10);
		testMethod(list);
		
	}
	public static void testMethod(final ArrayList<Integer> list){
		System.out.println(list);
		list.add(20);
		System.out.println(list);
		list = new ArrayList<Integer>();
	}
}