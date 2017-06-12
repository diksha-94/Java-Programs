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

public class NodeAtnthIndex
{
	public static void main(String args[])
	{
		LinkedList llist = new LinkedList();
		createList(llist);
		nodeAtNthIndex(2, llist);
	}
	public static void createList(LinkedList llist)
	{
		llist.head = new LinkedList.Node(1);
		LinkedList.Node node2 = new LinkedList.Node(10);
		LinkedList.Node node3 = new LinkedList.Node(30);
		LinkedList.Node node4 = new LinkedList.Node(14);
		llist.head.next = node2;
		node2.next = node3;
		node3.next = node4;
	}
	public static void nodeAtNthIndex(int index, LinkedList llist)
	{
		int count = 0;
		LinkedList.Node temp = llist.head;
		while(temp!=null)
		{
			count++;
			temp =temp.next;
		}
		
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
		System.out.println("Item at index "+index+" : "+temp.data);
		
		
	}
}