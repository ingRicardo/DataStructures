package LinkedList;



public class LinkedListRecursive {
	Node head;
	static class Node{
		
		
		int data;
		Node next;

		public Node(int d) {
			this.data = d;
			this.next = null;
			
		}
		
	}
	
	
	public static void print(Node head) {
		
		while (head != null) {
			System.out.println(head.data);
			
			head = head.next;
		}
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated 
		LinkedListRecursive.Node head = new Node(1);
		head.next =  new Node(2);
		head.next.next = new Node(3);
		print(reverseRecursively(head));
		
	}

	public static Node reverseRecursively(Node head) {
		
		if (head == null)
			return head;
		
		if (head.next == null) 
			return head;
		
		Node newHeadNode = reverseRecursively(head.next);
		head.next.next = head; 
		
		head.next = null;
		
	
		return newHeadNode;
	}
}
