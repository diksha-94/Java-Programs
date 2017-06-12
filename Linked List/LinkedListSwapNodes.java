//Nodes to swap can be one after the other
//One node can be at the head , so there will be no previous for that node

//1) x and y may or may not be adjacent.
//2) Either x or y may be a head node.
//3) Either x or y may be last node.
//4) x and/or y may not be present in linked list.

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
public class LinkedListSwapNodes
{
	public static void main(String[] args)
	{
		LinkedList llist = new LinkedList();
		createList(llist);
		swapNodes(llist,15,15);	//Assume that all the node data is unique
		traverseList(llist);
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
	public static void swapNodes(LinkedList llist, int x, int y)
	{
		if(x==y)
		{
			return;	
		}
		LinkedList.Node temp=llist.head;
		LinkedList.Node xTemp=null;
		LinkedList.Node yTemp=null;
		LinkedList.Node xPrev=null;
		LinkedList.Node yPrev=null;
		if(temp.data==x)
		{
			xTemp=temp;
		}
		if(temp.data==y)
		{
			yTemp=temp;
		}
		while(temp.next!=null)
		{
			if((temp.next).data==x)
			{
				xPrev = temp;
				xTemp=temp.next;
			}
			if((temp.next).data==y)
			{
				yPrev=temp;
				yTemp=temp.next;
			}
			temp=temp.next;
		}
		if(xTemp==null || yTemp==null)
		{
			System.out.println("Nodes to swap is not present in linked list");
			return;
		}
		if(xTemp.next==yTemp || yTemp.next==xTemp)
		{
			LinkedList.Node temp1=yTemp.next;
			yTemp.next=xTemp;
			xTemp.next=temp1;
			xPrev.next=yTemp;
			return;
			
		}
		LinkedList.Node newTemp=xTemp.next;
		xTemp.next=yTemp.next;
		yTemp.next=newTemp;
		yPrev.next=xTemp;
		if(xTemp!=llist.head && yTemp!=llist.head)
		{
			xPrev.next=yTemp;
		}
		else
		{
			llist.head=yTemp;
		}
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
	
}