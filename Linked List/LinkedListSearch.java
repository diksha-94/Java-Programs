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

public class LinkedListSearch
{
	public static void main(String args[])
	{
		LinkedList llist = new LinkedList();
		createList(llist);
		searchIteratively(7,llist);
		int result = searchRecursively(16,llist,llist.head);
		if(result<0)
		{
			System.out.println("Item doesn't exist in linked list.");
		}
		else
		{
			System.out.println("Item present at "+(result-1)+" position");
		}
		//System.out.println(lengthRecursively(llist, llist.head));
	}
	public static void createList(LinkedList llist)
	{
		llist.head = new LinkedList.Node(1);
		LinkedList.Node node2 = new LinkedList.Node(2);
		LinkedList.Node node3 = new LinkedList.Node(3);
		llist.head.next = node2;
		node2.next = node3;
	}
	public static void searchIteratively(int item, LinkedList llist)
	{
		LinkedList.Node temp = llist.head;
		Boolean flag = false;
		int index=-1;
		while(temp!=null)
		{
			if(temp.data == item)
			{
				index+=1;
				flag = true;
				break;
			}
			else
			{
				index+=1;
				temp = temp.next;
			}
		}
		if(flag == false)
		{
			System.out.println("Item doesn't exist in linked list.");
		}
		else{
			System.out.println("Item present at "+index+" position");
		}
	}
	public static int searchRecursively(int item, LinkedList llist, LinkedList.Node node)
	{
		if(node == null)
		{
			Double negInf = Double.POSITIVE_INFINITY*-1;
			int val = negInf.intValue();
			return val;
		}
		if(node.data ==  item)
		{
			return 1;
		}
		else{
			return 1+searchRecursively(item, llist, node.next);
		}
		
	}
}