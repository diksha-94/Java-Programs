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
public class DeleteMiddle{
	public static void main(String[] args){
		Node head = new Node(1);
		/*Node node2 = new Node(2);
		Node node3 = new Node(3);
		Node node4 = new Node(4);
		Node node5 = new Node(5);
		//Node node6 = new Node(6);
		/*head.next = node2;
		node2.next = node3;    
		node3.next = node4;
		node4.next = node5;*/
		//node5.next = node6;
		printLinkedList(head);
		deleteMiddleElement(head);
		printLinkedList(head);
	}
	
	public static void printLinkedList(Node head){
		Node temp = head;
		while(temp!=null){
			System.out.print("-> "+temp.data);
			temp = temp.next;
		}
	}
	public static void deleteMiddleElement(Node head){
		int length = 0;
		Node temp = head;
		while(temp!=null){
			length++;
			temp = temp.next;
		}
		if(length>0){
		if(length == 1){
			return null;
		}
		int mid = (length/2)+1;
		
		temp = head;
		Node midNode = new Node();
		while(mid>2){
			temp = temp.next;
			midNode = temp.next;
			mid--;
		}
		//System.out.println("Mid Element: "+temp.data + "-----" + midNode.data);
		temp.next = midNode.next;
		}
	}
}