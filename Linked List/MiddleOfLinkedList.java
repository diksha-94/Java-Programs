class LinkedList
{
	Node head;
	static class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
			this.next = null;
		}
	}
}

public class MiddleOfLinkedList
{
	public static void main(String args[])
	{
		LinkedList llist = new LinkedList();
		createList(llist);
		midElement(llist);
	}
	public static void createList(LinkedList llist)
	{
		llist.head = new LinkedList.Node(1);
		LinkedList.Node node2 = new LinkedList.Node(2);
		LinkedList.Node node3 = new LinkedList.Node(3);
		LinkedList.Node node4 = new LinkedList.Node(4);
		LinkedList.Node node5 = new LinkedList.Node(5);
		LinkedList.Node node6 = new LinkedList.Node(6);
		llist.head.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
	}
	public static void midElement(LinkedList llist)
	{
		int count = 0;
		LinkedList.Node temp = llist.head;
		while(temp!=null)
		{
			count++;
			temp =temp.next;
		}
		int index = count/2;
		if(index>=count)
		{
			System.out.println("Invalid index");
			return;
		}
		count = 0;
		temp = llist.head;
		while(temp!=null && count!=index)
		{
			count++;
			temp=temp.next;
		}
		System.out.println("Middle item: "+temp.data);
		
		
	}
}