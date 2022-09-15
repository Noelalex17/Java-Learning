package java_data_types;

import java.util.ArrayList;
import java.util.Collections;

public class Day31_ArrayList {

	public static void main(String[] args) {
		ArrayList<String> names = new ArrayList<String>(); 
		names.add("John");
		names.add("Mike");
		names.add("Steve");
		names.add("Mike");
		System.out.println(names);
		
		names.add("Chris");
		System.out.println(names);
		names.add(0, "Noel");
		System.out.println(names);
		//removing from list
		names.remove(1);
		System.out.println(names);
		names.remove("Mike");
		System.out.println(names);
		//replacing a name on list
		names.set(0, "Veronica");
		System.out.println(names);
		
		//better to store in a variable index of
		int indexOfChris = names.indexOf("Chris");
		System.out.println(indexOfChris);
		System.out.println(names.indexOf("Chris"));
		names.set(indexOfChris, "Replaced");
		System.out.println(names);
		System.out.println("Sorting the results");
		Collections.sort(names);
		System.out.println(names);
		
		String name = names.get(0);
		System.out.println(name);
		
		System.out.println(names.size());
		
		boolean present = names.contains("Mike");
		System.out.println(present);
		
		//names.clear();
		//System.out.println(names);
		
		for(int i=0;i<names.size();i++) {
			System.out.println(names.get(i));
		}
		
		for(String a : names) {
			System.out.println(a);
		}
		System.out.println("**************************************");
		
		int j=0;
		do {
			System.out.println(names.get(j));
			j++;
		}while(j<names.size());
		
		
		
		

	}

}
