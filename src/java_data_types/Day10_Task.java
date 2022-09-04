package java_data_types;

import java.util.Scanner;

public class Day10_Task {

	public static void main(String[] args) {
		// Write a program which ask user that how many values do they want to do a sum for?
		//lets say user enters 5
		// it should ask user to enter those 5 values
		//once the user enters those 5 values it should print the sum of those 5 values
		//Scanner, Array, one dimensional, for loop
		Scanner getInput = new Scanner(System.in);
		System.out.println("how many total values would you like the sum for");
		int values = getInput.nextInt();
		int[] arr = new int[values];
		int sum = 0;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("Enter the "+(i+1)+" values :" );
			arr[i] = getInput.nextInt();
			
			sum = sum + arr[i]; 
		}
		System.out.println("The Sum of " +arr.length+ " value is : "+sum );
		
	}

}
