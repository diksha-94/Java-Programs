import java.util.*;
class Node{
	int data;
	Node  next;
	public Node(int data)
	{
		this.data = data;
		this.next = null;
	}
	public Node()
	{
		this.next = null;
	}
}
public class DeleteWithSum0{
	public static void main(String[] args){
		Node head = new Node(4);
		Node node2 = new Node(6);
		Node node3 = new Node(-10);
		Node node4 = new Node(8);
		Node node5 = new Node(9);
		Node node6 = new Node(10);
		Node node7 = new Node(-19);
		Node node8 = new Node(10);
		Node node9 = new Node(-18);
		Node node10 = new Node(20);
		Node node11 = new Node(25);
		head.next = node2;
		node2.next = node3;    
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		node8.next = node9;
		node9.next = node10;
		node10.next = node11;
		List<Integer> list = traverseLinkedList(head);
		int[] array = new int[list.size()];
		int[] tempArray = new int[list.size()];
		int index = 0;
		for(Integer i : list){
			array[index] = i;
			tempArray[index] = i;
			index++;
		}
		combination(array, tempArray, 0, array.length);
		int sum = 0;
		Boolean flag = false;
		List<Integer> toCheck = new ArrayList<Integer>();
		for(List<Integer> l : resultList){
			sum = 0;
			toCheck = new ArrayList<Integer>();
			flag = false;
			for(Integer item : l){
				sum += item;
				toCheck.add(item);
			}
			if(sum == 0){
				for(Integer in : toCheck){
					if(list.contains(in)){
						flag = true;
					}
					else{
						flag = false;
						break;
					}
				}
				if(flag == true){
					for(Integer in : toCheck){
						System.out.println(in);
						list.remove(in);
					}
				}
			}
		}
		System.out.println();
		System.out.println(list);
	}
	
	public static void combination(int a[], int temp[], int k, int n)
	{
		if(k==n-1)
		{
			a[k]=0;
			addComb(a,temp,n);
			a[k]=1;
			addComb(a,temp,n);
			return;
		}
		a[k]=0;
		combination(a,temp,k+1,n);
		a[k]=1;
		combination(a,temp,k+1,n);
		
	}
	public static List<List<Integer>> resultList = new ArrayList<List<Integer>>();
	public static void addComb(int a[],int[] temp,int n)
	{
		List<Integer> dummyList = new ArrayList<Integer>();
		for(int i=0;i<n;i++)
		{
			if(a[i]==1)
			{
				dummyList.add(temp[i]);
			}
		}
		
		resultList.add(dummyList);
	}
	public static List<Integer> traverseLinkedList(Node head){
		List<Integer> list = new ArrayList<Integer>();
		Node temp = head;
		while(temp!=null){
			System.out.print("-> "+temp.data);
			list.add(temp.data);
			temp = temp.next;
		}
		return list;
	}
	
}