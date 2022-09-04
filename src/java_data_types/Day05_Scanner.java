package java_data_types;

import java.util.Scanner;

public class Day05_Scanner {

	public static void main(String[] args) {
		// create an object / instance of the class
		
		// classname objectname = new classname
		Scanner getInput = new Scanner(System.in);
		// get input in the object of the scanner class
		
		System.out.println("Enter the first value : ");
		//scanner class has methods which takes the in value as input
		int aa = getInput.nextInt();
		
		System.out.println("Enter second value : ");
		int bb = getInput.nextInt();
		
		int cc = aa+bb;
		
		System.out.println("The sum is : "+cc );

	}

}
