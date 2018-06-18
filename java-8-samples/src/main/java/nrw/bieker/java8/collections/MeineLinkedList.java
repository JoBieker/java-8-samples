package nrw.bieker.java8.collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MeineLinkedList {

	public static void main(String[] args) {
		/*
		 * ArrayLists manage arrays internally.
		 * [0][1][2][3][4] ...
		 */
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		/*
		 * LinkedLists consists of elements where each element
		 * has a reference to the previous and next element
		 */
		LinkedList<Integer> linkedList = new LinkedList<Integer>();
		doTimmings("ArrayList", arrayList);
		doTimmings("LinkedList", linkedList);

	}
	
	private static void doTimmings(String type, List<Integer> list) {
		
		for(int i=0; i<1E5; i++) {
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		// Add items at the end of the list
		for(int i=0; i<1E5; i++) {
			list.add(i);
		}
		long end = System.currentTimeMillis();
		System.out.println("Time taken: " +(end-start)+ " ms for "+type+" when adding items at the end");
		
		
		start = System.currentTimeMillis();
		// Add items at the end of the list
		for(int i=0; i<1E5; i++) {
			list.add(0,i);
		}
		end = System.currentTimeMillis();
		System.out.println("Time taken: " +(end-start)+ " ms for "+type+" when adding items at the beginning");
	}

}