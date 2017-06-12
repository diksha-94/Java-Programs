class LinkedList
{
	Node head;
	class Node{
		int data;
		Node next;
		Node(int data)
		{
			this.data = data;
		}
	}
}

public class LinkedListImpl
{
	public static void main(String args[])
	{
		createList();
	}
	public static void createList()
	{
		LinkedList llist = new LinkedList();
		llist.head = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		llist.head.next = node2;
		node2.next = node3;
		node3.next = null;
	}
	public static void traverseList()
	{
		Node temp=head;
		while(temp!=null)
		{
			System.out.print(temp.data+"\t");
			temp = temp.next;
		}
	}
}