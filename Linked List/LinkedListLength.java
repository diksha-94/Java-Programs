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

public class LinkedListLength
{
	public static void main(String args[])
	{
		LinkedList llist = new LinkedList();
		createList(llist);
		lengthIteratively(llist);
		System.out.println(lengthRecursively(llist, llist.head));
	}
	public static void createList(LinkedList llist)
	{
		llist.head = new LinkedList.Node(1);
		LinkedList.Node node2 = new LinkedList.Node(2);
		LinkedList.Node node3 = new LinkedList.Node(3);
		llist.head.next = node2;
		node2.next = node3;
	}
	public static void lengthIteratively(LinkedList llist)
	{
		LinkedList.Node temp = llist.head;
		int count=0;
		
		while(temp!=null)
		{
			count++;
			temp = temp.next;
		}
		System.out.println("Length of linked list: "+count);
	}
	
	public static int lengthRecursively(LinkedList llist, LinkedList.Node node)
	{
		if(node==null)
			return 0;
		else
		{
			return 1+lengthRecursively(llist, node.next);
		}
	}
}