package nrw.bieker.java8.collections;

import java.util.HashMap;
import java.util.Map;

public class MeineHashMap {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		// Adding elements to map
		map.put(1, "One");
		map.put(2, "Two");
		map.put(3, "Three");
		map.put(4, "Four");
		map.put(5, "Five");
		
		// Retrieving elements from map
		String text = map.get(4);
		System.out.println(text);
		
		// Null is returned when given key does not exist in map
		text = map.get(0);
		System.out.println(text);

		// Iterate over elements in map
		for(Map.Entry<Integer, String> entry: map.entrySet() ) {
			System.out.println("Element "+entry.getKey()+" contains value " +entry.getValue());
		}

		//Adding an element with a key that already exists in the map
		map.put(5,"Hello");
		
		// Iterating again to show how map handles putting elements with existing keys
		System.out.println("Iterating again to show how map handles putting elements with existing keys");
		for(Map.Entry<Integer, String> entry: map.entrySet() ) {
			System.out.println("Element "+entry.getKey()+" contains value " +entry.getValue());
		}
		System.out.println("Caveat: HashMaps do not maintain order. It can change randomly. So do never rely on it.");
		

	}

}