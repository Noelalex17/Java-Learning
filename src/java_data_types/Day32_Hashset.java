package java_data_types;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class Day32_Hashset {

	public static void main(String[] args) {
	
		
		HashSet<Integer> roll_number = new HashSet<Integer>();
		roll_number.add(100);
		roll_number.add(200);
		roll_number.add(1300);
		roll_number.add(100);
		roll_number.add(200);
		roll_number.add(300);
		roll_number.add(400);
		
		
		System.out.println("********HashSet to Araay ********");
		Integer[] rollNum = new Integer[roll_number.size()];
		roll_number.toArray(rollNum);
		System.out.println(rollNum.length);
		for(Integer a : rollNum) {
			System.out.println(a);
		}
		
		
		
		
		System.out.println("**********   HashSet to Array*********");
		
		
		
		
		
		ArrayList<Integer> roll_number_al = new ArrayList<Integer>(roll_number);
		roll_number_al.add(400);
		System.out.println("Using arraylist and adding 400");
		System.out.println(roll_number_al);
		
		
	
		
		
		
		
		
		
		
		
		
		System.out.println(roll_number);
		
		Object roll_numbers_clone =  roll_number.clone();
		System.out.println(roll_numbers_clone);
		
		Boolean present = roll_number.contains(200);
		System.out.println(present);
		
		System.out.println(roll_number.isEmpty());
		
		System.out.println(roll_number.size());
		
		roll_number.remove(1300);
		System.out.println(roll_number);
		
		for(Integer i : roll_number) {
			System.out.println(i);
		
		}
		
		
		

	}

}
