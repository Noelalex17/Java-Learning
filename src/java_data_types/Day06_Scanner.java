package java_data_types;

import java.util.Scanner;

public class Day06_Scanner {

	public static void main(String[] args) {
		// how to create an object
		// classname objectname = new classname();
		
		Scanner takeInput = new Scanner(System.in);
		System.out.println("Enter an int value : ");
		int val1 = takeInput.nextInt();
		System.out.println("The entered value is : "+val1);
		
		//nextBollean (True, False)
		System.out.println("is it raining outside : ");
		boolean val2 =takeInput.nextBoolean(); // True or False 
		System.out.println("If it is true it is raining if it is false it is not raining :" +val2);
		
		//nextLine (String)
		System.out.println("Enter your name");
		String name = takeInput.next();
		System.out.println("The name you entered is "+name);
		
		System.out.println("What is your age");
		byte val3 = takeInput.nextByte();
		System.out.println("The age you entered is :"+val3);
		
		System.out.println("Enter a double value");
		double val4 = takeInput.nextDouble();
		System.out.println("The value you entered for double is : "+val4);
		
		System.out.println("Enter a float vlaue");
		float val5 = takeInput.nextFloat();
		System.out.println("The float value you entered is : "+val5);
		
		

	}

}
