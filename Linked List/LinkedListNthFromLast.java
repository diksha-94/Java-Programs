//Printing nth node from last of linked list

/*Steps-
 *Find the length of linked list
 *Do index=(length-N+1)
 *print the element at index from start(1 based indexing of linked list)
 */
 
class LinkedList
{
	Node head;
	static class Node{
		int data;
		Node next;
		public Node(int data)
		{
			this.data=data;
			this.next=null;
		}
	}
}
public class LinkedListNthFromLast
{
	public static void main(String[] args)
	{
		LinkedList llist = new LinkedList();
		createList(llist);
		nthFromLast(llist,4);	//Assume that all the node data is unique
	}
	public static void createList(LinkedList llist)
	{
		llist.head = new LinkedList.Node(10);
		LinkedList.Node node2 = new LinkedList.Node(15);
		LinkedList.Node node3 = new LinkedList.Node(12);
		LinkedList.Node node4 = new LinkedList.Node(13);
		LinkedList.Node node5 = new LinkedList.Node(20);
		LinkedList.Node node6 = new LinkedList.Node(14);
		
		llist.head.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
	}
	public static void nthFromLast(LinkedList llist, int posFromLast)
	{
		LinkedList.Node temp=llist.head;
		int count=0;
		while(temp!=null)
		{
			count++;
			temp=temp.next;
		}
		
		int index=count-posFromLast+1;
		if(count<posFromLast || index>count)
		{
			System.out.println("Index out of bound");
			return;
		}
		temp=llist.head;
	    count=0;
		while(temp!=null && count<index-1)
		{
			temp=temp.next;
			count++;
		}
		System.out.println(temp.data);
		
	}
	
}