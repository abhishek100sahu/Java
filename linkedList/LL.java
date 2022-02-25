package linkedList;

class LL {
	Node head;
	
	private int size;
	
	LL() {
		this.size = 0;
	}
	
	class Node {
		String data;
		Node next;
		
		Node(String data) {
			this.data= data;
			this .next = null;
			size++;
		}
	}
	
	//Add - First, Last
	public void addFirst(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		newNode.next = head;
		head = newNode;
	}
	
	public void addLast(String data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
			return;
		}
		
		Node currNode = head;
		while(currNode.next != null) {
			currNode = currNode.next;
		}
		
		currNode.next = newNode;
	}
	
	//Print
	public void printList() {
		if(head == null) {
			System.out.print("list is empty");
			return;
		}
		
		Node currNode = head;
		while(currNode != null) {
			System.out.print(currNode.data + " -> ");
			currNode = currNode.next;
		}
		
		System.out.println("NULL");
	}
	
	//Delete First
	public void deleteFirst() {
		if (head == null) {
			System.out.println("The list is empty");
			return;
		}
		size--;
		head = head.next;
	}
	
	//delete Last
	public void deleteLast() {
		if(head == null) {
			System.out.println("The list is empty");
			return;
		}
		size--;
		if(head.next == null) {
			head = null;
			return;			
		}
		
		Node secondLast = head;
		Node lastNode = head.next;
		while(lastNode.next != null) {
			lastNode = lastNode.next;
			secondLast = secondLast.next;
		}
		
		secondLast.next = null;
	}
	
 	public int getSize() {
 		System.out.println("Size : "+size);
 		return size;
 	}
 	
 	//Reverse through Iteration
	public void reverseIterate() {
		if(head == null || head.next ==null) {
			return;
		}
		
		Node prevNode = head;
		Node currNode = head.next;
		while(currNode != null) {
			Node nextNode = currNode.next;
			currNode.next = prevNode;
			
			//Update
			prevNode = currNode;
			currNode = nextNode;
		}
		head.next = null;
		head = prevNode;
	}
	
	//Reverse through Recursion
	public Node reverseRecursive(Node head) {
		if(head == null || head.next == null) {
			return head;
		}	
		Node newHead = reverseRecursive(head.next);	
		head.next.next = head;
		head.next = null;
			
		return newHead;
	}
 	
	public static void main (String args []) {
		LL list = new LL();
		list.addFirst("a");
		list.addFirst("is");
		list.printList();
		list.getSize();
		
		list.addLast("list");
		list.printList();
		list.getSize();
		
		list.addFirst("This");
		list.printList();
		list.getSize();
		
		list.deleteFirst();
		list.printList();
		list.getSize();
		
		list.deleteLast();
		list.printList();
		list.getSize();
		
		list.addFirst("This");
		list.addLast("list");
		list.printList();
		
		list.reverseIterate();
		list.printList();
		
		list.head = list.reverseRecursive(list.head);
		list.printList();
	}
}
