package nrw.bieker.java8.collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class MeinSet {

	public static void main(String[] args) {
		
		Set<String> hashSet = new HashSet<String>();
		Set<String> linkedHashSet = new LinkedHashSet<String>();
		Set<String> treeSet = new TreeSet<String>();
		
		testSet(hashSet, "HashSet");
		testSet(linkedHashSet, "LinkedHashSet");
		testSet(treeSet, "TreeSet");
		testIntersection(treeSet, new TreeSet<String>());
	}

	private static void testIntersection(Set<String> set, TreeSet<String> set2) {
		System.out.println("**********************************************");
		System.out.println("testIntersection(set, set2)");
		System.out.println("**********************************************");
		set.add("dog");
		set.add("cat");
		set.add("mouse");
		set.add("bear");
		set.add("giraffe");
		set.add("tiger");

		set2.add("mouse");
		set2.add("bear");
		set2.add("giraffe");
		set2.add("tiger");
		
		Set<String> intersection = new HashSet<String>(set);
		System.out.println("set1 contains "+intersection);
		intersection.retainAll(set2);
		System.out.println("intersection contains "+intersection);
		
		Set<String> difference = new HashSet<String>(set);
		System.out.println("set1 contains "+difference);
		difference.removeAll(set2);
		System.out.println("Difference between set1 and set2 is "+difference);
	}

	private static void testSet(Set<String> set, String param) {
		System.out.println("**********************************************"); 
		System.out.println("testSet("+ param+")");
		System.out.println("**********************************************");
		// populate set with some items
		if(set.isEmpty()) {
			System.out.println("Set is empty at start!");
		}
		set.add("dog");
		set.add("cat");
		set.add("mouse");
		set.add("bear");
		set.add("giraffe");
		set.add("tiger");
		
		if(!set.isEmpty()) {
			System.out.println("Set is not empty after adding items!");
		}
		String string = "";
		if(param.equals("HashSet")) {
			string = param + " does not retain ";
		} 
		if(param.equals("LinkedHashSet")) {
			string = param + " does retain ";
		}
		if(param.equals("TreeSet")) {
			string = param + " does retain natural ";
		}
		System.out.println(string +" order ---");
		System.out.println(set);
		
		// Adding duplicate items
		System.out.println("Adding duplicate items to "+param+" and print to controll effect on set ---");
		set.add("dog");
		System.out.println(set);
		
		// Iterating through set
		System.out.println("Iterating through elements in "+param+" ----");
		for(String element: set) {
			System.out.println(element);
		}
		
		// Does set contain a given item?
		if(set.contains("cat")) {
			System.out.println("Set contains cat");
		}
		
		
	}

}