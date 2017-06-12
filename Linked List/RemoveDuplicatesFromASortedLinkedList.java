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
public class RemoveDuplicatesFromASortedLinkedList{
	public static void main(String[] args){
		Node head = new Node(11);
		Node node2 = new Node(11);
		Node node3 = new Node(11);
		Node node4 = new Node(21);
		Node node5 = new Node(43);
		Node node6 = new Node(43);
		//Node node7 = new Node(60);
		head.next = node2;
		node2.next = node3;    
		node3.next = node4;
		node4.next = node5;
		node5.next = node6;
		//node6.next = node7;
		printLinkedList(head);
		removeDuplicates(head);
		System.out.println();
		printLinkedList(head);
	}
	
	public static void printLinkedList(Node head){
		Node temp = head;
		while(temp!=null){
			System.out.print("-> "+temp.data);
			temp = temp.next;
		}
	}
	public static void removeDuplicates(Node head){
		Node temp = head;
		while(temp.next != null){
			if(temp.data == (temp.next).data){
				temp.next = (temp.next).next;
			}
			else{
				temp = temp.next;
			}
		}
	}
}