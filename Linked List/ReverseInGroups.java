class Node{
	int data;
	Node  next;
	public Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}
public class ReverseInGroups{
	public static int length = 0;
	public static int groups = 0;
	public static void main(String[] args){
		Node head = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(2);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		Node node7 = new Node(7);
		Node node8 = new Node(8);
		head.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		node6.next = node7;
		node7.next = node8;
		printLinkedList(head);
		System.out.println("Length: "+length);
		int n=4;
		if(length%n == 0){
			groups = length/n;
		}
		else{
			groups = length/n + 1;
		}
		System.out.println("Groups: "+groups);
		Node t = reverseInGroups(head, true, head, n);
		printLinkedList(t);
	}
	
	
	public static void printLinkedList(Node head){
		Node temp = head;
		while(temp!=null){
			System.out.print("-> "+temp.data);
			length++;
			temp = temp.next;
		}
	}
	public static int count = 0;
	public static Node reverseInGroups(Node head, Boolean first, Node previous, int n){
		Node temp = head;
		Node ptr1 = temp;
		Node ptr2 = ptr1.next;
		Node ptr3 = ptr2.next;
		int k = 0;
		ptr2.next = ptr1;
		ptr1.next = null;
		k++;
		while(ptr3!=null && k<(n-1)){
			ptr1 = ptr2;
			ptr2 = ptr3;
			ptr3 = ptr3.next;
			ptr2.next = ptr1;
			k++;
		}
		
		if(first == true){
			previous = ptr2;
		}
		else{
			previous.next = ptr2;
		}
		count++;
		if(count == groups){
			System.out.println("Inside equals");
			return previous;
		}
		else if(ptr3 == null || k>=(n-1)){
			//count++;
			System.out.println("Inside calling again");
			reverseInGroups(ptr3, false, head, n);
			
		}
		else{
			return previous;
		}
		return previous;
	}
}