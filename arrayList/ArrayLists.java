package arrayList;

import java.util.ArrayList;
import java.util.Collections;

class ArrayLists {
	public static void main(String args[]) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		
		//Add elements
		list.add(0);
		list.add(6);
		list.add(2);
		
		System.out.println(list);
		
		//Get elements
		int element = list.get(1);//6
		System.out.println(element);
		
		//Add elements in between
		list.add(1, 1);//[0, 1, 6, 2]
		System.out.println(list);
		
		//Set element
		list.set(2, 2);//[0,1,2,2]
		list.set(3, 3);//[0,1,2,3]
		System.out.println(list);
		
		//Delete element
		list.remove(2);//2 here represents index
		System.out.println(list);
		
		//Size of ArrayList
		int size = list.size();//3
		System.out.println(size);
		
		//Loops on ArrayList
		for(int i=0; i<list.size(); i++) {
			System.out.print(list.get(i)+" ");//i here represents index
		}
		System.out.println();
		
		list.set(0, 2);
		//Sorting in ArrayList
		Collections.sort(list);
		System.out.print(list);
	}
}
