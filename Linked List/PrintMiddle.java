class Node{
	int data;
	Node  next;
	public Node(int data)
	{
		this.data = data;
		this.next = null;
	}
}
public class PrintMiddle{
	public static void main(String[] args){
		Node head = new Node(1);
		Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		Node node6 = new Node(6);
		head.next = node2;
		node2.next = node3;
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		printLinkedList(head);
		printMiddleElement(head);
	}
	
	public static void printLinkedList(Node head){
		Node temp = head;
		while(temp!=null){
			System.out.print("-> "+temp.data);
			temp = temp.next;
		}
	}
	public static void printMiddleElement(Node head){
		int length = 0;
		Node temp = head;
		while(temp!=null){
			length++;
			temp = temp.next;
		}
		System.out.println("Length: "+length);
		int mid = 0;
		
			mid = (length/2)+1;
		
			//mid = length/2;
		temp = head;
		while(mid>1){
			temp = temp.next;
			mid--;
		}
		System.out.println("Mid Element: "+temp.data);
	}
}