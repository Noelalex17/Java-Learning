package java_data_types;

import java.util.ArrayList;
import java.util.Iterator;

public class Day32_itterator {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
		cars.add("Audi");
		cars.add("BMW");
		cars.add("Subaru");
		cars.add("Toyota");
		cars.add("Honda");
		
		System.out.println(cars);
		Iterator<String> car = cars.iterator();
		
		while(car.hasNext()) {
			System.out.println(car.next());
		}
		
		ArrayList<Integer> rollnum = new ArrayList<Integer>();
		rollnum.add(100);
		rollnum.add(200);
		rollnum.add(300);
		
		Iterator<Integer> rollnumber = rollnum.iterator();
		while(rollnumber.hasNext()) {
			System.out.println(rollnumber.next());
		}
		
		
		
	}

}
