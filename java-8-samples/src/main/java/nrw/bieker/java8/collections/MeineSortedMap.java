package nrw.bieker.java8.collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

class Temp{
	
}

public class MeineSortedMap {

	public static void main(String[] args) {
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		System.out.println("What is a hashcode?");
		System.out.println(new Temp());
		
		testMap(hashMap, "HashMap");
		testMap(linkedHashMap, "LinkedMap");
		testMap(treeMap, "TreeMap");

	}

	private static void testMap(Map<Integer,String> map, String sortofMap) {
		map.put(9, "fox");
		map.put(4, "cat");
		map.put(8, "dog");
		map.put(1, "giraffe");
		map.put(0, "swan");
		map.put(15, "bear");
		map.put(6, "snake");
		System.out.println("----- "+sortofMap+" -------");
		
		for(Integer key: map.keySet()) {
			String value = map.get(key);
			System.out.println(key+ " : "+value);
	
		}
		
	}

}