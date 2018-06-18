package nrw.bieker.java8.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Pupil {
	private int id;
	private String name;
	
	public Pupil(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "id:" +this.id+" name: "+this.name;
	}
	
	
	
}

class StringLengthComparator implements Comparator<String>{

	public int compare(String s1, String s2) {
		int len1 = s1.length();
		int len2 = s2.length();
		if(len1 > len2) {
			return 1;
		}
		if(len1 < len2) {
			return -1;
		}
		return 0;
	}
	
}

class ReverseAlphabeticalComparator implements Comparator<String>{

	public int compare(String s1, String s2) {
		return -s1.compareTo(s2);
	}
	
}

public class SortingLists {

	public static void main(String[] args) {
		List<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("elephant");
		animals.add("tiger");
		animals.add("lion");
		animals.add("mongoose");

		Collections.sort(animals, new ReverseAlphabeticalComparator());
		
		for(String animal: animals) {
			System.out.println(animal);
		}
				
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(1);
		numbers.add(36);
		numbers.add(11);
		numbers.add(49);
		numbers.add(9);
		
		// using an anonymous class in java 
		Collections.sort(numbers, new Comparator<Integer>() {

			// with setting a negative sign it will sort the list in reverse order. 
			public int compare(Integer o1, Integer o2) {
				return -o1.compareTo(o2);
			}
			
		});
		
		
		for(Integer number: numbers) {
			System.out.println(number);
		}
		// Sorting arbitrary objects
		
		List<Pupil> pupils = new ArrayList<Pupil>();
		pupils.add(new Pupil(1,"Joe"));
		pupils.add(new Pupil(3,"Bob"));
		pupils.add(new Pupil(4,"Clare"));
		pupils.add(new Pupil(2,"Sue"));
		pupils.add(new Pupil(5,"Marvin"));
		
		System.out.println("\nSorting for ids");
		Collections.sort(pupils, new Comparator<Pupil>() {

			public int compare(Pupil o1, Pupil o2) {
				if(o1.getId() > o2.getId()) {
					return 1;
				}
				if(o1.getId() < o2.getId()) {
					return -1;
				}
				return 0;
			}
			
		});
		
		for(Pupil pupil: pupils) {
			System.out.println(pupil);
		}
		System.out.println("\nSorting for names");
		Collections.sort(pupils, new Comparator<Pupil>() {

			public int compare(Pupil o1, Pupil o2) {
				return o1.getName().compareTo(o2.getName());			
			}
			
		});
		
		for(Pupil pupil: pupils) {
			System.out.println(pupil);
		}
		
	}
}