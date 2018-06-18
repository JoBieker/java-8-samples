package nrw.bieker.java8.collections;

import java.util.ArrayList;
import java.util.List;

public class MeineArrayList {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		
		//Adding
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);
		
		//Retrieving
		System.out.println(numbers.get(0));

		//Index for-Loop iteration
		System.out.println("\nIteration #1: ");
		for(int i=0; i<numbers.size();i++) {
			System.out.println(numbers.get(i));
		}
		System.out.println("\nIteration #2: ");
		for(Integer value: numbers) {
			System.out.println(value);
		}
		
		//Removing items (careful!)
		numbers.remove(numbers.size()-1);
			
		//This is very slow
		// ArrayList will move all following items to fill the gap
		numbers.remove(0);
		
		//Use List interface ...
		List<String> values = new ArrayList<String>();
	}
}