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
public class Add1ToTheNumber{
	public static void main(String[] args){
		Node head = new Node(9);
		Node node2 = new Node(9);
		Node node3 = new Node(9);
		//Node node4 = new Node(9);
		/*Node node5 = new Node(9);
		Node node6 = new Node(9);
		Node node7 = new Node(9);*/
		head.next = node2;
		node2.next = node3;    
		//node3.next = node4;
		/*node4.next = node5;
		node5.next = node6;
		node6.next = node7;*/
		printLinkedList(head);
		Node tempo = reverseLinkedList(head);
		System.out.println();
		printLinkedList(tempo);
		Node tempo1 = addOne(tempo);
		System.out.println();
		printLinkedList(tempo1);
		Node tempo2 = reverseLinkedList(tempo1);
		System.out.println();
		printLinkedList(tempo2);
	}
	
	public static void printLinkedList(Node head){
		Node temp = head;
		while(temp!=null){
			System.out.print("-> "+temp.data);
			temp = temp.next;
		}
	}
	public static Node reverseLinkedList(Node head){
		Node ptr1 = head;
		Node ptr2 = ptr1.next;
		Node ptr3 = ptr2.next;
		ptr2.next = ptr1;
		ptr1.next = null;
		while(ptr3 != null)
		{
			ptr1 = ptr2;
			ptr2 = ptr3;
			ptr3 = ptr3.next;
			
			ptr2.next = ptr1;
		}
		head  = ptr2;
		return head;
	}
	public static Node addOne(Node head){
		int carry = 0;
		Node temp = head;
		while(temp != null){
			if(temp == head){
				temp.data += 1;
			}
			
			if(carry == 1)
			{
				temp.data += carry;
				carry = 0;
			}
			if(temp.data>9 && temp.next!=null){
				temp.data = 0;
				carry = 1;
			}
			temp = temp.next;
		}
		return head;
	}
}