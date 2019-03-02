package LinkedList;

public class LinkedList {

	Node head;
	
	static class Node{
		
		int data;
		Node next;
		
		public Node(int d) {
			this.data = d;
			this.next = null;
		}
		
	}
	
	public static void printlst(Node head){
		
		while(head != null) {
			
			System.out.println(head.data);
			
			head = head.next;
			
		}
	}
	
	
	static public void Middle(Node head) {
		Node current =  head;
		Node middle = head;
		int len = 0;
		
		while (current != null) {
			len++;
			
			if (len%2 == 0 ) {
				middle = middle.next;
			}
			current = current.next;
		}
		
		if (len%2 ==1)
			middle = current;
		
		System.out.println("lenght - >> " + len);
		System.out.println("middle ->> " + middle.data);
		 
	}
	
	public static boolean hasCircle(Node head) {
		
		Node node = head.next;
		
		while (node !=null && node != head )
			node = node.next;
		
		return (node == head);
	}
	
	
	public static Node reverse(Node head) {
		
		Node prev = null;
		Node current = head;
		Node next = null;
		while (current != null) {				
			
			next =  current.next;			
			current.next =  prev;
			
			prev = current;			
			current = next;
		}
		head=prev;
		return head;
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated 
		LinkedList.Node head  = new Node(1);
		head.next = new Node(2);
		head.next.next =  new Node(3);
		head.next.next.next =  new Node(4);
		//head.next.next.next.next =  head;
		//printlst(head);
		
		//Middle(head);
		//System.out.println(hasCircle(head));
		printlst(reverse(head));
	}

}
