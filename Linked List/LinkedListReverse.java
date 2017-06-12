//Reverse of a linked list
 
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
public class LinkedListReverse
{
	public static void main(String[] args)
	{
		LinkedList llist = new LinkedList();
		createList(llist);
		reverseOfLinkedList(llist);	//Assume that all the node data is unique
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
	public static void reverseOfLinkedList(LinkedList llist)
	{
		int start=1;
		LinkedList.Node temp = llist.head;
		int len=0;
		while(temp!=null)
		{
			temp=temp.next;
			len++;
		}
		int end=len;
		LinkedList.Node tempStart = null;
		LinkedList.Node tempEnd = null;
		LinkedList.Node tempStartPrev = null; 
		LinkedList.Node tempEndPrev = null;
		while(start<end)
		{
			temp = llist.head;
			int count=0;
			while(temp!=null)
			{
				if(count==start-1)
				{
					tempStart = temp;
				}
				if(count==end-1)
				{
					tempEnd = temp;
				}
				if(start == 1)
				{
					
				}
			}
		}
	}
	
}