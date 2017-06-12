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

public class LinkedListImpl
{
	public static void main(String args[])
	{
		//Use the functions at their correct position, suppose if u want to add a new item after the last element in linked list
		//the instead of using addNewItemAfter(), use addNewItemAtEnd(), same for before first element, instead of using addNewItemBefore(),
		//use addNewItemInStart()
		LinkedList llist = new LinkedList();
		createList(llist);
		traverseList(llist);
		addNewItemAtEnd(4, llist);
		traverseList(llist);
		addNewItemInStart(0, llist);
		traverseList(llist);
		addNewItemAfter(100, 100, llist);
		traverseList(llist);
		addNewItemBefore(3, 200, llist);
		traverseList(llist);
		deleteGivenKey(0, llist);
		traverseList(llist);
		deleteAtGivenPosition(3, llist);
		traverseList(llist);
	}
	public static void createList(LinkedList llist)
	{
		llist.head = new LinkedList.Node(1);
		LinkedList.Node node2 = new LinkedList.Node(2);
		LinkedList.Node node3 = new LinkedList.Node(3);
		llist.head.next = node2;
		node2.next = node3;
	}
	public static void traverseList(LinkedList llist)
	{	
		LinkedList.Node temp=llist.head;
		if(temp == null)
		{
			System.out.println("Linked list is empty");
			return;
		}
		while(temp!=null)
		{
			System.out.print(temp.data+"\t");
			temp = temp.next;
		}
		System.out.println();
	}
	public static void addNewItemAtEnd(int item, LinkedList llist)
	{
		LinkedList.Node temp = llist.head;
		if(temp == null)
		{
			llist.head = new LinkedList.Node(item);
			return;
		}
		LinkedList.Node node = new LinkedList.Node(item);
		while(temp.next!=null)
		{
			temp = temp.next;
		}
		temp.next = node;
	}
	public static void addNewItemInStart(int item, LinkedList llist)
	{
		LinkedList.Node node = new LinkedList.Node(item);
		LinkedList.Node temp = llist.head;
		llist.head = node;
		node.next = temp;
	}
	public static void addNewItemAfter(int givenItem, int item, LinkedList llist)
	{
		LinkedList.Node node = new LinkedList.Node(item);
		LinkedList.Node temp = llist.head;
		Boolean flag=false;
		while(temp!=null)
		{
			if(temp.data == givenItem)
			{
				flag = true;
				break;
			}
			else
			{
				temp = temp.next;
			}
		}
		if(flag == false)
		{
			System.out.println("Given item is not present in linked list");
		}
		else{
			LinkedList.Node temp1 = temp.next;
			temp.next = node;
			node.next = temp1;
		}
	}
	public static void addNewItemBefore(int givenItem, int item, LinkedList llist)
	{
		LinkedList.Node node = new LinkedList.Node(item);
		LinkedList.Node temp = llist.head;
		Boolean flag=false;
		while(temp.next!=null)
		{
			if((temp.next).data == givenItem)
			{
				flag = true;
				break;
			}
			else
			{
				temp = temp.next;
			}
		}
		if(flag == false)
		{
			System.out.println("Given item is not present in linked list");
		}
		else{
			LinkedList.Node temp1 = temp.next;
			temp.next = node;
			node.next = temp1;
		}
	}
	public static void deleteGivenKey(int givenKey, LinkedList llist)
	{
		LinkedList.Node temp = llist.head;
		if(temp == null)
		{
			System.out.println("Linked list is empty");
			return;
		}
		if(givenKey == temp.data)
		{
			llist.head = temp.next;
			return;
		}
		Boolean flag = false;
		while(temp.next!=null)
		{
			if((temp.next).data == givenKey)
			{
				flag = true;
				break;
			}
			else{
				temp = temp.next;
			}
		}
		if(flag == false)
		{
			System.out.println("Given key doesn't exist in linked list");
		}
		else{
			temp.next = (temp.next).next;
		}
	}
	public static void deleteAtGivenPosition(int pos, LinkedList llist)
	{
		LinkedList.Node temp = llist.head;
		int count =1;
		while(count<pos)
		{
			temp=temp.next;
			count++;
		}
		LinkedList.Node temp1 = temp.next;
		temp.next=temp1.next;
	}
}