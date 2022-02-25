package linkedList;
import java.util.LinkedList;

public class CollectionFramework {
	public static void main(String args[]) {
		LinkedList<String> list = new LinkedList<String>();
		
		list.addFirst("a");
		list.addFirst("is");
		System.out.println(list);
		
		list.addLast("list");
		list.addFirst("This");
		System.out.println(list);
		
		list.remove(2);
		System.out.println(list);
		
		list.removeLast();
		System.out.println(list);
		
		list.add("a");
		list.add("list");
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" -> ");
		}
		System.out.println("null");
		
		list.set(list.size()-1, "redefined");
		list.add("list");
		
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" -> ");
		}
		System.out.println("null");
	}
}
