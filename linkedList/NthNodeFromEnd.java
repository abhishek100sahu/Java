package linkedList;

public class NthNodeFromEnd {
	NthNodeFromEnd head;
	NthNodeFromEnd next;
	public NthNodeFromEnd removeNthFromEnd(NthNodeFromEnd head, int n) {
		if(head.next == null) {
			return null;
		}
		
		//Size
		int size = 0;
		NthNodeFromEnd curr = head;
		while(curr != null) {
			curr = curr.next;
			size++;
		}
		
		if(n == size) {
			return head.next;
		}
		
		int indexToSearch = size-n;
		NthNodeFromEnd prev = head;
		int i = 1;
		while(i < indexToSearch) {
			prev = prev.next;
			i++;
		}
		
		prev.next = prev.next.next;
		return head;
	}
}
